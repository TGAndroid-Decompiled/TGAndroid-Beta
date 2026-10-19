package ai;

import org.telegram.messenger.AndroidUtilities;
public final class e2 implements Runnable {
    public final int f1188a;
    public final l7 f1189b;
    public final long f1190c;

    public e2(l7 l7Var, long j10, int i10) {
        this.f1188a = i10;
        this.f1189b = l7Var;
        this.f1190c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1188a) {
            case 0:
                this.f1189b.v2(this.f1190c);
                return;
            case 1:
                this.f1189b.v2(this.f1190c);
                return;
            case 2:
                l7 l7Var = this.f1189b;
                d2 d2Var = l7Var.f1757u1;
                l7Var.V2(1, true, null);
                if (this.f1190c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(d2Var);
                    AndroidUtilities.runOnUIThread(d2Var);
                    return;
                }
                return;
            case 3:
                this.f1189b.v2(this.f1190c);
                return;
            case 4:
                this.f1189b.v2(this.f1190c);
                return;
            case 5:
                l7.q0(this.f1189b, this.f1190c);
                return;
            case 6:
                l7.V0(this.f1189b, this.f1190c);
                return;
            case 7:
                this.f1189b.v2(this.f1190c);
                return;
            case 8:
                l7.U(this.f1189b, this.f1190c);
                return;
            case 9:
                this.f1189b.v2(this.f1190c);
                return;
            case 10:
                l7.q1(this.f1189b, this.f1190c);
                return;
            case 11:
                this.f1189b.v2(this.f1190c);
                return;
            default:
                l7.J0(this.f1189b, this.f1190c);
                return;
        }
    }
}
