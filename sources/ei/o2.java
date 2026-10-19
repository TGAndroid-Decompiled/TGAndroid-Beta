package ei;

import org.telegram.messenger.AndroidUtilities;
public final class o2 implements Runnable {
    public final int f9545a;
    public final s2 f9546b;
    public final ai.r0 f9547c;

    public o2(s2 s2Var, ai.r0 r0Var, int i10) {
        this.f9545a = i10;
        this.f9546b = s2Var;
        this.f9547c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f9545a) {
            case 0:
                s2 s2Var = this.f9546b;
                s2Var.getClass();
                AndroidUtilities.runOnUIThread(new o2(s2Var, this.f9547c, 1), 320L);
                return;
            default:
                s2 s2Var2 = this.f9546b;
                s2Var2.getClass();
                this.f9547c.run(new ai.r0(s2Var2, 14));
                return;
        }
    }
}
