package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.a;
public final class v65 extends View {
    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), a.getCurrentActionBarHeight());
    }
}
