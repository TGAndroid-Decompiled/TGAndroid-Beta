package defpackage;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class n3c extends c6 {
    public final p3c a;

    public n3c(p3c p3cVar) {
        this.a = p3cVar;
    }

    @Override
    public final void b(int i) {
        String M0;
        ui5 ui5Var;
        p3c p3cVar = this.a;
        if (i == -1) {
            if (p3cVar.H >= 0) {
                ui5Var = ((d) p3cVar).parentLayout;
                if (ui5Var.getFragmentStack().size() == 1) {
                    p3cVar.M0();
                    return;
                }
            }
            p3cVar.finishFragment();
        } else if (i == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
            TL_account.Password password = p3cVar.V;
            if (password != null && password.has_password) {
                M0 = k96.M0(2131752574, null);
            } else {
                M0 = k96.M0(2131752566, null);
            }
            String M02 = k96.M0(2131752573, null);
            String M03 = k96.M0(2131754950, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.U = M0;
            hdVar.S = M02;
            alertDialog$Builder.j(M03, new hza(this, (byte) 20));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            p3cVar.showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
            }
        }
    }
}
