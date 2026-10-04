package ci;

import org.telegram.messenger.AndroidUtilities;
public final class t2 implements Runnable {
    public final int f5956a;
    public final x2 f5957b;
    public final ai.y1 f5958c;

    public t2(x2 x2Var, ai.y1 y1Var, int i10) {
        this.f5956a = i10;
        this.f5957b = x2Var;
        this.f5958c = y1Var;
    }

    @Override
    public final void run() {
        switch (this.f5956a) {
            case 0:
                x2 x2Var = this.f5957b;
                x2Var.getClass();
                AndroidUtilities.runOnUIThread(new t2(x2Var, this.f5958c, 1), 320L);
                return;
            default:
                x2 x2Var2 = this.f5957b;
                x2Var2.getClass();
                this.f5958c.run(new ai.y1(x2Var2, 8));
                return;
        }
    }
}
