package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yt9 implements Runnable {
    public final byte a;
    public final bu9 b;
    public final Activity c;
    public final hd d;

    public yt9(bu9 bu9Var, Activity activity, hd hdVar, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = activity;
        this.d = hdVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hd hdVar = this.d;
        Activity activity = this.c;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                bu9Var.n = false;
                if (!activity.isFinishing()) {
                    try {
                        hdVar.dismiss();
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                if (!activity.isFinishing()) {
                    bu9Var.n = false;
                    try {
                        hdVar.dismiss();
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = k96.M0(2131689472, null);
                    hd hdVar2 = alertDialog$Builder.a;
                    hdVar2.S = M0;
                    hdVar2.U = k96.M0(2131751738, null);
                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                    alertDialog$Builder.o().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
