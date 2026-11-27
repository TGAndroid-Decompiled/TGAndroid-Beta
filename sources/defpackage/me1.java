package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class me1 implements r69 {
    public final ve1 a;

    public me1(ve1 ve1Var) {
        this.a = ve1Var;
    }

    @Override
    public final void e(int i, View view) {
        int i2;
        int i3;
        int i4;
        boolean z = view instanceof re1;
        ve1 ve1Var = this.a;
        if (z) {
            re1 re1Var = (re1) view;
            TLRPC.TL_username tL_username = re1Var.w;
            if (tL_username != null && !re1Var.r) {
                if (tL_username.editable && ve1Var.y == 0) {
                    ve1Var.b.A0(0);
                    ve1Var.c0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ve1Var.getResourceProvider(), ve1Var.getParentActivity());
                if (tL_username.active) {
                    i2 = 2131743319;
                } else {
                    i2 = 2131743326;
                }
                String M0 = ob6.M0(i2, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                if (tL_username.active) {
                    i3 = 2131743317;
                } else {
                    i3 = 2131743324;
                }
                idVar.U = ob6.M0(i3, null);
                if (tL_username.active) {
                    i4 = 2131749079;
                } else {
                    i4 = 2131745081;
                }
                alertDialog$Builder.j(ob6.M0(i4, null), new an(this, tL_username, i, view, (byte) 2));
                alertDialog$Builder.g(ob6.M0(2131752570, null), new rm0((byte) 20));
                alertDialog$Builder.o();
            }
        } else if (view instanceof pe1) {
            ve1Var.c0(true);
        }
    }
}
