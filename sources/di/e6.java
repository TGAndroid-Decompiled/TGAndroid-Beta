package di;

import android.content.Context;
import android.graphics.Bitmap;
public final class e6 extends qg.c1 {
    public final mb E;

    public e6(mb mbVar, Context context, qg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.la laVar) {
        super(context, q0Var, bitmap, bitmap2, laVar);
        this.E = mbVar;
    }

    @Override
    public final void g(qg.m mVar) {
        int indexOf = qg.m.f43485a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        mb mbVar = this.E;
        mbVar.f7531k1.b(indexOf);
        mbVar.o(mVar);
    }
}
