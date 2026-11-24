package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class ll6 extends ReplacementSpan {
    public static final int h = 0;
    public final String a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final Paint f;

    public ll6(String str, Bitmap bitmap, int i, int i2, int i3, int i4) {
        Paint paint = new Paint(3);
        this.f = paint;
        this.a = str;
        this.b = bitmap;
        this.c = i;
        this.d = i2;
        this.e = i4;
        paint.setColor(i3);
    }

    public static ll6 a(String str, int i, float f) {
        lz5 a;
        if (str != null && !str.isEmpty() && (a = lz5.a(str, f, true)) != null) {
            return new ll6(str, a.a, a.b, a.c, i, a.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f, i4 - (this.d - this.e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = this.d;
            int i4 = this.e;
            int i5 = -(i3 - i4);
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
            fontMetricsInt.descent = i4;
            fontMetricsInt.bottom = i4;
        }
        return this.c;
    }
}
