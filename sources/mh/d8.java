package mh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fw0;
public final class d8 implements Runnable {
    public final int f13915a;
    public final org.telegram.ui.ActionBar.h3[] f13916b;
    public final Context f13917c;

    public d8(Context context, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f13915a = 0;
        this.f13917c = context;
        this.f13916b = h3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h3 h3Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        switch (this.f13915a) {
            case 0:
                fw0 fw0Var = new fw0(this.f13917c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.h3[] h3VarArr = this.f13916b;
                    if (!AndroidUtilities.hasDialogOnTop(h3VarArr[0].attachedFragment) && (h3Var = h3VarArr[0]) != null && (p2Var = h3Var.attachedFragment) != null) {
                        fw0Var.makeAttached(p2Var);
                    }
                }
                fw0Var.show();
                return;
            case 1:
                this.f13916b[0].dismiss();
                af.g.s(this.f13917c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 2:
                this.f13916b[0].dismiss();
                af.g.u(this.f13917c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            default:
                this.f13916b[0].dismiss();
                af.g.s(this.f13917c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
        }
    }

    public d8(org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, int i10) {
        this.f13915a = i10;
        this.f13916b = h3VarArr;
        this.f13917c = context;
    }
}
