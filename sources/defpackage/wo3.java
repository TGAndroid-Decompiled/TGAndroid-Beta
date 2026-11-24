package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class wo3 extends ReplacementSpan {
    public int b;
    public final Paint a = new Paint(1);
    public float c = 3.0f;
    public float d = 3.0f;

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int color = paint.getColor();
        Paint paint2 = this.a;
        if (color != 0) {
            paint2.setColor(paint.getColor());
        }
        canvas.drawCircle(f + (gl.N(this.c) / 2.0f), ((i5 - i3) / 2) + this.b, gl.N(this.d) / 2.0f, paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return gl.L(this.c);
    }
}
