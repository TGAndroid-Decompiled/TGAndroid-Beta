package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.dx0;
public final class ua implements Runnable {
    public final int f2269a;
    public final org.telegram.ui.ActionBar.h3[] f2270b;
    public final Context f2271c;

    public ua(Context context, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f2269a = 0;
        this.f2271c = context;
        this.f2270b = h3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h3 h3Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.f2269a) {
            case 0:
                dx0 dx0Var = new dx0(this.f2271c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.h3[] h3VarArr = this.f2270b;
                    if (!AndroidUtilities.hasDialogOnTop(h3VarArr[0].attachedFragment) && (h3Var = h3VarArr[0]) != null && (o2Var = h3Var.attachedFragment) != null) {
                        dx0Var.makeAttached(o2Var);
                    }
                }
                dx0Var.show();
                return;
            case 1:
                this.f2270b[0].dismiss();
                pf.d.r(this.f2271c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 2:
                this.f2270b[0].dismiss();
                pf.d.t(this.f2271c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            default:
                this.f2270b[0].dismiss();
                pf.d.r(this.f2271c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
        }
    }

    public ua(org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, int i10) {
        this.f2269a = i10;
        this.f2270b = h3VarArr;
        this.f2271c = context;
    }
}
