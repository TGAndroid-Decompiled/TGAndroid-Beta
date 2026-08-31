package eg;

import org.telegram.messenger.AndroidUtilities;
public final class q3 implements Runnable {
    public final int f5447a;
    public final w3 f5448b;

    public q3(w3 w3Var, int i10) {
        this.f5447a = i10;
        this.f5448b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f5447a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new q3(this.f5448b, 0));
                return;
            case 2:
                this.f5448b.dismiss();
                return;
            default:
                w3 w3Var = this.f5448b;
                org.telegram.ui.web.d1 d1Var = w3Var.E;
                if (d1Var != null) {
                    d1Var.run(null);
                    w3Var.E = null;
                }
                w3Var.dismiss();
                return;
        }
    }
}
