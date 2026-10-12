package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
public final class qc extends ReplacementSpan {
    public View f1630a;
    public float d;
    public boolean f1633e;
    public long f1634f;
    public boolean f1635n;
    public boolean f1636r;
    public int f1631b = 1;
    public int f1632c = 2;
    public final js h = new js(0.0f, 0.5f, 0.5f, 1.0f);

    public static CharSequence a(TextView textView, String str) {
        int i10;
        int i11;
        SpannableStringBuilder spannableStringBuilder = null;
        if (str == null) {
            return null;
        }
        int i12 = 0;
        while (i12 < str.length()) {
            if (str.charAt(i12) == 8230) {
                i11 = 1;
            } else {
                i11 = (str.charAt(i12) == '.' && (i10 = i12 + 2) < str.length() && str.charAt(i12 + 1) == '.' && str.charAt(i10) == '.') ? 3 : 3;
                i12++;
            }
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            qc qcVar = new qc();
            qcVar.f1630a = textView;
            qcVar.f1635n = false;
            spannableStringBuilder.setSpan(qcVar, i12, i12 + i11, 33);
            i12 += i11 - 1;
            i12++;
        }
        if (spannableStringBuilder == null) {
            return str;
        }
        return spannableStringBuilder;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        this.f1630a = w0Var;
        this.f1635n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10;
        float f11;
        float f12;
        float y3;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        if (this.f1636r) {
            f10 = textPaint.getFontMetrics().ascent;
        } else {
            f10 = textPaint.getFontMetrics().top;
        }
        float f13 = -f10;
        float f14 = textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top;
        if (this.f1635n) {
            f11 = 0.05f;
        } else {
            f11 = 0.0365f;
        }
        float f15 = f14 * f11;
        float f16 = f13 - f15;
        if (this.f1633e) {
            if (System.currentTimeMillis() - this.f1634f > 1000) {
                this.f1633e = false;
            }
        } else {
            float f17 = this.d + 0.053333335f;
            this.d = f17;
            if (f17 > 1.0f) {
                this.d = 0.0f;
                int i15 = this.f1631b - 1;
                this.f1631b = i15;
                this.f1632c--;
                if (i15 < 0) {
                    this.f1631b = 1;
                    this.f1632c = 2;
                    this.f1633e = true;
                    this.f1634f = System.currentTimeMillis();
                }
            }
        }
        for (int i16 = 0; i16 < 3; i16++) {
            float f18 = measureText / 2.0f;
            float f19 = (i16 * measureText) + f7 + f18;
            if (i16 == this.f1631b) {
                f19 = AndroidUtilities.lerp(f19, sc.v.d(measureText, i16 + 1, f7, f18), this.d);
                float f20 = this.d;
                if (f20 < 0.5f) {
                    y3 = f20 / 0.5f;
                } else {
                    y3 = org.telegram.messenger.v0.y(f20, 0.5f, 0.5f, 1.0f);
                }
                f12 = AndroidUtilities.lerp(f16, f16 - f18, this.h.getInterpolation(y3));
            } else {
                if (i16 == this.f1632c) {
                    f19 = AndroidUtilities.lerp(f19, sc.v.d(measureText, i16 - 1, f7, f18), this.d);
                }
                f12 = f16;
            }
            canvas.drawCircle(f19, f12, f15, paint);
        }
        View view = this.f1630a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
