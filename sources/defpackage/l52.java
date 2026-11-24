package defpackage;

import android.content.Context;
import android.widget.TextView;
public final class l52 extends rc6 {
    public final byte E = 0;
    public final jm7 F;

    public l52(pc6 pc6Var, Context context, ylb ylbVar, boolean z) {
        super(ylbVar, context, false, z);
        this.F = pc6Var;
    }

    @Override
    public final void f() {
        byte b = this.E;
        jm7 jm7Var = this.F;
        switch (b) {
            case 0:
                n52 n52Var = (n52) jm7Var;
                l52 l52Var = n52Var.O;
                r7 r7Var = n52Var.x;
                if (r7Var != null) {
                    r7Var.setShowSearchProgress(l52Var.w);
                }
                TextView textView = n52Var.w;
                if (textView != null) {
                    textView.setText(jb6.a0(null, null, 2131747899, l52Var.h));
                }
                super.f();
                return;
            default:
                pc6 pc6Var = (pc6) jm7Var;
                zja zjaVar = pc6Var.r;
                if (zjaVar != null) {
                    zjaVar.setShowSearchProgress(pc6Var.T.w);
                }
                TextView textView2 = pc6Var.n;
                if (textView2 != null) {
                    textView2.setText(jb6.a0(null, null, 2131747899, pc6Var.T.h));
                }
                super.f();
                return;
        }
    }

    public l52(n52 n52Var, Context context, ylb ylbVar, boolean z) {
        super(ylbVar, context, z, false);
        this.F = n52Var;
    }
}
