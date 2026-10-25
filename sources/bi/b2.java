package bi;

import org.telegram.messenger.AndroidUtilities;
public final class b2 implements Runnable {
    public final int f4328a;
    public final h7 f4329b;
    public final long f4330c;

    public b2(h7 h7Var, long j10, int i10) {
        this.f4328a = i10;
        this.f4329b = h7Var;
        this.f4330c = j10;
    }

    @Override
    public final void run() {
        switch (this.f4328a) {
            case 0:
                this.f4329b.u2(this.f4330c);
                return;
            case 1:
                this.f4329b.u2(this.f4330c);
                return;
            case 2:
                h7 h7Var = this.f4329b;
                a2 a2Var = h7Var.f4766u1;
                h7Var.U2(1, true, null);
                if (this.f4330c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(a2Var);
                    AndroidUtilities.runOnUIThread(a2Var);
                    return;
                }
                return;
            case 3:
                this.f4329b.u2(this.f4330c);
                return;
            case 4:
                this.f4329b.u2(this.f4330c);
                return;
            case 5:
                h7.p0(this.f4329b, this.f4330c);
                return;
            case 6:
                h7.U0(this.f4329b, this.f4330c);
                return;
            case 7:
                this.f4329b.u2(this.f4330c);
                return;
            case 8:
                h7.T(this.f4329b, this.f4330c);
                return;
            case 9:
                this.f4329b.u2(this.f4330c);
                return;
            case 10:
                h7.p1(this.f4329b, this.f4330c);
                return;
            case 11:
                this.f4329b.u2(this.f4330c);
                return;
            default:
                h7.I0(this.f4329b, this.f4330c);
                return;
        }
    }
}
