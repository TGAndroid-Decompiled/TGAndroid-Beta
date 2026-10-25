package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kx0;
public final class ta implements Runnable {
    public final int f5477a;
    public final org.telegram.ui.ActionBar.k3[] f5478b;
    public final Context f5479c;

    public ta(Context context, org.telegram.ui.ActionBar.k3[] k3VarArr) {
        this.f5477a = 0;
        this.f5479c = context;
        this.f5478b = k3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.k3 k3Var;
        org.telegram.ui.ActionBar.r2 r2Var;
        switch (this.f5477a) {
            case 0:
                kx0 kx0Var = new kx0(this.f5479c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.k3[] k3VarArr = this.f5478b;
                    if (!AndroidUtilities.hasDialogOnTop(k3VarArr[0].attachedFragment) && (k3Var = k3VarArr[0]) != null && (r2Var = k3Var.attachedFragment) != null) {
                        kx0Var.makeAttached(r2Var);
                    }
                }
                kx0Var.show();
                return;
            case 1:
                this.f5478b[0].dismiss();
                qf.d.r(this.f5479c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 2:
                this.f5478b[0].dismiss();
                qf.d.t(this.f5479c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            default:
                this.f5478b[0].dismiss();
                qf.d.r(this.f5479c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
        }
    }

    public ta(org.telegram.ui.ActionBar.k3[] k3VarArr, Context context, int i10) {
        this.f5477a = i10;
        this.f5478b = k3VarArr;
        this.f5479c = context;
    }
}
