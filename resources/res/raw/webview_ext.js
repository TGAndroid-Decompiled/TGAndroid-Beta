/*
 *  Telegram-Android browser extension
 *
 *  # Gestures
 *  This script captures whether touch event is consumed by a website, to otherwise apply
 *  down or right gesture. Use `event.preventDefault()` at `touchstart` to prevent those gestures.
 *  It is recommended to do `event.preventDefault()` when dragging or swiping is expected to be
 *  handled by a website.
 *  Since some websites don't do that, ths script also captures `style` and `class` changes to
 *  hierarchy of touch element, and does equivalent of `preventDefault` if those changes happens while
 *  `touchstart` and `touchmove` events.
 *
 *  # Action Bar and Navigation Bar colors
 *  Top action bar and bottom navigation bar colors are defined with:
 *    - <meta name="theme-color" content="#FFFFFF" /> — action bar, usually an accent color
 *    - <meta name="theme-background-color" content="#FFFFFF" /> — navigation bar
 *    - <body> `background-color` css style — fallback
 *  `media` attribute on <meta> is also supported, feel free to use `prefers-color-scheme`
 *
 *  TODO(@dkaraush): apply same logic for miniapps
 */

if (!window.__tg__webview_set) {
    window.__tg__webview_set = true;
    (function () {

        // Touch gestures hacks
        const isImageViewer = () => {
            if (!document.body.children || document.body.children.length != 1) return false;
            const img = document.querySelector('body > img');
            return img && img.tagName && img.tagName.toLowerCase() === 'img' && img.src === window.location.href;
        }
        let prevented = false;
        let awaitingResponse = false;
        let touchElement = null;
        let mutatedWhileTouch = false;
        let whiletouchstart = false, whiletouchmove = false;
        document.addEventListener('touchstart', e => {
            touchElement = e.target;
            awaitingResponse = true;
            whiletouchstart = true;
            if (isImageViewer()) {
                if (window.TelegramWebview) {
                    console.log({ v: window.visualViewport });
                    window.TelegramWebview.post('allowScroll', JSON.stringify([
                        window.visualViewport && window.visualViewport.offsetLeft == 0,
                        window.visualViewport && window.visualViewport.offsetTop == 0
                    ]));
                }
                awaitingResponse = false;
            }
        }, true);
        document.addEventListener('touchstart', e => {
            whiletouchstart = false;
        }, false);
        document.addEventListener('touchmove', e => {
            whiletouchstart = false;
            whiletouchmove = true;
            if (awaitingResponse) {
                setTimeout(() => {
                    if (awaitingResponse) {
                        if (window.TelegramWebview) {
                            window.TelegramWebview.post('allowScroll', JSON.stringify([
                                !prevented && !mutatedWhileTouch,
                                !prevented && !mutatedWhileTouch
                            ]));
                        }
                        prevented = false;
                        awaitingResponse = false;
                    }
                    mutatedWhileTouch = false;
                }, 16);
            }
        }, true);
        document.addEventListener('touchmove', e => {
            whiletouchmove = false;
        }, false);
        document.addEventListener('scroll', e => {
            if (!e.target) return;
            const allowScrollX = e.target.scrollLeft == 0 && !prevented && !mutatedWhileTouch;
            const allowScrollY = e.target.scrollTop == 0  && !prevented && !mutatedWhileTouch;
            if (awaitingResponse) {
                if (window.TelegramWebview) {
                    window.TelegramWebview.post('allowScroll', JSON.stringify([allowScrollX, allowScrollY]));
                }
                awaitingResponse = false;
            }
            prevented = false;
            mutatedWhileTouch = false;
        }, true);
        if (TouchEvent) {
            const originalPreventDefault = TouchEvent.prototype.preventDefault;
            TouchEvent.prototype.preventDefault = function () {
                prevented = true;
                originalPreventDefault.call(this);
            };
            const originalStopPropagation = TouchEvent.prototype.stopPropagation;
            TouchEvent.prototype.stopPropagation = function () {
                if (this.type === 'touchmove') {
                    whiletouchmove = false;
                } else if (this.type === 'touchstart') {
                    whiletouchstart = false;
                }
                originalStopPropagation.call(this);
            };
        }
        const isParentOf = (e, p) => {
            if (!e || !p) return false;
            if (e == p) return true;
            return isParentOf(e.parentElement, p);
        }
        new MutationObserver(mutationList => {
            const isTouchElement = touchElement && !![...(mutationList||[])]
                .filter(r => r && (r.attributeName === 'style' || r.attributeName === 'class'))
                .map(r => r.target)
                .filter(e => !!e)
                .find(e => isParentOf(touchElement, e));
            const isImageViewer = touchElement && touchElement.tagName && touchElement.tagName.toLowerCase() === 'img' && touchElement.src === window.location.href;
            if (isTouchElement) { // && (whiletouchstart || whiletouchmove)) {
                mutatedWhileTouch = true;
            }
        }).observe(document, { attributes: true, childList: true, subtree: true });

        // Retrieving colors
        const __tg__backgroundColor = () => {
            try {
                return window.getComputedStyle(document.body, null).getPropertyValue('background-color');
            } catch (e) {
                return null;
            }
        }
        const __tg__themeColor = () =>
            [...document.querySelectorAll('meta[name="theme-color"]')]
                .filter(meta => !meta.media || window.matchMedia && window.matchMedia(meta.media).matches)
                .map(meta => meta.content)[0];
        const __tg__themeBackgroundColor = () =>
            [...document.querySelectorAll('meta[name="theme-background-color"]')]
                .filter(meta => !meta.media || window.matchMedia && window.matchMedia(meta.media).matches)
                .map(meta => meta.content)[0];
        const __tg__cssColorToRGBA = color => {
            if (!color) return null;
            if (color[0] === '#') {
                let hex = color.slice(1);
                if (hex.length === 3 || hex.length === 4) {
                    hex = hex.split('').map(char => char + char).join('');
                }
                return [parseInt(hex.slice(0,2), 16), parseInt(hex.slice(2,4), 16), parseInt(hex.slice(4,6), 16), hex.length <= 6 ? 1 : parseInt(hex.slice(6,8), 16) / 255];
            }
            const colorMatch = color.match(/^rgba?\((\d+),\s*(\d+),\s*(\d+)(?:,\s*(\d+(?:\.\d+)?))?\)$/);
            if (colorMatch) {
                return [parseInt(colorMatch[1]), parseInt(colorMatch[2]), parseInt(colorMatch[3]), colorMatch[4] ? parseFloat(colorMatch[4]) : 1];
            }
            return null;
        };
        let __tg__lastActionBarColor, __tg__lastNavigationBarColor;
        window.__tg__postColorsChange = () => {
            const actionBarColor =     JSON.stringify(__tg__cssColorToRGBA(__tg__themeColor() || __tg__backgroundColor()));
            const navigationBarColor = JSON.stringify(__tg__cssColorToRGBA(__tg__themeBackgroundColor() || __tg__backgroundColor()));
            if (window.TelegramWebview) {
                if (actionBarColor != __tg__lastActionBarColor)
                    window.TelegramWebview.post("actionBarColor", __tg__lastActionBarColor = actionBarColor);
                if (navigationBarColor != __tg__lastNavigationBarColor)
                    window.TelegramWebview.post("navigationBarColor", __tg__lastNavigationBarColor = navigationBarColor);
            }
        };
        const __tg__colorsObserver = new MutationObserver(() => {
            window.__tg__postColorsChange();
            setTimeout(window.__tg__postColorsChange, 500);
        });
        window.__tg__listenColors = () => {
            [
                document,
                document.body,
                ...document.querySelectorAll('meta[name="theme-color"]'),
                ...document.querySelectorAll('meta[name="theme-background-color"]')
            ].filter(e => !!e).map(e => __tg__colorsObserver.observe(e, { attributes: true }));
            if (window.matchMedia) {
                window.matchMedia('(prefers-color-scheme: light)').addEventListener('change', () => window.__tg__postColorsChange());
                window.matchMedia('(prefers-color-scheme: dark)').addEventListener('change', () => window.__tg__postColorsChange());
            }
        };
        window.__tg__listenColors();
        window.addEventListener('ready', __tg__listenColors, true);
        window.__tg__postColorsChange();

        // DownloadManager in WebView gives me blob url with no way to download it :(
        // getting array buffer through js injection
        window.__tg__resolveBlob = (url) => {
            fetch(url)
                .then(r => r.blob())
                .then(blob => {
                    blob.arrayBuffer().then(buffer => {
                        if (window.TelegramWebview) {
                            window.TelegramWebview.resolveBlob(url, Array.from(new Uint8Array(buffer)), blob.type);
                        }
                    })
                });
        };
    })();
};

setTimeout(function () {
    const site_name = (
        (document.querySelector('meta[property="og:site_name"]') || {}).content ||
        (document.querySelector('meta[property="og:title"]') || {}).content
    );
    if (window.TelegramWebview && window.TelegramWebview.post) {
        if (site_name) {
            window.TelegramWebview.post('siteName', site_name);
        } else {
            window.TelegramWebview.post('siteNameEmpty');
        }
    }
    if (window.__tg__listenColors) {
        window.__tg__listenColors();
    }
    if (window.__tg__postColorsChange) {
        window.__tg__postColorsChange();
    }
}, 10);