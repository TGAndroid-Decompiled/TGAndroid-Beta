package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.style.ReplacementSpan;
public final class zm3 extends ReplacementSpan {
    public final Paint a;
    public final Path b;
    public final float c;

    public zm3() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        this.c = 3.25f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.N(1.25f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float L = f + hl.L(3.0f);
        float textSize = i4 - (paint.getTextSize() * 0.36f);
        int color = paint.getColor();
        Paint paint2 = this.a;
        paint2.setColor(color);
        Path path = this.b;
        path.rewind();
        float f2 = this.c;
        path.moveTo(L, textSize - hl.L(f2));
        path.lineTo(hl.L(f2) + L, textSize);
        path.lineTo(L, textSize + hl.L(f2));
        canvas.drawPath(path, paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return hl.L(this.c + 3.0f + 1.0f);
    }
}
