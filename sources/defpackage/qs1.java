package defpackage;

import android.content.Context;
public final class qs1 extends ew1 {
    public final yv1 N;

    public qs1(yv1 yv1Var, Context context, ylb ylbVar, jr1 jr1Var, km0 km0Var) {
        super(context, ylbVar, jr1Var, km0Var);
        this.N = yv1Var;
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        jif jifVar = this.N.ud;
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (getMeasuredWidth() > 0) {
            z2 = true;
        }
        jifVar.s(3, z, z2);
    }
}
