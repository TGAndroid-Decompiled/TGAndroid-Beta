package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class aw9 implements Runnable {
    public final byte a;
    public final dw9 b;
    public final Activity c;
    public final he d;

    public aw9(dw9 dw9Var, Activity activity, he heVar, byte b) {
        this.a = b;
        this.b = dw9Var;
        this.c = activity;
        this.d = heVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        he heVar = this.d;
        Activity activity = this.c;
        dw9 dw9Var = this.b;
        switch (b) {
            case 0:
                dw9Var.n = false;
                if (!activity.isFinishing()) {
                    try {
                        heVar.dismiss();
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                if (!activity.isFinishing()) {
                    dw9Var.n = false;
                    try {
                        heVar.dismiss();
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = jb6.M0(2131689472, null);
                    he heVar2 = alertDialog$Builder.a;
                    heVar2.S = M0;
                    heVar2.U = jb6.M0(2131751687, null);
                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                    alertDialog$Builder.o().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
