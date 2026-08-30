package lh;

import org.telegram.messenger.AndroidUtilities;
public final class u1 implements Runnable {
    public final int f13188a;
    public final g5 f13189b;
    public final long f13190c;

    public u1(g5 g5Var, long j10, int i10) {
        this.f13188a = i10;
        this.f13189b = g5Var;
        this.f13190c = j10;
    }

    @Override
    public final void run() {
        switch (this.f13188a) {
            case 0:
                g5 g5Var = this.f13189b;
                t1 t1Var = g5Var.f12487k1;
                g5Var.q2(1, true, null);
                if (this.f13190c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(t1Var);
                    AndroidUtilities.runOnUIThread(t1Var);
                    return;
                }
                return;
            case 1:
                this.f13189b.X1(this.f13190c);
                return;
            case 2:
                g5.P0(this.f13189b, this.f13190c);
                return;
            case 3:
                g5.d1(this.f13189b, this.f13190c);
                return;
            case 4:
                this.f13189b.X1(this.f13190c);
                return;
            case 5:
                g5.l0(this.f13189b, this.f13190c);
                return;
            case 6:
                this.f13189b.X1(this.f13190c);
                return;
            case 7:
                g5.P(this.f13189b, this.f13190c);
                return;
            case 8:
                this.f13189b.X1(this.f13190c);
                return;
            case 9:
                g5.A0(this.f13189b, this.f13190c);
                return;
            case 10:
                this.f13189b.X1(this.f13190c);
                return;
            default:
                this.f13189b.X1(this.f13190c);
                return;
        }
    }
}
