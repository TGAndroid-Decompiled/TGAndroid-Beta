package gh;

import org.telegram.messenger.AndroidUtilities;

public final class m5 implements Runnable {

    public final int f7436a;

    public final x5 f7437b;

    public m5(x5 x5Var, int i10) {
        this.f7436a = i10;
        this.f7437b = x5Var;
    }

    @Override
    public final void run() {
        switch (this.f7436a) {
            case 0:
                this.f7437b.Z();
                break;
            default:
                x5 x5Var = this.f7437b;
                x5Var.f7630e0.N(true);
                AndroidUtilities.runOnUIThread(new m5(x5Var, 0), 150L);
                break;
        }
    }
}
