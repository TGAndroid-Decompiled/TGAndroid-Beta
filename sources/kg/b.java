package kg;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.e20;
public final class b extends a {
    public c d;

    @Override
    public final s4.g0 a() {
        c cVar = new c(e20.f15506s0, this.f10989a);
        this.d = cVar;
        cVar.f11013r = this;
        return cVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c cVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = cVar.f11011f;
        e eVar = new e(context, cVar.f11010c);
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            eVar.a((d) arrayList.get(i13));
            eVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((d) arrayList.get(i13)).e = i12;
            i12 += eVar.getMeasuredHeight();
        }
        cVar.f11012n = i12;
    }
}
