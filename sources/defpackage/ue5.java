package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
public final class ue5 extends TextView {
    public boolean a;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth(), getHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(48.0f) + 1);
    }

    public void setNeedDivider(boolean z) {
        this.a = z;
    }
}
