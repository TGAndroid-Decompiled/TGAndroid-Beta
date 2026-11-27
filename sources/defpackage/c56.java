package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class c56 implements View.OnClickListener {
    public final byte a;
    public final i56 b;

    public c56(i56 i56Var, byte b) {
        this.a = b;
        this.b = i56Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        int i;
        byte b = this.a;
        i56 i56Var = this.b;
        switch (b) {
            case 0:
                i56Var.r.f();
                return;
            case 1:
                n8 n8Var = i56Var.s;
                if (n8Var != null) {
                    n8Var.d(true);
                }
                i56Var.r.b();
                return;
            case 2:
                i56 i56Var2 = this.b;
                String str = i56Var2.b;
                if (str != null && str.endsWith("?direct")) {
                    z = true;
                } else {
                    z = false;
                }
                Context context = i56Var2.getContext();
                String M0 = ob6.M0(2131748924, null);
                String str2 = i56Var2.b;
                String str3 = i56Var2.K;
                if (str3 == null) {
                    if (i56Var2.I) {
                        if (z) {
                            i = 2131746234;
                        } else {
                            i = 2131746235;
                        }
                    } else {
                        i = 2131746232;
                    }
                    str3 = ob6.M0(i, null);
                }
                f56 f56Var = new f56(i56Var2, context, M0, str2, str3);
                i56Var2.F = f56Var;
                f56Var.E0();
                i56Var2.F.show();
                n8 n8Var2 = i56Var2.s;
                if (n8Var2 != null) {
                    n8Var2.d(true);
                    return;
                }
                return;
            default:
                n8 n8Var3 = i56Var.s;
                if (n8Var3 != null) {
                    n8Var3.d(true);
                }
                e eVar = i56Var.c;
                if (eVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getParentActivity());
                    String M02 = ob6.M0(2131745750, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M02;
                    idVar.U = ob6.M0(2131745753, null);
                    alertDialog$Builder.j(ob6.M0(2131745751, null), new b56(i56Var, (byte) 1));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    TextView textView = (TextView) idVar.c(-1);
                    if (textView != null) {
                        yob.X(textView, aob.q7, null);
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
