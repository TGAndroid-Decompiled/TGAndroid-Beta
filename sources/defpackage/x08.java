package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class x08 extends ReplacementSpan {
    public final byte a;
    public int b;
    public final Object c;

    public x08(int i) {
        this.a = (byte) 1;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = i;
        paint.setColor(bkb.p1(0.3f, bkb.w0(null, bkb.de, false)));
    }

    public final void a(int i) {
        u08 u08Var = (u08) this.c;
        if (u08Var != null) {
            u08Var.a = i / 2.0f;
            u08Var.d();
            this.b = i;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                u08 u08Var = (u08) obj;
                if (u08Var != null) {
                    int i6 = (i3 + i5) / 2;
                    int i7 = this.b;
                    u08Var.setBounds((int) (gl.L(3.0f) + f), i6 - this.b, (int) (f + gl.L(5.0f) + i7), i6 + i7);
                    u08Var.draw(canvas);
                    return;
                }
                return;
            default:
                float L = ((i3 + i5) / 2.0f) + gl.L(1.33f);
                RectF rectF = gl.P;
                float L2 = gl.L(6.66f) / 2.0f;
                rectF.set(f, L - L2, this.b + f, L + L2);
                Paint paint2 = (Paint) obj;
                paint2.setColor(bkb.p1(0.3f, bkb.w0(null, bkb.de, false)));
                canvas.drawRoundRect(rectF, L2, L2, paint2);
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return gl.L(3.0f) + gl.L(3.0f) + this.b;
            default:
                return this.b;
        }
    }

    public x08(boolean z, int i, int i2) {
        this.a = (byte) 0;
        this.b = gl.L(21.0f);
        this.c = z ? u08.c(i, i2) : u08.a(i, i2);
    }
}
