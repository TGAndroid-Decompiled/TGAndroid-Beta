package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
public final class fo3 extends ReplacementSpan {
    public final long a;
    public final int b;
    public int c;

    public fo3(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        float f2;
        float f3;
        fo3 fo3Var = this;
        CharSequence charSequence2 = charSequence;
        long uptimeMillis = SystemClock.uptimeMillis();
        int color = paint.getColor();
        float f4 = i4;
        float textSize = f4 - (paint.getTextSize() * 0.35f);
        paint.setColor(fo3Var.b);
        int i7 = i;
        while (i7 < i2) {
            int charCount = Character.charCount(Character.codePointAt(charSequence2, i7)) + i7;
            while (charCount < i2 && Character.getType(charSequence2.charAt(charCount)) == 6) {
                charCount++;
            }
            float f5 = f4;
            float w = qu6.w((float) ((uptimeMillis - fo3Var.a) - ((i7 - i) * 22)), 320.0f, 1.0f, 0.0f);
            if (w > 0.0f) {
                float measureText = paint.measureText(charSequence2, i, i7) + f;
                float measureText2 = paint.measureText(charSequence2, i7, charCount);
                float f6 = w - 1.0f;
                float f7 = (((1.4f * f6 * f6) + (2.4f * f6 * f6 * f6) + 1.0f) * 0.39999998f) + 0.6f;
                float min = 1.0f - Math.min(1.0f, w * 1.6f);
                float alpha = (1.0f - ((min * min) * min)) * Color.alpha(i6);
                if (!(charSequence2 instanceof Spanned)) {
                    f2 = alpha;
                    f3 = 1.0f;
                } else {
                    f2 = alpha;
                    do3[] do3VarArr = (do3[]) ((Spanned) charSequence2).getSpans(i7, i7 + 1, do3.class);
                    int length = do3VarArr.length;
                    int i8 = 0;
                    float f8 = 1.0f;
                    while (i8 < length) {
                        do3[] do3VarArr2 = do3VarArr;
                        f8 *= do3VarArr2[i8].a(uptimeMillis);
                        i8++;
                        do3VarArr = do3VarArr2;
                    }
                    f3 = f8;
                }
                paint.setAlpha((int) (f2 * f3));
                canvas.save();
                canvas.scale(f7, f7, (measureText2 / 2.0f) + measureText, textSize);
                f4 = f5;
                canvas.drawText(charSequence2, i7, charCount, measureText, f4, paint);
                canvas.restore();
            } else {
                f4 = f5;
            }
            fo3Var = this;
            charSequence2 = charSequence;
            i7 = charCount;
        }
        paint.setColor(color);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return Math.round(paint.measureText(charSequence, i, i2));
    }
}
