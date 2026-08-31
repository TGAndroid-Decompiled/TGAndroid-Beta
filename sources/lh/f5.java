package lh;

import org.telegram.messenger.AndroidUtilities;
public final class f5 implements Runnable {
    public final int f12743a;
    public final q5 f12744b;

    public f5(q5 q5Var, int i10) {
        this.f12743a = i10;
        this.f12744b = q5Var;
    }

    @Override
    public final void run() {
        switch (this.f12743a) {
            case 0:
                this.f12744b.Z();
                return;
            default:
                q5 q5Var = this.f12744b;
                q5Var.f12912f0.N(true);
                AndroidUtilities.runOnUIThread(new f5(q5Var, 0), 150L);
                return;
        }
    }
}
