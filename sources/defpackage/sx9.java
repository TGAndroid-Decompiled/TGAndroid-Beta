package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sx9 implements Runnable {
    public final byte a;
    public final wx9 b;
    public final Activity c;
    public final id d;

    public sx9(wx9 wx9Var, Activity activity, id idVar, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = activity;
        this.d = idVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        id idVar = this.d;
        Activity activity = this.c;
        wx9 wx9Var = this.b;
        switch (b) {
            case 0:
                wx9Var.n = false;
                if (!activity.isFinishing()) {
                    try {
                        idVar.dismiss();
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                if (!activity.isFinishing()) {
                    wx9Var.n = false;
                    try {
                        idVar.dismiss();
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = ob6.M0(2131689472, null);
                    id idVar2 = alertDialog$Builder.a;
                    idVar2.S = M0;
                    idVar2.U = ob6.M0(2131751715, null);
                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                    alertDialog$Builder.o().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
