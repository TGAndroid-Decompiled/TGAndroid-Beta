package dg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.ft0;
public final class s0 extends cg.p1 {
    public final Bitmap B;
    public final ft0 C;

    public s0(ft0 ft0Var, Context context, cg.d1 d1Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, d1Var, bitmap, null, null);
        this.C = ft0Var;
        this.B = bitmap2;
    }

    @Override
    public final void g(cg.m mVar) {
        int indexOf = cg.m.f2447a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.B != null) {
            indexOf = i10;
        }
        ft0 ft0Var = this.C;
        ft0Var.f4483q1.b(indexOf);
        ft0Var.x(mVar);
    }
}
