package lg;

import org.telegram.ui.Components.on;
public final class i extends on {
    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }
}
