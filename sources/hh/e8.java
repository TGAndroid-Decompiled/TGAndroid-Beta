package hh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ov0;

public final class e8 implements Runnable {

    public final int f9221a;

    public final org.telegram.ui.ActionBar.e3[] f9222b;

    public final Context f9223c;

    public e8(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f9221a = 0;
        this.f9223c = context;
        this.f9222b = e3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f9221a) {
            case 0:
                ov0 ov0Var = new ov0(this.f9223c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.f9222b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (n2Var = e3Var.attachedFragment) != null) {
                        ov0Var.makeAttached(n2Var);
                    }
                }
                ov0Var.show();
                break;
            case 1:
                this.f9222b[0].dismiss();
                we.e.s(this.f9223c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                break;
            case 2:
                this.f9222b[0].dismiss();
                we.e.u(this.f9223c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                break;
            default:
                this.f9222b[0].dismiss();
                we.e.s(this.f9223c, LocaleController.getString(R.string.CocoonFooterLink));
                break;
        }
    }

    public e8(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.f9221a = i10;
        this.f9222b = e3VarArr;
        this.f9223c = context;
    }
}
