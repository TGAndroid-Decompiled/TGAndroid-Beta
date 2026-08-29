package nh;

import android.content.Context;
import android.graphics.Bitmap;
public final class j5 extends ag.t1 {
    public final ja A;

    public j5(ja jaVar, Context context, ag.f1 f1Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ga gaVar) {
        super(context, f1Var, bitmap, bitmap2, gaVar);
        this.A = jaVar;
    }

    @Override
    public final void g(ag.m mVar) {
        int indexOf = ag.m.f584a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        ja jaVar = this.A;
        jaVar.f18634g1.b(indexOf);
        jaVar.q(mVar);
    }
}
