package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class z26 implements View.OnClickListener {
    public final byte a;
    public final f36 b;

    public z26(f36 f36Var, byte b) {
        this.a = b;
        this.b = f36Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        int i;
        byte b = this.a;
        f36 f36Var = this.b;
        switch (b) {
            case 0:
                f36Var.r.i();
                return;
            case 1:
                m8 m8Var = f36Var.s;
                if (m8Var != null) {
                    m8Var.d(true);
                }
                f36Var.r.a();
                return;
            case 2:
                f36 f36Var2 = this.b;
                String str = f36Var2.b;
                if (str != null && str.endsWith("?direct")) {
                    z = true;
                } else {
                    z = false;
                }
                Context context = f36Var2.getContext();
                String M0 = k96.M0(2131748978, null);
                String str2 = f36Var2.b;
                String str3 = f36Var2.K;
                if (str3 == null) {
                    if (f36Var2.I) {
                        if (z) {
                            i = 2131746314;
                        } else {
                            i = 2131746315;
                        }
                    } else {
                        i = 2131746312;
                    }
                    str3 = k96.M0(i, null);
                }
                c36 c36Var = new c36(f36Var2, context, M0, str2, str3);
                f36Var2.F = c36Var;
                c36Var.D0();
                f36Var2.F.show();
                m8 m8Var2 = f36Var2.s;
                if (m8Var2 != null) {
                    m8Var2.d(true);
                    return;
                }
                return;
            default:
                m8 m8Var3 = f36Var.s;
                if (m8Var3 != null) {
                    m8Var3.d(true);
                }
                d dVar = f36Var.c;
                if (dVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
                    String M02 = k96.M0(2131745830, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M02;
                    hdVar.U = k96.M0(2131745833, null);
                    alertDialog$Builder.j(k96.M0(2131745831, null), new y26(f36Var, (byte) 1));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    TextView textView = (TextView) hdVar.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, null);
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
