package ai;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
public final class z1 extends ReplacementSpan {
    public final long f1608a;
    public final int f1609b;
    public int f1610c;

    public z1(long j3, int i7) {
        this.f1608a = j3;
        this.f1609b = i7;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float f11;
        float f12;
        z1 z1Var = this;
        CharSequence charSequence2 = charSequence;
        long uptimeMillis = SystemClock.uptimeMillis();
        int color = paint.getColor();
        float f13 = i12;
        float textSize = f13 - (paint.getTextSize() * 0.35f);
        paint.setColor(z1Var.f1609b);
        int i15 = i7;
        while (i15 < i10) {
            int charCount = Character.charCount(Character.codePointAt(charSequence2, i15)) + i15;
            while (charCount < i10 && Character.getType(charSequence2.charAt(charCount)) == 6) {
                charCount++;
            }
            float f14 = f13;
            float C = a8.p0.C((float) ((uptimeMillis - z1Var.f1608a) - ((i15 - i7) * 22)), 320.0f, 1.0f, 0.0f);
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
                    x1[] x1VarArr = (x1[]) ((Spanned) charSequence2).getSpans(i15, i15 + 1, x1.class);
                    int length = x1VarArr.length;
                    int i16 = 0;
                    float f17 = 1.0f;
                    while (i16 < length) {
                        x1[] x1VarArr2 = x1VarArr;
                        f17 *= x1VarArr2[i16].a(uptimeMillis);
                        i16++;
                        x1VarArr = x1VarArr2;
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
            z1Var = this;
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
