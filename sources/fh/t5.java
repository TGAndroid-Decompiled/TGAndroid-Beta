package fh;

import org.telegram.messenger.AndroidUtilities;
public final class t5 implements Runnable {
    public final int f6767a;
    public final f6 f6768b;

    public t5(f6 f6Var, int i9) {
        this.f6767a = i9;
        this.f6768b = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f6767a) {
            case 0:
                this.f6768b.Y();
                return;
            default:
                f6 f6Var = this.f6768b;
                f6Var.f6464e0.N(true);
                AndroidUtilities.runOnUIThread(new t5(f6Var, 0), 150L);
                return;
        }
    }
}
