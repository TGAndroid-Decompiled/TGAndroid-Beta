package oh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class o9 extends ReplacementSpan {
    public View f17569a;
    public float d;
    public boolean f17572e;
    public long f17573f;
    public boolean f17574n;
    public boolean f17575r;
    public int f17570b = 1;
    public int f17571c = 2;
    public final pr h = new pr(0.0f, 0.5f, 0.5f, 1.0f);

    public final void a(org.telegram.ui.Cells.v0 v0Var) {
        this.f17569a = v0Var;
        this.f17574n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float f11;
        float f12;
        float f13;
        float a2;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        if (this.f17575r) {
            f11 = textPaint.getFontMetrics().ascent;
        } else {
            f11 = textPaint.getFontMetrics().top;
        }
        float f14 = -f11;
        float f15 = textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top;
        if (this.f17574n) {
            f12 = 0.05f;
        } else {
            f12 = 0.0365f;
        }
        float f16 = f15 * f12;
        float f17 = f14 - f16;
        if (this.f17572e) {
            if (System.currentTimeMillis() - this.f17573f > 1000) {
                this.f17572e = false;
            }
        } else {
            float f18 = this.d + 0.053333335f;
            this.d = f18;
            if (f18 > 1.0f) {
                this.d = 0.0f;
                int i15 = this.f17570b - 1;
                this.f17570b = i15;
                this.f17571c--;
                if (i15 < 0) {
                    this.f17570b = 1;
                    this.f17571c = 2;
                    this.f17572e = true;
                    this.f17573f = System.currentTimeMillis();
                }
            }
        }
        for (int i16 = 0; i16 < 3; i16++) {
            float f19 = measureText / 2.0f;
            float f20 = (i16 * measureText) + f10 + f19;
            if (i16 == this.f17570b) {
                f20 = AndroidUtilities.lerp(f20, e2.c.A(measureText, i16 + 1, f10, f19), this.d);
                float f21 = this.d;
                if (f21 < 0.5f) {
                    a2 = f21 / 0.5f;
                } else {
                    a2 = org.telegram.messenger.y3.a(f21, 0.5f, 0.5f, 1.0f);
                }
                f13 = AndroidUtilities.lerp(f17, f17 - f19, this.h.getInterpolation(a2));
            } else {
                if (i16 == this.f17571c) {
                    f20 = AndroidUtilities.lerp(f20, e2.c.A(measureText, i16 - 1, f10, f19), this.d);
                }
                f13 = f17;
            }
            canvas.drawCircle(f20, f13, f16, paint);
        }
        View view = this.f17569a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
