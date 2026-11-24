package defpackage;

import org.telegram.ui.ActionBar.d;
public final class jp1 implements Runnable {
    public final byte a;
    public final kp1 b;
    public final int c;
    public final boolean d;
    public final t09 e;
    public final float f;
    public final float h;
    public final h19 n;

    public jp1(kp1 kp1Var, int i, boolean z, t09 t09Var, float f, float f2, h19 h19Var, byte b) {
        this.a = b;
        this.b = kp1Var;
        this.c = i;
        this.d = z;
        this.e = t09Var;
        this.f = f;
        this.h = f2;
        this.n = h19Var;
    }

    @Override
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                gl.d3(new jp1(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 1), 50L);
                return;
            default:
                mu1 mu1Var = this.b.s;
                hf0 E6 = mu1Var.E6(this.c, true);
                if (this.d) {
                    i = ((d) mu1Var).currentAccount;
                    d19.d(mu1Var, this.e, E6, null, this.f, this.h, this.n, i, 1);
                    d19.f();
                    return;
                }
                return;
        }
    }
}
