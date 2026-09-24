package ci;

import android.content.Context;
import android.graphics.Bitmap;
public final class f6 extends pg.f1 {
    public final nb E;

    public f6(nb nbVar, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ja jaVar) {
        super(context, s0Var, bitmap, bitmap2, jaVar);
        this.E = nbVar;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f41155a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        nb nbVar = this.E;
        nbVar.f5350k1.b(indexOf);
        nbVar.b(mVar);
    }
}
