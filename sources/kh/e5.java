package kh;

import org.telegram.messenger.AndroidUtilities;
public final class e5 implements Runnable {
    public final int f10690a;
    public final p5 f10691b;

    public e5(p5 p5Var, int i10) {
        this.f10690a = i10;
        this.f10691b = p5Var;
    }

    @Override
    public final void run() {
        switch (this.f10690a) {
            case 0:
                this.f10691b.Z();
                return;
            default:
                p5 p5Var = this.f10691b;
                p5Var.f10865f0.N(true);
                AndroidUtilities.runOnUIThread(new e5(p5Var, 0), 150L);
                return;
        }
    }
}
