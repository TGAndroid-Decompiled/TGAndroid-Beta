package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lf1 implements f59 {
    public final uf1 a;

    public lf1(uf1 uf1Var) {
        this.a = uf1Var;
    }

    @Override
    public final void g(int i, View view) {
        int i2;
        int i3;
        int i4;
        boolean z = view instanceof qf1;
        uf1 uf1Var = this.a;
        if (z) {
            qf1 qf1Var = (qf1) view;
            TLRPC.TL_username tL_username = qf1Var.w;
            if (tL_username != null && !qf1Var.r) {
                if (tL_username.editable && uf1Var.y == 0) {
                    uf1Var.b.z0(0);
                    uf1Var.d0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, uf1Var.getResourceProvider(), uf1Var.getParentActivity());
                if (tL_username.active) {
                    i2 = 2131743351;
                } else {
                    i2 = 2131743358;
                }
                String M0 = jb6.M0(i2, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                if (tL_username.active) {
                    i3 = 2131743349;
                } else {
                    i3 = 2131743356;
                }
                heVar.U = jb6.M0(i3, null);
                if (tL_username.active) {
                    i4 = 2131749082;
                } else {
                    i4 = 2131745087;
                }
                alertDialog$Builder.j(jb6.M0(i4, null), new zn(this, tL_username, i, view, (byte) 2));
                alertDialog$Builder.g(jb6.M0(2131752542, null), new qn0((byte) 17));
                alertDialog$Builder.o();
            }
        } else if (view instanceof of1) {
            uf1Var.d0(true);
        }
    }
}
