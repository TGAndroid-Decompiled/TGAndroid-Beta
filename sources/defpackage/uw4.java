package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public final class uw4 extends ReplacementSpan {
    public final TextPaint a;
    public final Paint b;
    public final RectF c;
    public final boolean d;

    public uw4(int i, boolean z) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new RectF();
        this.d = z;
        textPaint.setTypeface(hl.n1("fonts/rmono.ttf"));
        textPaint.setTextSize(hl.L(13.0f));
        textPaint.setColor(i);
        paint.setColor(aob.p1(0.08f, i));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = this.a;
        float measureText = textPaint.measureText(charSequence, i, i2);
        float f2 = (i3 + i5) / 2.0f;
        RectF rectF = this.c;
        rectF.set(f, f2 - hl.L(9.5f), f + measureText + hl.L(8.0f), hl.L(9.5f) + f2);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), this.b);
        if (this.d) {
            int color = textPaint.getColor();
            int p1 = aob.p1(0.0f, color);
            float L = f + hl.L(4.0f);
            textPaint.setShader(new LinearGradient(L, 0.0f, L + measureText, 0.0f, new int[]{color, p1, p1, color}, new float[]{0.17f, 0.41f, 0.59f, 0.87f}, Shader.TileMode.CLAMP));
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(charSequence, i, i2, f + hl.L(4.0f), f2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
        textPaint.setShader(null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return hl.L(11.0f) + ((int) Math.ceil(this.a.measureText(charSequence, i, i2)));
    }
}
