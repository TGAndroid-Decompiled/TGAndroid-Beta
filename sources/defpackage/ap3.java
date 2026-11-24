package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class ap3 extends kg0 {
    public fp3 d;

    @Override
    public final w39 a() {
        fp3 fp3Var = new fp3(y6c.t0, this.a);
        this.d = fp3Var;
        fp3Var.r = this;
        return fp3Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        fp3 fp3Var = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = fp3Var.f;
        hp3 hp3Var = new hp3(context, fp3Var.c);
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            hp3Var.a((gp3) arrayList.get(i4));
            hp3Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((gp3) arrayList.get(i4)).e = i3;
            i3 += hp3Var.getMeasuredHeight();
        }
        fp3Var.n = i3;
    }
}
