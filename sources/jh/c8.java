package jh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wv0;
public final class c8 implements Runnable {
    public final int f11882a;
    public final org.telegram.ui.ActionBar.f3[] f11883b;
    public final Context f11884c;

    public c8(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f11882a = 0;
        this.f11884c = context;
        this.f11883b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.f11882a) {
            case 0:
                wv0 wv0Var = new wv0(this.f11884c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f11883b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (o2Var = f3Var.attachedFragment) != null) {
                        wv0Var.makeAttached(o2Var);
                    }
                }
                wv0Var.show();
                return;
            case 1:
                this.f11883b[0].dismiss();
                ye.d.s(this.f11884c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 2:
                this.f11883b[0].dismiss();
                ye.d.u(this.f11884c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            default:
                this.f11883b[0].dismiss();
                ye.d.s(this.f11884c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
        }
    }

    public c8(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f11882a = i10;
        this.f11883b = f3VarArr;
        this.f11884c = context;
    }
}
