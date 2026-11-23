package ai;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
public final class i2 extends ReplacementSpan {
    public final long f1242a;
    public final int f1243b;
    public int f1244c;

    public i2(long j3, int i7) {
        this.f1242a = j3;
        this.f1243b = i7;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float f11;
        float f12;
        i2 i2Var = this;
        CharSequence charSequence2 = charSequence;
        long uptimeMillis = SystemClock.uptimeMillis();
        int color = paint.getColor();
        float f13 = i12;
        float textSize = f13 - (paint.getTextSize() * 0.35f);
        paint.setColor(i2Var.f1243b);
        int i15 = i7;
        while (i15 < i10) {
            int charCount = Character.charCount(Character.codePointAt(charSequence2, i15)) + i15;
            while (charCount < i10 && Character.getType(charSequence2.charAt(charCount)) == 6) {
                charCount++;
            }
            float f14 = f13;
            float C = a8.p0.C((float) ((uptimeMillis - i2Var.f1242a) - ((i15 - i7) * 22)), 320.0f, 1.0f, 0.0f);
            if (C > 0.0f) {
                float measureText = paint.measureText(charSequence2, i7, i15) + f10;
                float measureText2 = paint.measureText(charSequence2, i15, charCount);
                float f15 = C - 1.0f;
                float f16 = (((1.4f * f15 * f15) + (2.4f * f15 * f15 * f15) + 1.0f) * 0.39999998f) + 0.6f;
                float min = 1.0f - Math.min(1.0f, C * 1.6f);
                float alpha = (1.0f - ((min * min) * min)) * Color.alpha(i14);
                if (!(charSequence2 instanceof Spanned)) {
                    f11 = alpha;
                    f12 = 1.0f;
                } else {
                    f11 = alpha;
                    g2[] g2VarArr = (g2[]) ((Spanned) charSequence2).getSpans(i15, i15 + 1, g2.class);
                    int length = g2VarArr.length;
                    int i16 = 0;
                    float f17 = 1.0f;
                    while (i16 < length) {
                        g2[] g2VarArr2 = g2VarArr;
                        f17 *= g2VarArr2[i16].a(uptimeMillis);
                        i16++;
                        g2VarArr = g2VarArr2;
                    }
                    f12 = f17;
                }
                paint.setAlpha((int) (f11 * f12));
                canvas.save();
                canvas.scale(f16, f16, (measureText2 / 2.0f) + measureText, textSize);
                f13 = f14;
                canvas.drawText(charSequence2, i15, charCount, measureText, f13, paint);
                canvas.restore();
            } else {
                f13 = f14;
            }
            i2Var = this;
            charSequence2 = charSequence;
            i15 = charCount;
        }
        paint.setColor(color);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return Math.round(paint.measureText(charSequence, i7, i10));
    }
}
