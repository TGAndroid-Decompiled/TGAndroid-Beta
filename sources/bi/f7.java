package bi;

import android.content.Context;
import android.graphics.Bitmap;
public final class f7 extends og.h1 {
    public final ad E;

    public f7(ad adVar, Context context, og.v0 v0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ia iaVar) {
        super(context, v0Var, bitmap, bitmap2, iaVar);
        this.E = adVar;
    }

    @Override
    public final void g(og.m mVar) {
        int indexOf = og.m.f14420a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        ad adVar = this.E;
        adVar.f3519k1.b(indexOf);
        adVar.B(mVar);
    }
}
