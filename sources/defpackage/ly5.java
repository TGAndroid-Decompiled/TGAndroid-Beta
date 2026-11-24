package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
public final class ly5 extends e99 {
    public final Bitmap F;
    public final sa8 G;

    public ly5(sa8 sa8Var, Context context, hw7 hw7Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, hw7Var, bitmap, null, null);
        this.G = sa8Var;
        this.F = bitmap2;
    }

    @Override
    public final void g(u11 u11Var) {
        int indexOf = u11.a.indexOf(u11Var);
        int i = indexOf + 1;
        if (i <= 1 || this.F != null) {
            indexOf = i;
        }
        sa8 sa8Var = this.G;
        sa8Var.j1.b(indexOf);
        sa8Var.s(u11Var);
    }
}
