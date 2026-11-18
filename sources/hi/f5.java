package hi;

import android.content.Context;
import android.graphics.Bitmap;
public final class f5 extends sg.u0 {
    public final v9 F;

    public f5(v9 v9Var, Context context, sg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ca caVar) {
        super(context, i0Var, bitmap, bitmap2, caVar);
        this.F = v9Var;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f57214a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1) {
            indexOf = i7;
        }
        v9 v9Var = this.F;
        v9Var.U0.b(indexOf);
        v9Var.w(hVar);
    }
}
