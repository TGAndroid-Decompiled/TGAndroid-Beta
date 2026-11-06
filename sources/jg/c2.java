package jg;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.z7;
public final class c2 extends z7 {
    public final int O;

    public c2(int i7, Context context, f6 f6Var, boolean z9) {
        super(context, f6Var, z9);
        this.O = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.O) {
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
