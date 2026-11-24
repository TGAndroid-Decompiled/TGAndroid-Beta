package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class pzb extends View {
    public final byte a;

    public pzb(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        switch (this.a) {
            case 1:
                if (k96.a0) {
                    L = 0.0f;
                } else {
                    L = gl.L(20.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (k96.a0) {
                    i = gl.L(20.0f);
                } else {
                    i = 0;
                }
                canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (gl.q.y * 0.4f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }
}
