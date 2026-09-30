package ci;

import org.telegram.messenger.AndroidUtilities;
public final class t2 implements Runnable {
    public final int f5537a;
    public final x2 f5538b;
    public final ai.y1 f5539c;

    public t2(x2 x2Var, ai.y1 y1Var, int i10) {
        this.f5537a = i10;
        this.f5538b = x2Var;
        this.f5539c = y1Var;
    }

    @Override
    public final void run() {
        switch (this.f5537a) {
            case 0:
                x2 x2Var = this.f5538b;
                x2Var.getClass();
                AndroidUtilities.runOnUIThread(new t2(x2Var, this.f5539c, 1), 320L);
                return;
            default:
                x2 x2Var2 = this.f5538b;
                x2Var2.getClass();
                this.f5539c.run(new ai.y1(x2Var2, 8));
                return;
        }
    }
}
