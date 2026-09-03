package dg;

import org.telegram.messenger.AndroidUtilities;
public final class s3 implements Runnable {
    public final int f4789a;
    public final y3 f4790b;

    public s3(y3 y3Var, int i10) {
        this.f4789a = i10;
        this.f4790b = y3Var;
    }

    @Override
    public final void run() {
        switch (this.f4789a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new s3(this.f4790b, 0));
                return;
            case 2:
                this.f4790b.dismiss();
                return;
            default:
                y3 y3Var = this.f4790b;
                org.telegram.ui.web.a1 a1Var = y3Var.E;
                if (a1Var != null) {
                    a1Var.run(null);
                    y3Var.E = null;
                }
                y3Var.dismiss();
                return;
        }
    }
}
