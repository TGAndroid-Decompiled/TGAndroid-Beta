package defpackage;

import android.webkit.JavascriptInterface;
public final class pd8 {
    public final nc8 a;

    public pd8(nc8 nc8Var) {
        this.a = nc8Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        hl.c3(new me7(this, Integer.parseInt(str), (byte) 7));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        hl.c3(new nd8(this, (byte) 0));
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
        nc8 nc8Var = this.a;
        nc8Var.I = i * 1000;
        String str = nc8Var.s;
        if (str != null) {
            nc8Var.g(str);
            nc8Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z;
        int i;
        int parseInt = Integer.parseInt(str);
        nc8 nc8Var = this.a;
        boolean z2 = nc8Var.H;
        boolean z3 = false;
        if (parseInt != 1 && parseInt != 3) {
            z = false;
        } else {
            z = true;
        }
        nc8Var.H = z;
        nc8Var.a(z2);
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
        if (i == 3 && nc8Var.h.getVisibility() != 4) {
            hl.d3(new nd8(this, (byte) 1), 300L);
        }
        hl.c3(new wr6(this, z3, i, (byte) 1));
    }
}
