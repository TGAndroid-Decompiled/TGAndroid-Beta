package defpackage;

import android.view.ViewGroup;
import org.telegram.ui.Components.RadialProgressView;
public final class y2c extends RadialProgressView {
    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = gl.m / 2;
    }
}
