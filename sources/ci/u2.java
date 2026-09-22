package ci;

import org.telegram.messenger.AndroidUtilities;
public final class u2 implements Runnable {
    public final int f5601a;
    public final y2 f5602b;
    public final ai.y1 f5603c;

    public u2(y2 y2Var, ai.y1 y1Var, int i10) {
        this.f5601a = i10;
        this.f5602b = y2Var;
        this.f5603c = y1Var;
    }

    @Override
    public final void run() {
        switch (this.f5601a) {
            case 0:
                y2 y2Var = this.f5602b;
                y2Var.getClass();
                AndroidUtilities.runOnUIThread(new u2(y2Var, this.f5603c, 1), 320L);
                return;
            default:
                y2 y2Var2 = this.f5602b;
                y2Var2.getClass();
                this.f5603c.run(new ai.y1(y2Var2, 8));
                return;
        }
    }
}
