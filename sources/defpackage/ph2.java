package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class ph2 extends ReplacementSpan {
    public final byte a;
    public final Object b;

    public ph2(p09 p09Var) {
        this.a = (byte) 0;
        this.b = p09Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        switch (this.a) {
            case 0:
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                int i6 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2) + i4;
                p09 p09Var = (p09) this.b;
                int i7 = (int) f;
                p09Var.setBounds(i7, i6 - gm.L(12.0f), gm.L(24.0f) + i7, gm.L(12.0f) + i6);
                p09Var.setAlpha(paint.getAlpha());
                p09Var.draw(canvas);
                return;
            case 1:
            case 2:
            case 3:
            default:
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    int i3 = fontMetricsInt2.ascent;
                    int i4 = (fontMetricsInt2.descent + i3) / 2;
                    int x = b10.x(12.0f, i4, i3);
                    fontMetricsInt.top = x;
                    fontMetricsInt.ascent = x;
                    int e = kt6.e(12.0f, i4, fontMetricsInt2.descent);
                    fontMetricsInt.bottom = e;
                    fontMetricsInt.descent = e;
                }
                return gm.L(32.0f);
            case 1:
                return ((j37) obj).y;
            case 2:
                return (int) ((ji7) obj).i2;
            case 3:
                return ((dw3) obj).getSize(paint, charSequence, i, i2, fontMetricsInt);
            default:
                return (int) ((t9c) obj).n2;
        }
    }

    public ph2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    private final void d(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
