package ai;

import org.telegram.messenger.AndroidUtilities;
public final class e2 implements Runnable {
    public final int f1181a;
    public final l7 f1182b;
    public final long f1183c;

    public e2(l7 l7Var, long j10, int i10) {
        this.f1181a = i10;
        this.f1182b = l7Var;
        this.f1183c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1181a) {
            case 0:
                this.f1182b.u2(this.f1183c);
                return;
            case 1:
                this.f1182b.u2(this.f1183c);
                return;
            case 2:
                l7 l7Var = this.f1182b;
                d2 d2Var = l7Var.f1749u1;
                l7Var.U2(1, true, null);
                if (this.f1183c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(d2Var);
                    AndroidUtilities.runOnUIThread(d2Var);
                    return;
                }
                return;
            case 3:
                this.f1182b.u2(this.f1183c);
                return;
            case 4:
                this.f1182b.u2(this.f1183c);
                return;
            case 5:
                l7.p0(this.f1182b, this.f1183c);
                return;
            case 6:
                l7.U0(this.f1182b, this.f1183c);
                return;
            case 7:
                this.f1182b.u2(this.f1183c);
                return;
            case 8:
                l7.T(this.f1182b, this.f1183c);
                return;
            case 9:
                this.f1182b.u2(this.f1183c);
                return;
            case 10:
                l7.p1(this.f1182b, this.f1183c);
                return;
            case 11:
                this.f1182b.u2(this.f1183c);
                return;
            default:
                l7.I0(this.f1182b, this.f1183c);
                return;
        }
    }
}
