package defpackage;

import android.webkit.JavascriptInterface;
public final class ac8 {
    public final ya8 a;

    public ac8(ya8 ya8Var) {
        this.a = ya8Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        gm.c3(new ge7(this, Integer.parseInt(str), (byte) 6));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        gm.c3(new yb8(this, (byte) 0));
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
        ya8 ya8Var = this.a;
        ya8Var.I = i * 1000;
        String str = ya8Var.s;
        if (str != null) {
            ya8Var.g(str);
            ya8Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z;
        int i;
        int parseInt = Integer.parseInt(str);
        ya8 ya8Var = this.a;
        boolean z2 = ya8Var.H;
        boolean z3 = false;
        if (parseInt != 1 && parseInt != 3) {
            z = false;
        } else {
            z = true;
        }
        ya8Var.H = z;
        ya8Var.a(z2);
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
        if (i == 3 && ya8Var.h.getVisibility() != 4) {
            gm.d3(new yb8(this, (byte) 1), 300L);
        }
        gm.c3(new sr6(this, z3, i, (byte) 1));
    }
}
