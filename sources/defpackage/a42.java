package defpackage;

import android.content.Context;
import android.widget.TextView;
public final class a42 extends sa6 {
    public final byte E = 0;
    public final gk7 F;

    public a42(qa6 qa6Var, Context context, wjb wjbVar, boolean z) {
        super(wjbVar, context, false, z);
        this.F = qa6Var;
    }

    @Override
    public final void f() {
        byte b = this.E;
        gk7 gk7Var = this.F;
        switch (b) {
            case 0:
                c42 c42Var = (c42) gk7Var;
                a42 a42Var = c42Var.O;
                r7 r7Var = c42Var.x;
                if (r7Var != null) {
                    r7Var.setShowSearchProgress(a42Var.w);
                }
                TextView textView = c42Var.w;
                if (textView != null) {
                    textView.setText(k96.a0(null, null, 2131747973, a42Var.h));
                }
                super.f();
                return;
            default:
                qa6 qa6Var = (qa6) gk7Var;
                xha xhaVar = qa6Var.r;
                if (xhaVar != null) {
                    xhaVar.setShowSearchProgress(qa6Var.T.w);
                }
                TextView textView2 = qa6Var.n;
                if (textView2 != null) {
                    textView2.setText(k96.a0(null, null, 2131747973, qa6Var.T.h));
                }
                super.f();
                return;
        }
    }

    public a42(c42 c42Var, Context context, wjb wjbVar, boolean z) {
        super(wjbVar, context, z, false);
        this.F = c42Var;
    }
}
