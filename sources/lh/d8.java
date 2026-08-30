package lh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fw0;
public final class d8 implements Runnable {
    public final int f12317a;
    public final org.telegram.ui.ActionBar.g3[] f12318b;
    public final Context f12319c;

    public d8(Context context, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f12317a = 0;
        this.f12319c = context;
        this.f12318b = g3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g3 g3Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        switch (this.f12317a) {
            case 0:
                fw0 fw0Var = new fw0(this.f12319c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.g3[] g3VarArr = this.f12318b;
                    if (!AndroidUtilities.hasDialogOnTop(g3VarArr[0].attachedFragment) && (g3Var = g3VarArr[0]) != null && (p2Var = g3Var.attachedFragment) != null) {
                        fw0Var.makeAttached(p2Var);
                    }
                }
                fw0Var.show();
                return;
            case 1:
                this.f12318b[0].dismiss();
                af.g.s(this.f12319c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 2:
                this.f12318b[0].dismiss();
                af.g.u(this.f12319c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            default:
                this.f12318b[0].dismiss();
                af.g.s(this.f12319c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
        }
    }

    public d8(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, int i10) {
        this.f12317a = i10;
        this.f12318b = g3VarArr;
        this.f12319c = context;
    }
}
