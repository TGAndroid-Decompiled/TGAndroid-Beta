package defpackage;

import android.webkit.JavascriptInterface;
public final class suc {
    public final tuc a;

    public suc(tuc tucVar) {
        this.a = tucVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        gl.c3(new isc(this, str, (byte) 9));
    }
}
