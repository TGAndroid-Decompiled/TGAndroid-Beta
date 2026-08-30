package kh;

import org.telegram.messenger.AndroidUtilities;
public final class f5 implements Runnable {
    public final int f10604a;
    public final q5 f10605b;

    public f5(q5 q5Var, int i10) {
        this.f10604a = i10;
        this.f10605b = q5Var;
    }

    @Override
    public final void run() {
        switch (this.f10604a) {
            case 0:
                this.f10605b.Z();
                return;
            default:
                q5 q5Var = this.f10605b;
                q5Var.f10769f0.N(true);
                AndroidUtilities.runOnUIThread(new f5(q5Var, 0), 150L);
                return;
        }
    }
}
