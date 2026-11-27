package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
public final class qy5 extends pa9 {
    public final Bitmap F;
    public final hc8 G;

    public qy5(hc8 hc8Var, Context context, nx7 nx7Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, nx7Var, bitmap, null, null);
        this.G = hc8Var;
        this.F = bitmap2;
    }

    @Override
    public final void g(v01 v01Var) {
        int indexOf = v01.a.indexOf(v01Var);
        int i = indexOf + 1;
        if (i <= 1 || this.F != null) {
            indexOf = i;
        }
        hc8 hc8Var = this.G;
        hc8Var.d1.b(indexOf);
        hc8Var.s(v01Var);
    }
}
