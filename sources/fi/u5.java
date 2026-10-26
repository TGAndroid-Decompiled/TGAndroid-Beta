package fi;

import android.content.Context;
import android.graphics.Bitmap;
public final class u5 extends rg.c1 {
    public final ta E;

    public u5(ta taVar, Context context, rg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.la laVar) {
        super(context, q0Var, bitmap, bitmap2, laVar);
        this.E = taVar;
    }

    @Override
    public final void g(rg.m mVar) {
        int indexOf = rg.m.f47465a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        ta taVar = this.E;
        taVar.Z0.b(indexOf);
        taVar.i(mVar);
    }
}
