package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
public final class r8c extends ReplacementSpan {
    public View a;
    public float d;
    public boolean e;
    public long f;
    public boolean n;
    public boolean r;
    public int b = 1;
    public int c = 2;
    public final d53 h = new d53(0.0f, 0.5f, 0.5f, 1.0f);

    public static CharSequence a(TextView textView, String str) {
        int i;
        int i2;
        SpannableStringBuilder spannableStringBuilder = null;
        int i3 = 0;
        while (i3 < str.length()) {
            if (str.charAt(i3) == 8230) {
                i2 = 1;
            } else {
                i2 = (str.charAt(i3) == '.' && (i = i3 + 2) < str.length() && str.charAt(i3 + 1) == '.' && str.charAt(i) == '.') ? 3 : 3;
                i3++;
            }
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            r8c r8cVar = new r8c();
            r8cVar.a = textView;
            r8cVar.n = false;
            spannableStringBuilder.setSpan(r8cVar, i3, i3 + i2, 33);
            i3 += i2 - 1;
            i3++;
        }
        if (spannableStringBuilder == null) {
            return str;
        }
        return spannableStringBuilder;
    }

    public final void b(cm1 cm1Var) {
        this.a = cm1Var;
        this.n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        float f3;
        float f4;
        float y;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        if (this.r) {
            f2 = textPaint.getFontMetrics().ascent;
        } else {
            f2 = textPaint.getFontMetrics().top;
        }
        float f5 = -f2;
        float f6 = textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top;
        if (this.n) {
            f3 = 0.05f;
        } else {
            f3 = 0.0365f;
        }
        float f7 = f6 * f3;
        float f8 = f5 - f7;
        if (this.e) {
            if (System.currentTimeMillis() - this.f > 1000) {
                this.e = false;
            }
        } else {
            float f9 = this.d + 0.053333335f;
            this.d = f9;
            if (f9 > 1.0f) {
                this.d = 0.0f;
                int i6 = this.b - 1;
                this.b = i6;
                this.c--;
                if (i6 < 0) {
                    this.b = 1;
                    this.c = 2;
                    this.e = true;
                    this.f = System.currentTimeMillis();
                }
            }
        }
        for (int i7 = 0; i7 < 3; i7++) {
            float f10 = measureText / 2.0f;
            float f11 = (i7 * measureText) + f + f10;
            if (i7 == this.b) {
                f11 = gm.R1(f11, ts2.i(measureText, i7 + 1, f, f10), this.d);
                float f12 = this.d;
                if (f12 < 0.5f) {
                    y = f12 / 0.5f;
                } else {
                    y = td4.y(f12, 0.5f, 0.5f, 1.0f);
                }
                f4 = gm.R1(f8, f8 - f10, this.h.getInterpolation(y));
            } else {
                if (i7 == this.c) {
                    f11 = gm.R1(f11, ts2.i(measureText, i7 - 1, f, f10), this.d);
                }
                f4 = f8;
            }
            canvas.drawCircle(f11, f4, f7, paint);
        }
        View view = this.a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
