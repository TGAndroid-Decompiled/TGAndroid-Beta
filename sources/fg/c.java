package fg;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.UserConfig;
public final class c extends b {
    public d d;

    @Override
    public final f2.p0 a() {
        d dVar = new d(UserConfig.selectedAccount, this.f6239a);
        this.d = dVar;
        dVar.f6266r = this;
        return dVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d dVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = dVar.f6264f;
        f fVar = new f(context, dVar.f6262c);
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            fVar.a((e) arrayList.get(i13));
            fVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((e) arrayList.get(i13)).f6302e = i12;
            i12 += fVar.getMeasuredHeight();
        }
        dVar.f6265n = i12;
    }
}
