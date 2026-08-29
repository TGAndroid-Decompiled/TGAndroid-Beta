package ih;

import org.telegram.messenger.AndroidUtilities;
public final class f5 implements Runnable {
    public final int f9157a;
    public final q5 f9158b;

    public f5(q5 q5Var, int i10) {
        this.f9157a = i10;
        this.f9158b = q5Var;
    }

    @Override
    public final void run() {
        switch (this.f9157a) {
            case 0:
                this.f9158b.Z();
                return;
            default:
                q5 q5Var = this.f9158b;
                q5Var.f9343e0.N(true);
                AndroidUtilities.runOnUIThread(new f5(q5Var, 0), 150L);
                return;
        }
    }
}
