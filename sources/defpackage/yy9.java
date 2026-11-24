package defpackage;

import android.content.Context;
public final class yy9 extends hz9 {
    public final zy9 L;

    public yy9(zy9 zy9Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.L = zy9Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        zy9 zy9Var = this.L;
        zy9Var.k2 = gl.L(78.0f) + measuredHeight;
        zy9Var.j2.G();
    }
}
