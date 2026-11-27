package defpackage;

import android.content.Context;
import android.view.View;
public final class n4b extends x2b {
    public final o4b P;

    public n4b(o4b o4bVar, Context context, vnb vnbVar) {
        super(vnbVar, context, false);
        this.P = o4bVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        s4b s4bVar = this.P.r;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(s4bVar.I1, 1073741824), View.MeasureSpec.makeMeasureSpec(s4bVar.I1, 1073741824));
    }
}
