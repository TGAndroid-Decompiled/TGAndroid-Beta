package ai;

import org.telegram.messenger.AndroidUtilities;
public final class d2 implements Runnable {
    public final int f1132a;
    public final k7 f1133b;
    public final long f1134c;

    public d2(k7 k7Var, long j10, int i10) {
        this.f1132a = i10;
        this.f1133b = k7Var;
        this.f1134c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1132a) {
            case 0:
                this.f1133b.m2(this.f1134c);
                return;
            case 1:
                this.f1133b.m2(this.f1134c);
                return;
            case 2:
                k7 k7Var = this.f1133b;
                b2 b2Var = k7Var.f1704u1;
                k7Var.M2(1, true, null);
                if (this.f1134c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b2Var);
                    AndroidUtilities.runOnUIThread(b2Var);
                    return;
                }
                return;
            case 3:
                this.f1133b.m2(this.f1134c);
                return;
            case 4:
                this.f1133b.m2(this.f1134c);
                return;
            case 5:
                k7.t0(this.f1133b, this.f1134c);
                return;
            case 6:
                k7.p0(this.f1133b, this.f1134c);
                return;
            case 7:
                this.f1133b.m2(this.f1134c);
                return;
            case 8:
                k7.V(this.f1133b, this.f1134c);
                return;
            case 9:
                this.f1133b.m2(this.f1134c);
                return;
            case 10:
                k7.n1(this.f1133b, this.f1134c);
                return;
            case 11:
                this.f1133b.m2(this.f1134c);
                return;
            default:
                k7.H0(this.f1133b, this.f1134c);
                return;
        }
    }
}
