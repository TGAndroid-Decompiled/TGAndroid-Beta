package kh;

import android.content.Context;
import android.graphics.Bitmap;
public final class w5 extends xf.c1 {
    public final ya A;

    public w5(ya yaVar, Context context, xf.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ba baVar) {
        super(context, q0Var, bitmap, bitmap2, baVar);
        this.A = yaVar;
    }

    @Override
    public final void g(xf.m mVar) {
        int indexOf = xf.m.f49272a.indexOf(mVar);
        int i9 = indexOf + 1;
        if (i9 <= 1) {
            indexOf = i9;
        }
        ya yaVar = this.A;
        yaVar.f15279g1.b(indexOf);
        yaVar.n(mVar);
    }
}
