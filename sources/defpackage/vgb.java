package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class vgb extends FrameLayout {
    public TextView a;

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }
}
