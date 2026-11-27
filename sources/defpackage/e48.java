package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class e48 extends ReplacementSpan {
    public final byte a;
    public int b;
    public final Object c;

    public e48(int i) {
        this.a = (byte) 1;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = i;
        paint.setColor(aob.p1(0.3f, aob.w0(null, aob.ee, false)));
    }

    public final void a(int i) {
        b48 b48Var = (b48) this.c;
        if (b48Var != null) {
            b48Var.a = i / 2.0f;
            b48Var.d();
            this.b = i;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                b48 b48Var = (b48) obj;
                if (b48Var != null) {
                    int i6 = (i3 + i5) / 2;
                    int i7 = this.b;
                    b48Var.setBounds((int) (hl.L(3.0f) + f), i6 - this.b, (int) (f + hl.L(5.0f) + i7), i6 + i7);
                    b48Var.draw(canvas);
                    return;
                }
                return;
            default:
                float L = ((i3 + i5) / 2.0f) + hl.L(1.33f);
                RectF rectF = hl.P;
                float L2 = hl.L(6.66f) / 2.0f;
                rectF.set(f, L - L2, this.b + f, L + L2);
                Paint paint2 = (Paint) obj;
                paint2.setColor(aob.p1(0.3f, aob.w0(null, aob.ee, false)));
                canvas.drawRoundRect(rectF, L2, L2, paint2);
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return hl.L(3.0f) + hl.L(3.0f) + this.b;
            default:
                return this.b;
        }
    }

    public e48(boolean z, int i, int i2) {
        this.a = (byte) 0;
        this.b = hl.L(21.0f);
        this.c = z ? b48.c(i, i2) : b48.a(i, i2);
    }
}
