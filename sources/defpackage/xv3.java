package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RadialProgressView;
public final class xv3 extends vqd {
    public final boolean a;
    public final zv3 b;

    public xv3(zv3 zv3Var, boolean z) {
        this.b = zv3Var;
        this.a = z;
    }

    @Override
    public final void w() {
        String str;
        int intValue;
        zv3 zv3Var = this.b;
        RadialProgressView radialProgressView = zv3Var.r1;
        vv3 vv3Var = zv3Var.l1;
        tvc tvcVar = zv3Var.m1;
        if (this.a && zv3Var.m1.g(zv3Var.E1, null, null, zv3Var.C1, true)) {
            radialProgressView.setVisibility(4);
            vv3Var.setVisibility(4);
            tvcVar.setVisibility(0);
            return;
        }
        radialProgressView.setVisibility(0);
        vv3Var.setVisibility(0);
        zv3Var.t1.setVisibility(0);
        zv3Var.u1.setVisibility(4);
        vv3Var.setKeepScreenOn(true);
        tvcVar.setVisibility(4);
        tvcVar.getControlsView().setVisibility(4);
        tvcVar.getTextureView().setVisibility(4);
        if (tvcVar.getTextureImageView() != null) {
            tvcVar.getTextureImageView().setVisibility(4);
        }
        zv3Var.m1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            String youtubeId = tvcVar.getYoutubeId();
            if (youtubeId != null) {
                zv3Var.q1.setVisibility(0);
                zv3Var.x1 = true;
                vv3Var.addJavascriptInterface(new yv3(zv3Var), "YoutubeProxy");
                String str2 = zv3Var.C1;
                if (str2 != null) {
                    try {
                        Uri parse = Uri.parse(str2);
                        int i = zv3Var.K1;
                        if (i > 0) {
                            str = String.valueOf(i);
                        } else {
                            str = null;
                        }
                        if (str == null && (str = parse.getQueryParameter("t")) == null) {
                            str = parse.getQueryParameter("time_continue");
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    if (str != null) {
                        if (str.contains("m")) {
                            String[] split = str.split("m");
                            intValue = (Utilities.z(split[0]).intValue() * 60) + Utilities.z(split[1]).intValue();
                        } else {
                            intValue = Utilities.z(str).intValue();
                        }
                        zv3Var.l1.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                        return;
                    }
                }
                intValue = 0;
                zv3Var.l1.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                return;
            }
            vv3Var.loadUrl(zv3Var.E1, hashMap);
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final boolean x() {
        zv3 zv3Var = this.b;
        tvc tvcVar = zv3Var.m1;
        boolean z = tvcVar.U;
        if (z) {
            if (z) {
                tvcVar.U = false;
                tvcVar.m();
                tvcVar.l(false);
            }
            return false;
        }
        try {
            zv3Var.s1.getWindow().clearFlags(128);
            return true;
        } catch (Exception e) {
            fc4.g(e, true);
            return true;
        }
    }
}
