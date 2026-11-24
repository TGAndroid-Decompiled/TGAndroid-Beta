package defpackage;

import android.webkit.JavascriptInterface;
public final class nu3 {
    public final ou3 a;

    public nu3(ou3 ou3Var) {
        this.a = ou3Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            gl.d3(new li3(this, (byte) 17));
        }
    }
}
