package defpackage;

import android.content.Context;
public final class dg1 extends ld5 {
    public final l46 r;

    public dg1(Context context, wjb wjbVar) {
        super(context, wjbVar);
        int i;
        l46 l46Var = new l46(context, wjbVar);
        this.r = l46Var;
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, bkb.y6, wjbVar);
        zkb.G(l46Var, bkb.K6, wjbVar);
        l46Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        if (k96.a0) {
            i = 3;
        } else {
            i = 5;
        }
        addView(l46Var, nme.d(-2, -2.0f, i | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
