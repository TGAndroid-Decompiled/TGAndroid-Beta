package cg;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.UserConfig;
public final class c extends b {
    public d d;

    @Override
    public final f2.p0 a() {
        d dVar = new d(UserConfig.selectedAccount, this.f3069a);
        this.d = dVar;
        dVar.f3085r = this;
        return dVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d dVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = dVar.f3083f;
        f fVar = new f(context, dVar.f3081c);
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            fVar.a((e) arrayList.get(i13));
            fVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((e) arrayList.get(i13)).f3105e = i12;
            i12 += fVar.getMeasuredHeight();
        }
        dVar.f3084n = i12;
    }
}
