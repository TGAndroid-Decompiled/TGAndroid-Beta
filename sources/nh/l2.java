package nh;

import org.telegram.messenger.AndroidUtilities;
public final class l2 implements Runnable {
    public final int f18036a;
    public final p2 f18037b;
    public final b0 f18038c;

    public l2(p2 p2Var, b0 b0Var, int i10) {
        this.f18036a = i10;
        this.f18037b = p2Var;
        this.f18038c = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f18036a) {
            case 0:
                p2 p2Var = this.f18037b;
                p2Var.getClass();
                AndroidUtilities.runOnUIThread(new l2(p2Var, this.f18038c, 1), 320L);
                return;
            default:
                p2 p2Var2 = this.f18037b;
                p2Var2.getClass();
                this.f18038c.run(new b0(p2Var2, 2));
                return;
        }
    }
}
