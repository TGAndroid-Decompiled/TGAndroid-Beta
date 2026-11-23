package hi;

import android.content.Context;
import android.graphics.Bitmap;
public final class p5 extends sg.t0 {
    public final pa F;

    public p5(pa paVar, Context context, sg.h0 h0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ba baVar) {
        super(context, h0Var, bitmap, bitmap2, baVar);
        this.F = paVar;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f57338a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1) {
            indexOf = i7;
        }
        pa paVar = this.F;
        paVar.U0.b(indexOf);
        paVar.w(hVar);
    }
}
