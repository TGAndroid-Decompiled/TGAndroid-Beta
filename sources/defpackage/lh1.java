package defpackage;

import android.content.Context;
public final class lh1 extends jf5 {
    public final l66 r;

    public lh1(Context context, ylb ylbVar) {
        super(context, ylbVar);
        int i;
        l66 l66Var = new l66(context, ylbVar);
        this.r = l66Var;
        l66Var.setTextSize(1, 14.0f);
        anb.X(l66Var, cmb.y6, ylbVar);
        anb.G(l66Var, cmb.K6, ylbVar);
        l66Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        if (jb6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        addView(l66Var, qoe.d(-2, -2.0f, i | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
