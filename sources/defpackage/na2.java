package defpackage;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class na2 implements f59 {
    public final pa2 a;

    public na2(pa2 pa2Var) {
        this.a = pa2Var;
    }

    @Override
    public final void g(int i, View view) {
        TLRPC.TL_username tL_username;
        int i2;
        int i3;
        int i4;
        pa2 pa2Var = this.a;
        qa2 qa2Var = pa2Var.i3;
        if ((view instanceof qf1) && (tL_username = ((qf1) view).w) != null) {
            if (tL_username.editable) {
                if (qa2Var.fragmentView instanceof ScrollView) {
                    qa2Var.a.smoothScrollTo(0, qa2Var.E.getTop() - gm.L(128.0f));
                }
                qa2Var.b.requestFocus();
                gm.E3(qa2Var.b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qa2Var.getResourceProvider(), pa2Var.getContext());
            if (tL_username.active) {
                i2 = 2131743351;
            } else {
                i2 = 2131743358;
            }
            String M0 = jb6.M0(i2, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            if (tL_username.active) {
                i3 = 2131743350;
            } else {
                i3 = 2131743357;
            }
            heVar.U = jb6.M0(i3, null);
            if (tL_username.active) {
                i4 = 2131749082;
            } else {
                i4 = 2131745087;
            }
            alertDialog$Builder.j(jb6.M0(i4, null), new jf(this, tL_username, view, (byte) 27));
            alertDialog$Builder.g(jb6.M0(2131752542, null), new a32((byte) 3));
            alertDialog$Builder.o();
        }
    }
}
