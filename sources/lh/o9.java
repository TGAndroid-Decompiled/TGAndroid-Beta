package lh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class o9 extends ReplacementSpan {
    public View f16035a;
    public float d;
    public boolean f16038e;
    public long f16039f;
    public boolean f16040n;
    public boolean f16041r;
    public int f16036b = 1;
    public int f16037c = 2;
    public final jr h = new jr(0.0f, 0.5f, 0.5f, 1.0f);

    public final void a(org.telegram.ui.Cells.v0 v0Var) {
        this.f16035a = v0Var;
        this.f16040n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        float f10;
        float f11;
        float f12;
        float a2;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        if (this.f16041r) {
            f10 = textPaint.getFontMetrics().ascent;
        } else {
            f10 = textPaint.getFontMetrics().top;
        }
        float f13 = -f10;
        float f14 = textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top;
        if (this.f16040n) {
            f11 = 0.05f;
        } else {
            f11 = 0.0365f;
        }
        float f15 = f14 * f11;
        float f16 = f13 - f15;
        if (this.f16038e) {
            if (System.currentTimeMillis() - this.f16039f > 1000) {
                this.f16038e = false;
            }
        } else {
            float f17 = this.d + 0.053333335f;
            this.d = f17;
            if (f17 > 1.0f) {
                this.d = 0.0f;
                int i15 = this.f16036b - 1;
                this.f16036b = i15;
                this.f16037c--;
                if (i15 < 0) {
                    this.f16036b = 1;
                    this.f16037c = 2;
                    this.f16038e = true;
                    this.f16039f = System.currentTimeMillis();
                }
            }
        }
        for (int i16 = 0; i16 < 3; i16++) {
            float f18 = measureText / 2.0f;
            float f19 = (i16 * measureText) + f9 + f18;
            if (i16 == this.f16036b) {
                f19 = AndroidUtilities.lerp(f19, com.google.android.recaptcha.internal.a.d(measureText, i16 + 1, f9, f18), this.d);
                float f20 = this.d;
                if (f20 < 0.5f) {
                    a2 = f20 / 0.5f;
                } else {
                    a2 = org.telegram.messenger.x3.a(f20, 0.5f, 0.5f, 1.0f);
                }
                f12 = AndroidUtilities.lerp(f16, f16 - f18, this.h.getInterpolation(a2));
            } else {
                if (i16 == this.f16037c) {
                    f19 = AndroidUtilities.lerp(f19, com.google.android.recaptcha.internal.a.d(measureText, i16 - 1, f9, f18), this.d);
                }
                f12 = f16;
            }
            canvas.drawCircle(f19, f12, f15, paint);
        }
        View view = this.f16035a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
