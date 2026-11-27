package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.a;
public final class vqc extends ReplacementSpan {
    public static Typeface x;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final vnb e;
    public final TextPaint f;
    public final Paint h;
    public final RectF n;
    public LinearGradient r;
    public float s;
    public int w;

    public vqc(String str, String str2, String str3, String str4, vnb vnbVar) {
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.h = new Paint(1);
        this.n = new RectF();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = vnbVar;
        Typeface typeface = x;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                gk.e();
                typeface = new Typeface.Builder(a.b.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
                x = typeface;
            } else {
                typeface = hl.n1("fonts/rmono.ttf");
                x = typeface;
            }
        }
        textPaint.setTypeface(typeface);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        float f3;
        Paint paint2 = this.f;
        paint2.setTextSize(paint.getTextSize() * 0.95f);
        int color = paint.getColor();
        paint2.setColor(color);
        int v0 = aob.v0(aob.a7, this.e);
        Paint paint3 = this.h;
        paint3.setColor(v0);
        Paint.FontMetricsInt fontMetricsInt = paint2.getFontMetricsInt();
        float f4 = i4;
        float f5 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + f4;
        float L = hl.L(6.0f);
        float L2 = hl.L(5.0f);
        String str = this.a;
        float L3 = hl.L(21.0f) / 2.0f;
        float f6 = f5 - L3;
        float f7 = 2.0f * L2;
        float f8 = f5 + L3;
        RectF rectF = this.n;
        rectF.set(f, f6, paint2.measureText(str) + f + f7, f8);
        canvas.drawRoundRect(rectF, L, L, paint3);
        canvas.drawText(str, f + L2, f4, paint2);
        float L4 = hl.L(3.0f) + rectF.right;
        String str2 = this.b;
        float measureText = (paint2.measureText(" ") * 0.3f) + paint2.measureText(str2);
        String str3 = this.c;
        float measureText2 = paint2.measureText(str3) + measureText;
        rectF.set(L4, f6, L4 + measureText2 + f7, f8);
        canvas.drawRoundRect(rectF, L, L, paint3);
        float f9 = L4 + L2;
        LinearGradient linearGradient = this.r;
        if (linearGradient != null && this.s == f9 && this.w == color) {
            f2 = f7;
            f3 = f9;
        } else {
            float max = Math.max(0.0f, Math.min(0.4f, paint2.measureText("0") / measureText2));
            f2 = f7;
            float min = Math.min(0.49f, ((0.5f - max) * 0.75f) + max);
            int p1 = aob.p1(0.0f, color);
            linearGradient = new LinearGradient(f9, 0.0f, f9 + measureText2, 0.0f, new int[]{color, color, p1, p1, color, color}, new float[]{0.0f, max, min, 1.0f - min, 1.0f - max, 1.0f}, Shader.TileMode.CLAMP);
            f3 = f9;
            this.r = linearGradient;
            this.s = f3;
            this.w = color;
        }
        paint2.setShader(linearGradient);
        canvas.drawText(str2, f3, f4, paint2);
        canvas.drawText(str3, (f3 + measureText2) - paint2.measureText(str3), f4, paint2);
        paint2.setShader(null);
        float L5 = hl.L(3.0f) + rectF.right;
        String str4 = this.d;
        rectF.set(L5, f6, paint2.measureText(str4) + L5 + f2, f8);
        canvas.drawRoundRect(rectF, L, L, paint3);
        canvas.drawText(str4, L5 + L2, f4, paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        TextPaint textPaint = this.f;
        textPaint.setTextSize(paint.getTextSize() * 0.95f);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
            float f = (fontMetricsInt2.ascent + fontMetricsInt2.descent) / 2.0f;
            int floor = (int) Math.floor(f - (hl.L(21.0f) / 2.0f));
            fontMetricsInt.top = floor;
            fontMetricsInt.ascent = floor;
            int ceil = (int) Math.ceil((hl.L(21.0f) / 2.0f) + f);
            fontMetricsInt.bottom = ceil;
            fontMetricsInt.descent = ceil;
            fontMetricsInt.leading = 0;
        }
        float L = hl.L(5.0f) * 2.0f;
        float measureText = textPaint.measureText(this.c) + (textPaint.measureText(" ") * 0.3f) + textPaint.measureText(this.b);
        float measureText2 = textPaint.measureText(this.d);
        return (int) Math.ceil((hl.L(3.0f) * 2.0f) + measureText2 + measureText + textPaint.measureText(this.a) + L + L + L);
    }
}
