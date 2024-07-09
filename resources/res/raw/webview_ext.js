const getBackgroundColor = () => {
    const style = window.getComputedStyle(document.body, null);
    const backgroundColor = style.getPropertyValue('background-color');
    return backgroundColor;
};
const cssColorToHex = color => {
    const colorMatch = color.match(/^rgba?\((\d+),\s*(\d+),\s*(\d+)(?:,\s*(\d+(?:\.\d+)?))?\)$/);
    if (!colorMatch) return null;
    return [parseInt(colorMatch[1]), parseInt(colorMatch[2]), parseInt(colorMatch[3]), colorMatch[4] ? parseFloat(colorMatch[4]) : 1];
};
let __lastColor;
const postBackgroundChange = () => {
    const color = JSON.stringify(cssColorToHex(getBackgroundColor()));
    if (__lastColor != color) {
        window.TelegramWebview.post("background", __lastColor = color);
    }
};
const backgroundObserver = new MutationObserver(() => {
    postBackgroundChange();
    setTimeout(postBackgroundChange, 500);
});
backgroundObserver.observe(document, { attributes: true });
backgroundObserver.observe(document.body, { attributes: true });
postBackgroundChange();
