package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Components.xq;
public final class v9 extends ReplacementSpan {
    public View f9884a;
    public float d;
    public boolean f9887e;
    public long f9888f;
    public boolean f9889n;
    public boolean f9890r;
    public int f9885b = 1;
    public int f9886c = 2;
    public final xq h = new xq(0.0f, 0.5f, 0.5f, 1.0f);

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
            v9 v9Var = new v9();
            v9Var.f9884a = textView;
            v9Var.f9889n = false;
            spannableStringBuilder.setSpan(v9Var, i11, i11 + i10, 33);
            i11 += i10 - 1;
            i11++;
        }
        if (spannableStringBuilder == null) {
            return str;
        }
        return spannableStringBuilder;
    }

    public final void b(org.telegram.ui.Cells.t0 t0Var) {
        this.f9884a = t0Var;
        this.f9889n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11;
        float f12;
        float f13;
        float y10;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        if (this.f9890r) {
            f11 = textPaint.getFontMetrics().ascent;
        } else {
            f11 = textPaint.getFontMetrics().top;
        }
        float f14 = -f11;
        float f15 = textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top;
        if (this.f9889n) {
            f12 = 0.05f;
        } else {
            f12 = 0.0365f;
        }
        float f16 = f15 * f12;
        float f17 = f14 - f16;
        if (this.f9887e) {
            if (System.currentTimeMillis() - this.f9888f > 1000) {
                this.f9887e = false;
            }
        } else {
            float f18 = this.d + 0.053333335f;
            this.d = f18;
            if (f18 > 1.0f) {
                this.d = 0.0f;
                int i14 = this.f9885b - 1;
                this.f9885b = i14;
                this.f9886c--;
                if (i14 < 0) {
                    this.f9885b = 1;
                    this.f9886c = 2;
                    this.f9887e = true;
                    this.f9888f = System.currentTimeMillis();
                }
            }
        }
        for (int i15 = 0; i15 < 3; i15++) {
            float f19 = measureText / 2.0f;
            float f20 = (i15 * measureText) + f10 + f19;
            if (i15 == this.f9885b) {
                f20 = org.telegram.messenger.g0.T1(f20, rf.b.d(measureText, i15 + 1, f10, f19), this.d);
                float f21 = this.d;
                if (f21 < 0.5f) {
                    y10 = f21 / 0.5f;
                } else {
                    y10 = org.telegram.messenger.k5.y(f21, 0.5f, 0.5f, 1.0f);
                }
                f13 = org.telegram.messenger.g0.T1(f17, f17 - f19, this.h.getInterpolation(y10));
            } else {
                if (i15 == this.f9886c) {
                    f20 = org.telegram.messenger.g0.T1(f20, rf.b.d(measureText, i15 - 1, f10, f19), this.d);
                }
                f13 = f17;
            }
            canvas.drawCircle(f20, f13, f16, paint);
        }
        View view = this.f9884a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
