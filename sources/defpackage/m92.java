package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m92 extends d6 {
    public final Context a;
    public final v92 b;

    public m92(v92 v92Var, Context context) {
        this.b = v92Var;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        v92 v92Var = this.b;
        if (i == -1) {
            v92Var.finishFragment();
        } else if (i == 1) {
            nla nlaVar = v92Var.r;
            if (nlaVar == null || !nlaVar.y.f) {
                String K = xc2.K(v92Var.Y, false);
                if (v92Var.W && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v92Var.getResourceProvider(), this.a);
                    if (v92Var.b0) {
                        i2 = 2131748456;
                    } else {
                        i2 = 2131748454;
                    }
                    String M0 = ob6.M0(i2, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    if (v92Var.b0) {
                        i3 = 2131748457;
                    } else {
                        i3 = 2131748455;
                    }
                    idVar.U = hl.S2(ob6.a0(null, null, i3, qu6.o(v92Var.getMessagesController().N2, "/", K, new StringBuilder())));
                    alertDialog$Builder.j(ob6.M0(2131751736, null), new rd1(this, (byte) 22));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    v92Var.showDialog(idVar);
                    return;
                }
                v92Var.d0();
            }
        }
    }
}
