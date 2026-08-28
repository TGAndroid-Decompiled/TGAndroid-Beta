package gh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mv0;
public final class f8 implements Runnable {
    public final int f8080a;
    public final org.telegram.ui.ActionBar.f3[] f8081b;
    public final Context f8082c;

    public f8(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f8080a = 0;
        this.f8082c = context;
        this.f8081b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.f8080a) {
            case 0:
                mv0 mv0Var = new mv0(this.f8082c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f8081b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (o2Var = f3Var.attachedFragment) != null) {
                        mv0Var.makeAttached(o2Var);
                    }
                }
                mv0Var.show();
                return;
            case 1:
                this.f8081b[0].dismiss();
                ve.e.s(this.f8082c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 2:
                this.f8081b[0].dismiss();
                ve.e.u(this.f8082c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            default:
                this.f8081b[0].dismiss();
                ve.e.s(this.f8082c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
        }
    }

    public f8(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i9) {
        this.f8080a = i9;
        this.f8081b = f3VarArr;
        this.f8082c = context;
    }
}
