package di;

import android.content.Context;
import android.graphics.Bitmap;
public final class g6 extends qg.c1 {
    public final rb E;

    public g6(rb rbVar, Context context, qg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ja jaVar) {
        super(context, q0Var, bitmap, bitmap2, jaVar);
        this.E = rbVar;
    }

    @Override
    public final void g(qg.m mVar) {
        int indexOf = qg.m.f44480a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        rb rbVar = this.E;
        rbVar.f7972k1.b(indexOf);
        rbVar.o(mVar);
    }
}
