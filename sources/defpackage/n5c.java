package defpackage;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class n5c extends c6 {
    public final p5c a;

    public n5c(p5c p5cVar) {
        this.a = p5cVar;
    }

    @Override
    public final void b(int i) {
        String M0;
        tk5 tk5Var;
        p5c p5cVar = this.a;
        if (i == -1) {
            if (p5cVar.H >= 0) {
                tk5Var = ((d) p5cVar).parentLayout;
                if (tk5Var.getFragmentStack().size() == 1) {
                    p5cVar.N0();
                    return;
                }
            }
            p5cVar.finishFragment();
        } else if (i == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
            TL_account.Password password = p5cVar.V;
            if (password != null && password.has_password) {
                M0 = jb6.M0(2131752539, null);
            } else {
                M0 = jb6.M0(2131752531, null);
            }
            String M02 = jb6.M0(2131752538, null);
            String M03 = jb6.M0(2131754950, null);
            he heVar = alertDialog$Builder.a;
            heVar.U = M0;
            heVar.S = M02;
            alertDialog$Builder.j(M03, new wta(this, (byte) 24));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            p5cVar.showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        }
    }
}
