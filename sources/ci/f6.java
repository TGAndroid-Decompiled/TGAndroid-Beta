package ci;

import android.content.Context;
import android.graphics.Bitmap;
public final class f6 extends pg.f1 {
    public final mb E;

    public f6(mb mbVar, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ja jaVar) {
        super(context, s0Var, bitmap, bitmap2, jaVar);
        this.E = mbVar;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f41167a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        mb mbVar = this.E;
        mbVar.f5354k1.b(indexOf);
        mbVar.b(mVar);
    }
}
