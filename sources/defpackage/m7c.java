package defpackage;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class m7c extends d6 {
    public final o7c a;

    public m7c(o7c o7cVar) {
        this.a = o7cVar;
    }

    @Override
    public final void b(int i) {
        String M0;
        wk5 wk5Var;
        o7c o7cVar = this.a;
        if (i == -1) {
            if (o7cVar.H >= 0) {
                wk5Var = ((e) o7cVar).parentLayout;
                if (wk5Var.getFragmentStack().size() == 1) {
                    o7cVar.N0();
                    return;
                }
            }
            o7cVar.finishFragment();
        } else if (i == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
            TL_account.Password password = o7cVar.V;
            if (password != null && password.has_password) {
                M0 = ob6.M0(2131752567, null);
            } else {
                M0 = ob6.M0(2131752559, null);
            }
            String M02 = ob6.M0(2131752566, null);
            String M03 = ob6.M0(2131754946, null);
            id idVar = alertDialog$Builder.a;
            idVar.U = M0;
            idVar.S = M02;
            alertDialog$Builder.j(M03, new ftb(this, (byte) 3));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            o7cVar.showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
            }
        }
    }
}
