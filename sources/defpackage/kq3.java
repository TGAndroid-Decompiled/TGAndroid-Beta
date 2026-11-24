package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class kq3 extends lh0 {
    public pq3 d;

    @Override
    public final y59 a() {
        pq3 pq3Var = new pq3(z8c.t0, this.a);
        this.d = pq3Var;
        pq3Var.r = this;
        return pq3Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        pq3 pq3Var = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = pq3Var.f;
        rq3 rq3Var = new rq3(context, pq3Var.c);
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            rq3Var.a((qq3) arrayList.get(i4));
            rq3Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((qq3) arrayList.get(i4)).e = i3;
            i3 += rq3Var.getMeasuredHeight();
        }
        pq3Var.n = i3;
    }
}
