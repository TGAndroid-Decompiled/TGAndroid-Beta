package lh;

import android.content.Context;
import android.graphics.Bitmap;

public final class v5 extends yf.b1 {
    public final va A;

    public v5(va vaVar, Context context, yf.p0 p0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.z9 z9Var) {
        super(context, p0Var, bitmap, bitmap2, z9Var);
        this.A = vaVar;
    }

    @Override
    public final void g(yf.m mVar) {
        int iIndexOf = yf.m.f49979a.indexOf(mVar);
        int i10 = iIndexOf + 1;
        if (i10 <= 1) {
            iIndexOf = i10;
        }
        va vaVar = this.A;
        vaVar.f15969g1.b(iIndexOf);
        vaVar.l(mVar);
    }
}
