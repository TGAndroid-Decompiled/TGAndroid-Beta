package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class mf4 extends ReplacementSpan {
    public final vnb a;
    public final Paint b;
    public final int c;
    public final pkb d;

    public mf4(String str, int i, vnb vnbVar) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = vnbVar;
        this.c = i;
        this.d = new pkb(str, 9.33f, hl.o());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int v0 = aob.v0(this.c, this.a);
        int p1 = aob.p1(0.15f, v0);
        Paint paint2 = this.b;
        paint2.setColor(p1);
        float f2 = (i5 + i3) / 2.0f;
        RectF rectF = hl.P;
        float L = hl.L(14.66f) / 2.0f;
        rectF.set(f, f2 - L, this.d.j() + f + hl.L(9.33f), L + f2);
        canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint2);
        this.d.c(f + hl.L(4.66f), f2, 1.0f, v0, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.j() + hl.L(9.33f));
    }
}
