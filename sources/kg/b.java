package kg;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.d20;
public final class b extends a {
    public c d;

    @Override
    public final s4.g0 a() {
        c cVar = new c(d20.f15147s0, this.f10988a);
        this.d = cVar;
        cVar.f11012r = this;
        return cVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c cVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = cVar.f11010f;
        e eVar = new e(context, cVar.f11009c);
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            eVar.a((d) arrayList.get(i13));
            eVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((d) arrayList.get(i13)).e = i12;
            i12 += eVar.getMeasuredHeight();
        }
        cVar.f11011n = i12;
    }
}
