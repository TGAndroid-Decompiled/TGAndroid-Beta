package jh;

import org.telegram.messenger.AndroidUtilities;
public final class u1 implements Runnable {
    public final int f12885a;
    public final h5 f12886b;
    public final long f12887c;

    public u1(h5 h5Var, long j10, int i10) {
        this.f12885a = i10;
        this.f12886b = h5Var;
        this.f12887c = j10;
    }

    @Override
    public final void run() {
        switch (this.f12885a) {
            case 0:
                h5 h5Var = this.f12886b;
                t1 t1Var = h5Var.f12182j1;
                h5Var.q2(1, true, null);
                if (this.f12887c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(t1Var);
                    AndroidUtilities.runOnUIThread(t1Var);
                    return;
                }
                return;
            case 1:
                this.f12886b.X1(this.f12887c);
                return;
            case 2:
                h5.P0(this.f12886b, this.f12887c);
                return;
            case 3:
                h5.d1(this.f12886b, this.f12887c);
                return;
            case 4:
                this.f12886b.X1(this.f12887c);
                return;
            case 5:
                h5.l0(this.f12886b, this.f12887c);
                return;
            case 6:
                this.f12886b.X1(this.f12887c);
                return;
            case 7:
                h5.P(this.f12886b, this.f12887c);
                return;
            case 8:
                this.f12886b.X1(this.f12887c);
                return;
            case 9:
                h5.A0(this.f12886b, this.f12887c);
                return;
            case 10:
                this.f12886b.X1(this.f12887c);
                return;
            default:
                this.f12886b.X1(this.f12887c);
                return;
        }
    }
}
