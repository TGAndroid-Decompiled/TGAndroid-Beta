package defpackage;

import android.content.Context;
import android.view.View;
public final class p0b extends xya {
    public final q0b P;

    public p0b(q0b q0bVar, Context context, wjb wjbVar) {
        super(wjbVar, context, false);
        this.P = q0bVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        u0b u0bVar = this.P.r;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(u0bVar.I1, 1073741824), View.MeasureSpec.makeMeasureSpec(u0bVar.I1, 1073741824));
    }
}
