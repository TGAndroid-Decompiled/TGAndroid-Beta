package bg;

import org.telegram.messenger.AndroidUtilities;
public final class t0 implements Runnable {
    public final int f1962a;
    public final z0 f1963b;

    public t0(z0 z0Var, int i9) {
        this.f1962a = i9;
        this.f1963b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f1962a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f1963b, 1));
                return;
            default:
                this.f1963b.run(null);
                return;
        }
    }
}
