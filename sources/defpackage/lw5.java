package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
public final class lw5 extends c79 {
    public final Bitmap F;
    public final q88 G;

    public lw5(q88 q88Var, Context context, gu7 gu7Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, gu7Var, bitmap, null, null);
        this.G = q88Var;
        this.F = bitmap2;
    }

    @Override
    public final void g(m01 m01Var) {
        int indexOf = m01.a.indexOf(m01Var);
        int i = indexOf + 1;
        if (i <= 1 || this.F != null) {
            indexOf = i;
        }
        q88 q88Var = this.G;
        q88Var.j1.b(indexOf);
        q88Var.s(m01Var);
    }
}
