package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class a38 extends ReplacementSpan {
    public final byte a;
    public int b;
    public final Object c;

    public a38(int i) {
        this.a = (byte) 1;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = i;
        paint.setColor(cmb.p1(0.3f, cmb.w0(null, cmb.de, false)));
    }

    public final void a(int i) {
        x28 x28Var = (x28) this.c;
        if (x28Var != null) {
            x28Var.a = i / 2.0f;
            x28Var.d();
            this.b = i;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                x28 x28Var = (x28) obj;
                if (x28Var != null) {
                    int i6 = (i3 + i5) / 2;
                    int i7 = this.b;
                    x28Var.setBounds((int) (gm.L(3.0f) + f), i6 - this.b, (int) (f + gm.L(5.0f) + i7), i6 + i7);
                    x28Var.draw(canvas);
                    return;
                }
                return;
            default:
                float L = ((i3 + i5) / 2.0f) + gm.L(1.33f);
                RectF rectF = gm.P;
                float L2 = gm.L(6.66f) / 2.0f;
                rectF.set(f, L - L2, this.b + f, L + L2);
                Paint paint2 = (Paint) obj;
                paint2.setColor(cmb.p1(0.3f, cmb.w0(null, cmb.de, false)));
                canvas.drawRoundRect(rectF, L2, L2, paint2);
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return gm.L(3.0f) + gm.L(3.0f) + this.b;
            default:
                return this.b;
        }
    }

    public a38(boolean z, int i, int i2) {
        this.a = (byte) 0;
        this.b = gm.L(21.0f);
        this.c = z ? x28.c(i, i2) : x28.a(i, i2);
    }
}
