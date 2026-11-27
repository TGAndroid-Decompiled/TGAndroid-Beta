package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
public final class x7c extends ReplacementSpan {
    public final px3 b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public float c = 1.0f;

    public x7c(px3 px3Var) {
        ewe.a(px3Var, "metadata cannot be null");
        this.b = px3Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        gx3.a().getClass();
        px3 px3Var = this.b;
        u8a u8aVar = px3Var.b;
        Typeface typeface = paint.getTypeface();
        paint.setTypeface((Typeface) u8aVar.d);
        int i6 = px3Var.a << 1;
        canvas.drawText((char[]) u8aVar.b, i6, 2, f, i4, paint);
        paint.setTypeface(typeface);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        px3 px3Var = this.b;
        yf7 b = px3Var.b();
        int a = b.a(14);
        short s2 = 0;
        if (a != 0) {
            s = b.b.getShort(a + b.a);
        } else {
            s = 0;
        }
        this.c = abs / s;
        yf7 b2 = px3Var.b();
        int a2 = b2.a(14);
        if (a2 != 0) {
            b2.b.getShort(a2 + b2.a);
        }
        yf7 b3 = px3Var.b();
        int a3 = b3.a(12);
        if (a3 != 0) {
            s2 = b3.b.getShort(a3 + b3.a);
        }
        short s3 = (short) (s2 * this.c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
