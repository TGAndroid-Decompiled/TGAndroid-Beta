package ih;

import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.v51;
import w7.u;
public final class l extends v51 {
    public final int f8561m3;

    public l(k2 k2Var, k kVar, int i10) {
        super(k2Var, kVar, null, null);
        this.f8561m3 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(i0.L(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(i0.L(u.b(this.f8561m3, 1, 5) * 48), 1073741824));
    }
}
