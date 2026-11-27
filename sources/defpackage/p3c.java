package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class p3c extends View {
    public final byte a;

    public p3c(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        switch (this.a) {
            case 1:
                if (ob6.a0) {
                    L = 0.0f;
                } else {
                    L = hl.L(20.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (ob6.a0) {
                    i = hl.L(20.0f);
                } else {
                    i = 0;
                }
                canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (hl.q.y * 0.4f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }
}
