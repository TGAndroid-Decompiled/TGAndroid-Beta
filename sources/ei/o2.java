package ei;

import org.telegram.messenger.AndroidUtilities;
public final class o2 implements Runnable {
    public final int f9547a;
    public final s2 f9548b;
    public final ai.r0 f9549c;

    public o2(s2 s2Var, ai.r0 r0Var, int i10) {
        this.f9547a = i10;
        this.f9548b = s2Var;
        this.f9549c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f9547a) {
            case 0:
                s2 s2Var = this.f9548b;
                s2Var.getClass();
                AndroidUtilities.runOnUIThread(new o2(s2Var, this.f9549c, 1), 320L);
                return;
            default:
                s2 s2Var2 = this.f9548b;
                s2Var2.getClass();
                this.f9549c.run(new ai.r0(s2Var2, 14));
                return;
        }
    }
}
