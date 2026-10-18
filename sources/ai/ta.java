package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yw0;
public final class ta implements Runnable {
    public final int f2219a;
    public final org.telegram.ui.ActionBar.f3[] f2220b;
    public final Context f2221c;

    public ta(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f2219a = 0;
        this.f2221c = context;
        this.f2220b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f2219a) {
            case 0:
                yw0 yw0Var = new yw0(this.f2221c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f2220b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        yw0Var.makeAttached(n2Var);
                    }
                }
                yw0Var.show();
                return;
            case 1:
                this.f2220b[0].dismiss();
                pf.d.r(this.f2221c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 2:
                this.f2220b[0].dismiss();
                pf.d.t(this.f2221c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            default:
                this.f2220b[0].dismiss();
                pf.d.r(this.f2221c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
        }
    }

    public ta(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f2219a = i10;
        this.f2220b = f3VarArr;
        this.f2221c = context;
    }
}
