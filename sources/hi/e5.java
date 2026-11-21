package hi;

import android.content.Context;
import android.graphics.Bitmap;
public final class e5 extends sg.u0 {
    public final u9 F;

    public e5(u9 u9Var, Context context, sg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ca caVar) {
        super(context, i0Var, bitmap, bitmap2, caVar);
        this.F = u9Var;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f57255a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1) {
            indexOf = i7;
        }
        u9 u9Var = this.F;
        u9Var.U0.b(indexOf);
        u9Var.w(hVar);
    }
}
