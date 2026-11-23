package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Components.nr;
public final class l9 extends ReplacementSpan {
    public View f12279a;
    public float d;
    public boolean f12282e;
    public long f12283f;
    public boolean f12284n;
    public boolean f12285r;
    public int f12280b = 1;
    public int f12281c = 2;
    public final nr h = new nr(0.0f, 0.5f, 0.5f, 1.0f);

    public static CharSequence a(TextView textView, String str) {
        int i7;
        int i10;
        SpannableStringBuilder spannableStringBuilder = null;
        if (str == null) {
            return null;
        }
        int i11 = 0;
        while (i11 < str.length()) {
            if (str.charAt(i11) == 8230) {
                i10 = 1;
            } else {
                i10 = (str.charAt(i11) == '.' && (i7 = i11 + 2) < str.length() && str.charAt(i11 + 1) == '.' && str.charAt(i7) == '.') ? 3 : 3;
                i11++;
            }
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            l9 l9Var = new l9();
            l9Var.f12279a = textView;
            l9Var.f12284n = false;
            spannableStringBuilder.setSpan(l9Var, i11, i11 + i10, 33);
            i11 += i10 - 1;
            i11++;
        }
        if (spannableStringBuilder == null) {
            return str;
        }
        return spannableStringBuilder;
    }

    public final void b(org.telegram.ui.Cells.v0 v0Var) {
        this.f12279a = v0Var;
        this.f12284n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11;
        float f12;
        float f13;
        float y10;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        if (this.f12285r) {
            f11 = textPaint.getFontMetrics().ascent;
        } else {
            f11 = textPaint.getFontMetrics().top;
        }
        float f14 = -f11;
        float f15 = textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top;
        if (this.f12284n) {
            f12 = 0.05f;
        } else {
            f12 = 0.0365f;
        }
        float f16 = f15 * f12;
        float f17 = f14 - f16;
        if (this.f12282e) {
            if (System.currentTimeMillis() - this.f12283f > 1000) {
                this.f12282e = false;
            }
        } else {
            float f18 = this.d + 0.053333335f;
            this.d = f18;
            if (f18 > 1.0f) {
                this.d = 0.0f;
                int i14 = this.f12280b - 1;
                this.f12280b = i14;
                this.f12281c--;
                if (i14 < 0) {
                    this.f12280b = 1;
                    this.f12281c = 2;
                    this.f12282e = true;
                    this.f12283f = System.currentTimeMillis();
                }
            }
        }
        for (int i15 = 0; i15 < 3; i15++) {
            float f19 = measureText / 2.0f;
            float f20 = (i15 * measureText) + f10 + f19;
            if (i15 == this.f12280b) {
                f20 = org.telegram.messenger.g0.T1(f20, p5.c.e(measureText, i15 + 1, f10, f19), this.d);
                float f21 = this.d;
                if (f21 < 0.5f) {
                    y10 = f21 / 0.5f;
                } else {
                    y10 = org.telegram.messenger.f3.y(f21, 0.5f, 0.5f, 1.0f);
                }
                f13 = org.telegram.messenger.g0.T1(f17, f17 - f19, this.h.getInterpolation(y10));
            } else {
                if (i15 == this.f12281c) {
                    f20 = org.telegram.messenger.g0.T1(f20, p5.c.e(measureText, i15 - 1, f10, f19), this.d);
                }
                f13 = f17;
            }
            canvas.drawCircle(f20, f13, f16, paint);
        }
        View view = this.f12279a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
