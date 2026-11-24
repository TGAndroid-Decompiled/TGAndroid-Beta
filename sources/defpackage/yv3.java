package defpackage;

import android.webkit.JavascriptInterface;
public final class yv3 {
    public final zv3 a;

    public yv3(zv3 zv3Var) {
        this.a = zv3Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            gm.c3(new bi3(this, (byte) 22));
        }
    }
}
