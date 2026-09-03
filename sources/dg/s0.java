package dg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.mt0;
public final class s0 extends cg.p1 {
    public final Bitmap B;
    public final mt0 C;

    public s0(mt0 mt0Var, Context context, cg.d1 d1Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, d1Var, bitmap, null, null);
        this.C = mt0Var;
        this.B = bitmap2;
    }

    @Override
    public final void g(cg.m mVar) {
        int indexOf = cg.m.f2430a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.B != null) {
            indexOf = i10;
        }
        mt0 mt0Var = this.C;
        mt0Var.f4489q1.b(indexOf);
        mt0Var.x(mVar);
    }
}
