package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public final class yg6 extends ReplacementSpan {
    public final String a;
    public final boolean b;
    public final TextPaint c;
    public final Paint d;
    public final float e;
    public final ah6 f;

    public yg6(ah6 ah6Var, int i, boolean z) {
        this.f = ah6Var;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i);
        this.a = valueOf;
        this.b = z;
        textPaint.setTextSize(gl.N(11.0f));
        textPaint.setTypeface(gl.o());
        this.e = Math.max(gl.L(7.333f), textPaint.measureText(valueOf)) + gl.L(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        float L = f + gl.L(5.0f);
        float L2 = ((i3 + i5) / 2.0f) + gl.L(1.0f);
        float L3 = gl.L(17.333f) / 2.0f;
        if (this.b) {
            i6 = bkb.Ei;
        } else {
            i6 = bkb.T9;
        }
        ah6 ah6Var = this.f;
        int themedColor = ah6Var.getThemedColor(i6);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = ah6Var.getThemedColor(bkb.r8);
        TextPaint textPaint = this.c;
        textPaint.setColor(themedColor2);
        RectF rectF = gl.P;
        float f2 = this.e;
        rectF.set(L, L2 - L3, L + f2, L2 + L3);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        String str = this.a;
        canvas.drawText(str, ((f2 - textPaint.measureText(str)) / 2.0f) + L, L2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(gl.L(5.0f) + this.e);
    }
}
