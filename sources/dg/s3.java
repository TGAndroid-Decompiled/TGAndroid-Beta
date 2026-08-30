package dg;

import org.telegram.messenger.AndroidUtilities;
public final class s3 implements Runnable {
    public final int f4783a;
    public final y3 f4784b;

    public s3(y3 y3Var, int i10) {
        this.f4783a = i10;
        this.f4784b = y3Var;
    }

    @Override
    public final void run() {
        switch (this.f4783a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new s3(this.f4784b, 0));
                return;
            case 2:
                this.f4784b.dismiss();
                return;
            default:
                y3 y3Var = this.f4784b;
                org.telegram.ui.web.y0 y0Var = y3Var.E;
                if (y0Var != null) {
                    y0Var.run(null);
                    y3Var.E = null;
                }
                y3Var.dismiss();
                return;
        }
    }
}
