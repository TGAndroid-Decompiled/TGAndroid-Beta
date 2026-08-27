package ag;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.UserConfig;

public final class c extends b {
    public e d;

    @Override
    public final f2.q0 a() {
        e eVar = new e(UserConfig.selectedAccount, this.f291a);
        this.d = eVar;
        eVar.f348r = this;
        return eVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        e eVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = eVar.f346f;
        g gVar = new g(context, eVar.f344c);
        int measuredHeight2 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            gVar.a((f) arrayList.get(i12));
            gVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((f) arrayList.get(i12)).f371e = measuredHeight2;
            measuredHeight2 += gVar.getMeasuredHeight();
        }
        eVar.f347n = measuredHeight2;
    }
}
