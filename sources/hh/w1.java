package hh;

import org.telegram.messenger.AndroidUtilities;

public final class w1 implements Runnable {

    public final int f10262a;

    public final i5 f10263b;

    public final long f10264c;

    public w1(i5 i5Var, long j10, int i10) {
        this.f10262a = i10;
        this.f10263b = i5Var;
        this.f10264c = j10;
    }

    @Override
    public final void run() {
        switch (this.f10262a) {
            case 0:
                i5 i5Var = this.f10263b;
                v1 v1Var = i5Var.f9470j1;
                i5Var.q2(1, true, null);
                if (this.f10264c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(v1Var);
                    AndroidUtilities.runOnUIThread(v1Var);
                }
                break;
            case 1:
                this.f10263b.X1(this.f10264c);
                break;
            case 2:
                i5.P0(this.f10263b, this.f10264c);
                break;
            case 3:
                i5.d1(this.f10263b, this.f10264c);
                break;
            case 4:
                this.f10263b.X1(this.f10264c);
                break;
            case 5:
                i5.l0(this.f10263b, this.f10264c);
                break;
            case 6:
                this.f10263b.X1(this.f10264c);
                break;
            case 7:
                i5.P(this.f10263b, this.f10264c);
                break;
            case 8:
                this.f10263b.X1(this.f10264c);
                break;
            case 9:
                i5.A0(this.f10263b, this.f10264c);
                break;
            case 10:
                this.f10263b.X1(this.f10264c);
                break;
            default:
                this.f10263b.X1(this.f10264c);
                break;
        }
    }
}
