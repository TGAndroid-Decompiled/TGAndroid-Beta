package defpackage;

import org.telegram.ui.ActionBar.d;
public final class wq1 implements Runnable {
    public final byte a;
    public final xq1 b;
    public final int c;
    public final boolean d;
    public final v29 e;
    public final float f;
    public final float h;
    public final k39 n;

    public wq1(xq1 xq1Var, int i, boolean z, v29 v29Var, float f, float f2, k39 k39Var, byte b) {
        this.a = b;
        this.b = xq1Var;
        this.c = i;
        this.d = z;
        this.e = v29Var;
        this.f = f;
        this.h = f2;
        this.n = k39Var;
    }

    @Override
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                gm.d3(new wq1(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 1), 50L);
                return;
            default:
                yv1 yv1Var = this.b.s;
                hg0 L6 = yv1Var.L6(this.c, true);
                if (this.d) {
                    i = ((d) yv1Var).currentAccount;
                    g39.d(yv1Var, this.e, L6, null, this.f, this.h, this.n, i, 1);
                    g39.f();
                    return;
                }
                return;
        }
    }
}
