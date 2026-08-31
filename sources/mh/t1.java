package mh;

import org.telegram.messenger.AndroidUtilities;
public final class t1 implements Runnable {
    public final int f14786a;
    public final g5 f14787b;
    public final long f14788c;

    public t1(g5 g5Var, long j10, int i10) {
        this.f14786a = i10;
        this.f14787b = g5Var;
        this.f14788c = j10;
    }

    @Override
    public final void run() {
        switch (this.f14786a) {
            case 0:
                g5 g5Var = this.f14787b;
                s1 s1Var = g5Var.f14104k1;
                g5Var.q2(1, true, null);
                if (this.f14788c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(s1Var);
                    AndroidUtilities.runOnUIThread(s1Var);
                    return;
                }
                return;
            case 1:
                this.f14787b.X1(this.f14788c);
                return;
            case 2:
                g5.P0(this.f14787b, this.f14788c);
                return;
            case 3:
                g5.d1(this.f14787b, this.f14788c);
                return;
            case 4:
                this.f14787b.X1(this.f14788c);
                return;
            case 5:
                g5.l0(this.f14787b, this.f14788c);
                return;
            case 6:
                this.f14787b.X1(this.f14788c);
                return;
            case 7:
                g5.P(this.f14787b, this.f14788c);
                return;
            case 8:
                this.f14787b.X1(this.f14788c);
                return;
            case 9:
                g5.A0(this.f14787b, this.f14788c);
                return;
            case 10:
                this.f14787b.X1(this.f14788c);
                return;
            default:
                this.f14787b.X1(this.f14788c);
                return;
        }
    }
}
