package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class tg2 extends ReplacementSpan {
    public final byte a;
    public final Object b;

    public tg2(b29 b29Var) {
        this.a = (byte) 0;
        this.b = b29Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        switch (this.a) {
            case 0:
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                int i6 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2) + i4;
                b29 b29Var = (b29) this.b;
                int i7 = (int) f;
                b29Var.setBounds(i7, i6 - hl.L(12.0f), hl.L(24.0f) + i7, hl.L(12.0f) + i6);
                b29Var.setAlpha(paint.getAlpha());
                b29Var.draw(canvas);
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
                    int y = c00.y(12.0f, i4, i3);
                    fontMetricsInt.top = y;
                    fontMetricsInt.ascent = y;
                    int e = qu6.e(12.0f, i4, fontMetricsInt2.descent);
                    fontMetricsInt.bottom = e;
                    fontMetricsInt.descent = e;
                }
                return hl.L(32.0f);
            case 1:
                return ((q37) obj).y;
            case 2:
                return (int) ((pi7) obj).i2;
            case 3:
                return ((mv3) obj).getSize(paint, charSequence, i, i2, fontMetricsInt);
            default:
                return (int) ((sbc) obj).n2;
        }
    }

    public tg2(Object obj, byte b) {
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
