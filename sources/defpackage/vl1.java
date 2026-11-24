package defpackage;

import android.content.DialogInterface;
public final class vl1 implements DialogInterface.OnShowListener {
    public final byte a;
    public final mu1 b;

    public vl1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.dc(false);
                return;
            default:
                mu1Var.dc(false);
                return;
        }
    }
}
