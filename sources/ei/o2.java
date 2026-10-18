package ei;

import org.telegram.messenger.AndroidUtilities;
public final class o2 implements Runnable {
    public final int f9546a;
    public final s2 f9547b;
    public final ai.r0 f9548c;

    public o2(s2 s2Var, ai.r0 r0Var, int i10) {
        this.f9546a = i10;
        this.f9547b = s2Var;
        this.f9548c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f9546a) {
            case 0:
                s2 s2Var = this.f9547b;
                s2Var.getClass();
                AndroidUtilities.runOnUIThread(new o2(s2Var, this.f9548c, 1), 320L);
                return;
            default:
                s2 s2Var2 = this.f9547b;
                s2Var2.getClass();
                this.f9548c.run(new ai.r0(s2Var2, 14));
                return;
        }
    }
}
