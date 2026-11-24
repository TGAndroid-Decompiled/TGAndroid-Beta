package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class pf4 extends ReplacementSpan {
    public final ylb a;
    public final Paint b;
    public final int c;
    public final uib d;

    public pf4(String str, int i, ylb ylbVar) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = ylbVar;
        this.c = i;
        this.d = new uib(str, 9.33f, gm.o());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int v0 = cmb.v0(this.c, this.a);
        int p1 = cmb.p1(0.15f, v0);
        Paint paint2 = this.b;
        paint2.setColor(p1);
        float f2 = (i5 + i3) / 2.0f;
        RectF rectF = gm.P;
        float L = gm.L(14.66f) / 2.0f;
        rectF.set(f, f2 - L, this.d.j() + f + gm.L(9.33f), L + f2);
        canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint2);
        this.d.c(f + gm.L(4.66f), f2, 1.0f, v0, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.j() + gm.L(9.33f));
    }
}
