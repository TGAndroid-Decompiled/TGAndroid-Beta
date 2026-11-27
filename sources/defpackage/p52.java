package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class p52 extends TextView {
    public float a;
    public boolean b;
    public final Paint c;

    public p52(Context context, Paint paint) {
        super(context);
        this.c = paint;
        this.a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i = (int) ((this.a * 130.0f) + 125.0f);
        Paint paint = this.c;
        paint.setAlpha(i);
        boolean z = this.b;
        float f = this.a;
        if (!z) {
            float f2 = f - 0.026666667f;
            this.a = f2;
            if (f2 <= 0.0f) {
                this.a = 0.0f;
                this.b = true;
            }
        } else {
            float f3 = f + 0.026666667f;
            this.a = f3;
            if (f3 >= 1.0f) {
                this.a = 1.0f;
                this.b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(hl.L(14.0f), getMeasuredHeight() / 2, hl.L(4.0f), paint);
        invalidate();
    }
}
