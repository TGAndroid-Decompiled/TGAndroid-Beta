package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zw0;
public final class ta implements Runnable {
    public final int f2221a;
    public final org.telegram.ui.ActionBar.f3[] f2222b;
    public final Context f2223c;

    public ta(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f2221a = 0;
        this.f2223c = context;
        this.f2222b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f2221a) {
            case 0:
                zw0 zw0Var = new zw0(this.f2223c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f2222b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        zw0Var.makeAttached(n2Var);
                    }
                }
                zw0Var.show();
                return;
            case 1:
                this.f2222b[0].dismiss();
                pf.d.r(this.f2223c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 2:
                this.f2222b[0].dismiss();
                pf.d.t(this.f2223c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            default:
                this.f2222b[0].dismiss();
                pf.d.r(this.f2223c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
        }
    }

    public ta(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f2221a = i10;
        this.f2222b = f3VarArr;
        this.f2223c = context;
    }
}
