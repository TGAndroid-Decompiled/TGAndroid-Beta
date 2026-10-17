package ei;

import android.content.Context;
import android.graphics.Bitmap;
public final class v5 extends qg.e1 {
    public final xa E;

    public v5(xa xaVar, Context context, qg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ja jaVar) {
        super(context, s0Var, bitmap, bitmap2, jaVar);
        this.E = xaVar;
    }

    @Override
    public final void g(qg.m mVar) {
        int indexOf = qg.m.f44585a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        xa xaVar = this.E;
        xaVar.f9020k1.b(indexOf);
        xaVar.o(mVar);
    }
}
