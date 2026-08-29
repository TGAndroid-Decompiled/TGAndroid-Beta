package bg;

import org.telegram.messenger.AndroidUtilities;
public final class w3 implements Runnable {
    public final int f2601a;
    public final c4 f2602b;

    public w3(c4 c4Var, int i10) {
        this.f2601a = i10;
        this.f2602b = c4Var;
    }

    @Override
    public final void run() {
        switch (this.f2601a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new w3(this.f2602b, 0));
                return;
            case 2:
                this.f2602b.dismiss();
                return;
            default:
                c4 c4Var = this.f2602b;
                nh.b0 b0Var = c4Var.D;
                if (b0Var != null) {
                    b0Var.run(null);
                    c4Var.D = null;
                }
                c4Var.dismiss();
                return;
        }
    }
}
