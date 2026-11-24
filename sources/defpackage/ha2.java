package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ha2 extends c6 {
    public final Context a;
    public final qa2 b;

    public ha2(qa2 qa2Var, Context context) {
        this.b = qa2Var;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        qa2 qa2Var = this.b;
        if (i == -1) {
            qa2Var.finishFragment();
        } else if (i == 1) {
            uja ujaVar = qa2Var.r;
            if (ujaVar == null || !ujaVar.y.f) {
                String K = sd2.K(qa2Var.Y, false);
                if (qa2Var.W && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qa2Var.getResourceProvider(), this.a);
                    if (qa2Var.b0) {
                        i2 = 2131748459;
                    } else {
                        i2 = 2131748457;
                    }
                    String M0 = jb6.M0(i2, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    if (qa2Var.b0) {
                        i3 = 2131748460;
                    } else {
                        i3 = 2131748458;
                    }
                    heVar.U = gm.S2(jb6.a0(null, null, i3, kt6.p(qa2Var.getMessagesController().N2, "/", K, new StringBuilder())));
                    alertDialog$Builder.j(jb6.M0(2131751708, null), new cd1(this, (byte) 23));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    qa2Var.showDialog(heVar);
                    return;
                }
                qa2Var.e0();
            }
        }
    }
}
