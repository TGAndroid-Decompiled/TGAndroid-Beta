package defpackage;

import android.webkit.JavascriptInterface;
public final class hv3 {
    public final iv3 a;

    public hv3(iv3 iv3Var) {
        this.a = iv3Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            hl.c3(new zg3(this, (byte) 26));
        }
    }
}
