package defpackage;

import org.telegram.ui.ActionBar.e;
public final class xp1 implements Runnable {
    public final byte a;
    public final yp1 b;
    public final int c;
    public final boolean d;
    public final i49 e;
    public final float f;
    public final float h;
    public final w49 n;

    public xp1(yp1 yp1Var, int i, boolean z, i49 i49Var, float f, float f2, w49 w49Var, byte b) {
        this.a = b;
        this.b = yp1Var;
        this.c = i;
        this.d = z;
        this.e = i49Var;
        this.f = f;
        this.h = f2;
        this.n = w49Var;
    }

    @Override
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                hl.d3(new xp1(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 1), 50L);
                return;
            default:
                zu1 zu1Var = this.b.s;
                jf0 L6 = zu1Var.L6(this.c, true);
                if (this.d) {
                    i = ((e) zu1Var).currentAccount;
                    s49.d(zu1Var, this.e, L6, null, this.f, this.h, this.n, i, 1);
                    s49.f();
                    return;
                }
                return;
        }
    }
}
