package gh;

import org.telegram.messenger.AndroidUtilities;
public final class w1 implements Runnable {
    public final int f9083a;
    public final k5 f9084b;
    public final long f9085c;

    public w1(k5 k5Var, long j10, int i9) {
        this.f9083a = i9;
        this.f9084b = k5Var;
        this.f9085c = j10;
    }

    @Override
    public final void run() {
        switch (this.f9083a) {
            case 0:
                k5 k5Var = this.f9084b;
                v1 v1Var = k5Var.f8416j1;
                k5Var.q2(1, true, null);
                if (this.f9085c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(v1Var);
                    AndroidUtilities.runOnUIThread(v1Var);
                    return;
                }
                return;
            case 1:
                this.f9084b.X1(this.f9085c);
                return;
            case 2:
                k5.P0(this.f9084b, this.f9085c);
                return;
            case 3:
                k5.d1(this.f9084b, this.f9085c);
                return;
            case 4:
                this.f9084b.X1(this.f9085c);
                return;
            case 5:
                k5.k0(this.f9084b, this.f9085c);
                return;
            case 6:
                this.f9084b.X1(this.f9085c);
                return;
            case 7:
                k5.O(this.f9084b, this.f9085c);
                return;
            case 8:
                this.f9084b.X1(this.f9085c);
                return;
            case 9:
                k5.z0(this.f9084b, this.f9085c);
                return;
            case 10:
                this.f9084b.X1(this.f9085c);
                return;
            default:
                this.f9084b.X1(this.f9085c);
                return;
        }
    }
}
