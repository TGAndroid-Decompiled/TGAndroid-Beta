package ci;

import android.content.Context;
import android.graphics.Bitmap;
public final class g6 extends pg.e1 {
    public final qb E;

    public g6(qb qbVar, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ia iaVar) {
        super(context, s0Var, bitmap, bitmap2, iaVar);
        this.E = qbVar;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f41199a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        qb qbVar = this.E;
        qbVar.f5429k1.b(indexOf);
        qbVar.b(mVar);
    }
}
