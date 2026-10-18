package ai;

import org.telegram.messenger.AndroidUtilities;
public final class e2 implements Runnable {
    public final int f1197a;
    public final k7 f1198b;
    public final long f1199c;

    public e2(k7 k7Var, long j10, int i10) {
        this.f1197a = i10;
        this.f1198b = k7Var;
        this.f1199c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1197a) {
            case 0:
                this.f1198b.o2(this.f1199c);
                return;
            case 1:
                this.f1198b.o2(this.f1199c);
                return;
            case 2:
                k7 k7Var = this.f1198b;
                d2 d2Var = k7Var.f1690u1;
                k7Var.O2(1, true, null);
                if (this.f1199c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(d2Var);
                    AndroidUtilities.runOnUIThread(d2Var);
                    return;
                }
                return;
            case 3:
                this.f1198b.o2(this.f1199c);
                return;
            case 4:
                this.f1198b.o2(this.f1199c);
                return;
            case 5:
                k7.s0(this.f1198b, this.f1199c);
                return;
            case 6:
                k7.p0(this.f1198b, this.f1199c);
                return;
            case 7:
                this.f1198b.o2(this.f1199c);
                return;
            case 8:
                k7.V(this.f1198b, this.f1199c);
                return;
            case 9:
                this.f1198b.o2(this.f1199c);
                return;
            case 10:
                k7.p1(this.f1198b, this.f1199c);
                return;
            case 11:
                this.f1198b.o2(this.f1199c);
                return;
            default:
                k7.I0(this.f1198b, this.f1199c);
                return;
        }
    }
}
