package gi;

import android.content.Context;
import android.graphics.Bitmap;
public final class g5 extends tg.u0 {
    public final x9 F;

    public g5(x9 x9Var, Context context, tg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.x9 x9Var2) {
        super(context, i0Var, bitmap, bitmap2, x9Var2);
        this.F = x9Var;
    }

    @Override
    public final void g(tg.h hVar) {
        int indexOf = tg.h.f55183a.indexOf(hVar);
        int i3 = indexOf + 1;
        if (i3 <= 1) {
            indexOf = i3;
        }
        x9 x9Var = this.F;
        x9Var.U0.b(indexOf);
        x9Var.C(hVar);
    }
}
