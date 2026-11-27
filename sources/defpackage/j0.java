package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
public final class j0 extends ReplacementSpan {
    public final Paint a;
    public final Path b;
    public final Rect c;
    public float d;
    public float e;
    public float f;
    public float h;
    public float n;

    public j0() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        this.c = new Rect();
        this.d = -1.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public final void a(Paint paint) {
        float textSize = paint.getTextSize();
        if (textSize == this.d) {
            return;
        }
        this.d = textSize;
        this.e = 0.62f * textSize;
        this.f = 0.1f * textSize;
        this.h = textSize * 0.3f;
        Rect rect = this.c;
        paint.getTextBounds("x", 0, 1, rect);
        this.n = rect.height();
        float f = this.e;
        float f2 = 0.475f * f;
        float f3 = f * 0.46f;
        Path path = this.b;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(this.e, 0.0f);
        path.moveTo(this.e - f2, -f3);
        path.lineTo(this.e, 0.0f);
        path.lineTo(this.e - f2, f3);
        this.a.setStrokeWidth(this.f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        a(paint);
        int color = paint.getColor();
        Paint paint2 = this.a;
        paint2.setColor(color);
        canvas.save();
        float f2 = (this.f / 2.0f) + f;
        uh9.n(this.n, 2.0f, i4, f2, canvas);
        canvas.drawPath(this.b, paint2);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        a(paint);
        return (int) Math.ceil(this.f + this.e + this.h);
    }
}
