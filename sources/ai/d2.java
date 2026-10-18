package ai;

import org.telegram.messenger.AndroidUtilities;
public final class d2 implements Runnable {
    public final int f1127a;
    public final k7 f1128b;
    public final long f1129c;

    public d2(k7 k7Var, long j10, int i10) {
        this.f1127a = i10;
        this.f1128b = k7Var;
        this.f1129c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1127a) {
            case 0:
                this.f1128b.o2(this.f1129c);
                return;
            case 1:
                this.f1128b.o2(this.f1129c);
                return;
            case 2:
                k7 k7Var = this.f1128b;
                b2 b2Var = k7Var.f1696u1;
                k7Var.O2(1, true, null);
                if (this.f1129c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b2Var);
                    AndroidUtilities.runOnUIThread(b2Var);
                    return;
                }
                return;
            case 3:
                this.f1128b.o2(this.f1129c);
                return;
            case 4:
                this.f1128b.o2(this.f1129c);
                return;
            case 5:
                k7.r0(this.f1128b, this.f1129c);
                return;
            case 6:
                k7.p0(this.f1128b, this.f1129c);
                return;
            case 7:
                this.f1128b.o2(this.f1129c);
                return;
            case 8:
                k7.U(this.f1128b, this.f1129c);
                return;
            case 9:
                this.f1128b.o2(this.f1129c);
                return;
            case 10:
                k7.p1(this.f1128b, this.f1129c);
                return;
            case 11:
                this.f1128b.o2(this.f1129c);
                return;
            default:
                k7.F0(this.f1128b, this.f1129c);
                return;
        }
    }
}
