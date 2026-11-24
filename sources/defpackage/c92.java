package defpackage;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c92 implements c39 {
    public final e92 a;

    public c92(e92 e92Var) {
        this.a = e92Var;
    }

    @Override
    public final void d(int i, View view) {
        TLRPC.TL_username tL_username;
        int i2;
        int i3;
        int i4;
        e92 e92Var = this.a;
        f92 f92Var = e92Var.i3;
        if ((view instanceof ie1) && (tL_username = ((ie1) view).w) != null) {
            if (tL_username.editable) {
                if (f92Var.fragmentView instanceof ScrollView) {
                    f92Var.a.smoothScrollTo(0, f92Var.E.getTop() - gl.L(128.0f));
                }
                f92Var.b.requestFocus();
                gl.F3(f92Var.b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f92Var.getResourceProvider(), e92Var.getContext());
            if (tL_username.active) {
                i2 = 2131743425;
            } else {
                i2 = 2131743432;
            }
            String M0 = k96.M0(i2, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            if (tL_username.active) {
                i3 = 2131743424;
            } else {
                i3 = 2131743431;
            }
            hdVar.U = k96.M0(i3, null);
            if (tL_username.active) {
                i4 = 2131749133;
            } else {
                i4 = 2131745161;
            }
            alertDialog$Builder.j(k96.M0(i4, null), new ie(this, tL_username, view, (byte) 27));
            alertDialog$Builder.g(k96.M0(2131752577, null), new k32((byte) 2));
            alertDialog$Builder.o();
        }
    }
}
