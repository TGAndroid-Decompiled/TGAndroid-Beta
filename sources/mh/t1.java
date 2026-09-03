package mh;

import org.telegram.messenger.AndroidUtilities;
public final class t1 implements Runnable {
    public final int f14788a;
    public final g5 f14789b;
    public final long f14790c;

    public t1(g5 g5Var, long j10, int i10) {
        this.f14788a = i10;
        this.f14789b = g5Var;
        this.f14790c = j10;
    }

    @Override
    public final void run() {
        switch (this.f14788a) {
            case 0:
                g5 g5Var = this.f14789b;
                s1 s1Var = g5Var.f14106k1;
                g5Var.q2(1, true, null);
                if (this.f14790c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(s1Var);
                    AndroidUtilities.runOnUIThread(s1Var);
                    return;
                }
                return;
            case 1:
                this.f14789b.X1(this.f14790c);
                return;
            case 2:
                g5.P0(this.f14789b, this.f14790c);
                return;
            case 3:
                g5.d1(this.f14789b, this.f14790c);
                return;
            case 4:
                this.f14789b.X1(this.f14790c);
                return;
            case 5:
                g5.l0(this.f14789b, this.f14790c);
                return;
            case 6:
                this.f14789b.X1(this.f14790c);
                return;
            case 7:
                g5.P(this.f14789b, this.f14790c);
                return;
            case 8:
                this.f14789b.X1(this.f14790c);
                return;
            case 9:
                g5.A0(this.f14789b, this.f14790c);
                return;
            case 10:
                this.f14789b.X1(this.f14790c);
                return;
            default:
                this.f14789b.X1(this.f14790c);
                return;
        }
    }
}
