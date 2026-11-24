package defpackage;

import android.webkit.JavascriptInterface;
public final class z98 {
    public final x88 a;

    public z98(x88 x88Var) {
        this.a = x88Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        gl.c3(new on7(this, Integer.parseInt(str), (byte) 4));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        gl.c3(new x98(this, (byte) 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f) {
        this.a.K = f;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i) {
        this.a.J = i * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i) {
        x88 x88Var = this.a;
        x88Var.I = i * 1000;
        String str = x88Var.s;
        if (str != null) {
            x88Var.g(str);
            x88Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z;
        int i;
        int parseInt = Integer.parseInt(str);
        x88 x88Var = this.a;
        boolean z2 = x88Var.H;
        boolean z3 = false;
        if (parseInt != 1 && parseInt != 3) {
            z = false;
        } else {
            z = true;
        }
        x88Var.H = z;
        x88Var.a(z2);
        if (parseInt != 0) {
            if (parseInt != 1) {
                i = 2;
                if (parseInt != 2) {
                    if (parseInt != 3) {
                        i = 1;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 3;
            }
            z3 = true;
        } else {
            i = 4;
        }
        if (i == 3 && x88Var.h.getVisibility() != 4) {
            gl.d3(new x98(this, (byte) 1), 300L);
        }
        gl.c3(new sp6(this, z3, i, (byte) 1));
    }
}
