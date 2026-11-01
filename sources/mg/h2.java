package mg;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.ui.ActionBar.t6;
public final class h2 extends ReplacementSpan {
    public final TextPaint f13130a;
    public final Paint f13131b;
    public final RectF f13132c;
    public final boolean d;

    public h2(int i10, boolean z10) {
        TextPaint textPaint = new TextPaint(1);
        this.f13130a = textPaint;
        Paint paint = new Paint(1);
        this.f13131b = paint;
        this.f13132c = new RectF();
        this.d = z10;
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setColor(i10);
        paint.setColor(t6.r1(0.08f, i10));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaint = this.f13130a;
        float measureText = textPaint.measureText(charSequence, i10, i11);
        float f10 = (i12 + i14) / 2.0f;
        RectF rectF = this.f13132c;
        rectF.set(f7, f10 - org.telegram.messenger.i0.L(9.5f), f7 + measureText + org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(9.5f) + f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), this.f13131b);
        if (this.d) {
            int color = textPaint.getColor();
            int r12 = t6.r1(0.0f, color);
            float L = f7 + org.telegram.messenger.i0.L(4.0f);
            textPaint.setShader(new LinearGradient(L, 0.0f, L + measureText, 0.0f, new int[]{color, r12, r12, color}, new float[]{0.17f, 0.41f, 0.59f, 0.87f}, Shader.TileMode.CLAMP));
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(charSequence, i10, i11, f7 + org.telegram.messenger.i0.L(4.0f), f10 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
        textPaint.setShader(null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return org.telegram.messenger.i0.L(11.0f) + ((int) Math.ceil(this.f13130a.measureText(charSequence, i10, i11)));
    }
}
