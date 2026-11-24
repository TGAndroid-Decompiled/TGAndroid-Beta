package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class de1 implements c39 {
    public final me1 a;

    public de1(me1 me1Var) {
        this.a = me1Var;
    }

    @Override
    public final void d(int i, View view) {
        int i2;
        int i3;
        int i4;
        boolean z = view instanceof ie1;
        me1 me1Var = this.a;
        if (z) {
            ie1 ie1Var = (ie1) view;
            TLRPC.TL_username tL_username = ie1Var.w;
            if (tL_username != null && !ie1Var.r) {
                if (tL_username.editable && me1Var.y == 0) {
                    me1Var.b.z0(0);
                    me1Var.c0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, me1Var.getResourceProvider(), me1Var.getParentActivity());
                if (tL_username.active) {
                    i2 = 2131743425;
                } else {
                    i2 = 2131743432;
                }
                String M0 = k96.M0(i2, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                if (tL_username.active) {
                    i3 = 2131743423;
                } else {
                    i3 = 2131743430;
                }
                hdVar.U = k96.M0(i3, null);
                if (tL_username.active) {
                    i4 = 2131749133;
                } else {
                    i4 = 2131745161;
                }
                alertDialog$Builder.j(k96.M0(i4, null), new zm(this, tL_username, i, view, (byte) 2));
                alertDialog$Builder.g(k96.M0(2131752577, null), new qm0((byte) 17));
                alertDialog$Builder.o();
            }
        } else if (view instanceof ge1) {
            me1Var.c0(true);
        }
    }
}
