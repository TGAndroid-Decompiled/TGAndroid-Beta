package jg;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.y7;
public final class b2 extends y7 {
    public final int P;

    public b2(int i7, Context context, e6 e6Var, boolean z10) {
        super(context, e6Var, z10);
        this.P = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.P) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(82.0f), 1073741824));
                return;
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(82.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(82.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(82.0f), 1073741824));
                return;
        }
    }
}
