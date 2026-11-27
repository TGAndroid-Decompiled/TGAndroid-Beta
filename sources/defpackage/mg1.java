package defpackage;

import android.content.Context;
public final class mg1 extends mf5 {
    public final p66 r;

    public mg1(Context context, vnb vnbVar) {
        super(context, vnbVar);
        int i;
        p66 p66Var = new p66(context, vnbVar);
        this.r = p66Var;
        p66Var.setTextSize(1, 14.0f);
        yob.X(p66Var, aob.z6, vnbVar);
        yob.G(p66Var, aob.L6, vnbVar);
        p66Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        if (ob6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        addView(p66Var, tre.d(-2, -2.0f, i | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
