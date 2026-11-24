package defpackage;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.o;
public final class nv extends View {
    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, o.t1);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(4.0f) + 1);
    }
}
