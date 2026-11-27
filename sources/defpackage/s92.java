package defpackage;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s92 implements r69 {
    public final u92 a;

    public s92(u92 u92Var) {
        this.a = u92Var;
    }

    @Override
    public final void e(int i, View view) {
        TLRPC.TL_username tL_username;
        int i2;
        int i3;
        int i4;
        u92 u92Var = this.a;
        v92 v92Var = u92Var.i3;
        if ((view instanceof re1) && (tL_username = ((re1) view).w) != null) {
            if (tL_username.editable) {
                if (v92Var.fragmentView instanceof ScrollView) {
                    v92Var.a.smoothScrollTo(0, v92Var.E.getTop() - hl.L(128.0f));
                }
                v92Var.b.requestFocus();
                hl.E3(v92Var.b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v92Var.getResourceProvider(), u92Var.getContext());
            if (tL_username.active) {
                i2 = 2131743319;
            } else {
                i2 = 2131743326;
            }
            String M0 = ob6.M0(i2, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            if (tL_username.active) {
                i3 = 2131743318;
            } else {
                i3 = 2131743325;
            }
            idVar.U = ob6.M0(i3, null);
            if (tL_username.active) {
                i4 = 2131749079;
            } else {
                i4 = 2131745081;
            }
            alertDialog$Builder.j(ob6.M0(i4, null), new ie(this, tL_username, view, (byte) 27));
            alertDialog$Builder.g(ob6.M0(2131752570, null), new c22((byte) 7));
            alertDialog$Builder.o();
        }
    }
}
