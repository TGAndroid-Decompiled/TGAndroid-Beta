package ci;

import org.telegram.messenger.AndroidUtilities;
public final class s2 implements Runnable {
    public final int f5935a;
    public final w2 f5936b;
    public final ai.y1 f5937c;

    public s2(w2 w2Var, ai.y1 y1Var, int i10) {
        this.f5935a = i10;
        this.f5936b = w2Var;
        this.f5937c = y1Var;
    }

    @Override
    public final void run() {
        switch (this.f5935a) {
            case 0:
                w2 w2Var = this.f5936b;
                w2Var.getClass();
                AndroidUtilities.runOnUIThread(new s2(w2Var, this.f5937c, 1), 320L);
                return;
            default:
                w2 w2Var2 = this.f5936b;
                w2Var2.getClass();
                this.f5937c.run(new ai.y1(w2Var2, 8));
                return;
        }
    }
}
