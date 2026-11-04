package kg;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.y7;
public final class x1 extends y7 {
    public final int P;

    public x1(int i3, Context context, e6 e6Var, boolean z10) {
        super(context, e6Var, z10);
        this.P = i3;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.P) {
            case 0:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(82.0f), 1073741824));
                return;
            case 1:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(82.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(82.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(82.0f), 1073741824));
                return;
        }
    }
}
