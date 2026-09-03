package eg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.mt0;
public final class q0 extends dg.o1 {
    public final Bitmap B;
    public final mt0 C;

    public q0(mt0 mt0Var, Context context, dg.c1 c1Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, c1Var, bitmap, null, null);
        this.C = mt0Var;
        this.B = bitmap2;
    }

    @Override
    public final void g(dg.m mVar) {
        int indexOf = dg.m.f4581a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.B != null) {
            indexOf = i10;
        }
        mt0 mt0Var = this.C;
        mt0Var.f5126q1.b(indexOf);
        mt0Var.g(mVar);
    }
}
