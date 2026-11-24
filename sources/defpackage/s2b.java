package defpackage;

import android.content.Context;
import android.view.View;
public final class s2b extends y0b {
    public final t2b P;

    public s2b(t2b t2bVar, Context context, ylb ylbVar) {
        super(ylbVar, context, false);
        this.P = t2bVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        x2b x2bVar = this.P.r;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(x2bVar.I1, 1073741824), View.MeasureSpec.makeMeasureSpec(x2bVar.I1, 1073741824));
    }
}
