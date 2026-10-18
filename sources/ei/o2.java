package ei;

import org.telegram.messenger.AndroidUtilities;
public final class o2 implements Runnable {
    public final int f9548a;
    public final s2 f9549b;
    public final ai.r0 f9550c;

    public o2(s2 s2Var, ai.r0 r0Var, int i10) {
        this.f9548a = i10;
        this.f9549b = s2Var;
        this.f9550c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f9548a) {
            case 0:
                s2 s2Var = this.f9549b;
                s2Var.getClass();
                AndroidUtilities.runOnUIThread(new o2(s2Var, this.f9550c, 1), 320L);
                return;
            default:
                s2 s2Var2 = this.f9549b;
                s2Var2.getClass();
                this.f9550c.run(new ai.r0(s2Var2, 14));
                return;
        }
    }
}
