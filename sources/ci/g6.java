package ci;

import android.content.Context;
import android.graphics.Bitmap;
public final class g6 extends pg.c1 {
    public final qb E;

    public g6(qb qbVar, Context context, pg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ha haVar) {
        super(context, q0Var, bitmap, bitmap2, haVar);
        this.E = qbVar;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f40934a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        qb qbVar = this.E;
        qbVar.f5428k1.b(indexOf);
        qbVar.b(mVar);
    }
}
