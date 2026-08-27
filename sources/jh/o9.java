package jh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class o9 extends ReplacementSpan {

    public View f13764a;
    public float d;

    public boolean f13767e;

    public long f13768f;

    public boolean f13769n;

    public boolean f13770r;

    public int f13765b = 1;

    public int f13766c = 2;
    public final er h = new er(0.0f, 0.5f, 0.5f, 1.0f);

    public final void a(org.telegram.ui.Cells.v0 v0Var) {
        this.f13764a = v0Var;
        this.f13769n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float fLerp;
        TextPaint textPaint = (TextPaint) paint;
        float fMeasureText = paint.measureText("…") / 3.0f;
        float f11 = -(this.f13770r ? textPaint.getFontMetrics().ascent : textPaint.getFontMetrics().top);
        float f12 = (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top) * (this.f13769n ? 0.05f : 0.0365f);
        float f13 = f11 - f12;
        if (!this.f13767e) {
            float f14 = this.d + 0.053333335f;
            this.d = f14;
            if (f14 > 1.0f) {
                this.d = 0.0f;
                int i15 = this.f13765b - 1;
                this.f13765b = i15;
                this.f13766c--;
                if (i15 < 0) {
                    this.f13765b = 1;
                    this.f13766c = 2;
                    this.f13767e = true;
                    this.f13768f = System.currentTimeMillis();
                }
            }
        } else if (System.currentTimeMillis() - this.f13768f > 1000) {
            this.f13767e = false;
        }
        for (int i16 = 0; i16 < 3; i16++) {
            float f15 = fMeasureText / 2.0f;
            float fLerp2 = (i16 * fMeasureText) + f10 + f15;
            if (i16 == this.f13765b) {
                fLerp2 = AndroidUtilities.lerp(fLerp2, com.google.android.recaptcha.internal.a.d(fMeasureText, i16 + 1, f10, f15), this.d);
                float f16 = this.d;
                fLerp = AndroidUtilities.lerp(f13, f13 - f15, this.h.getInterpolation(f16 < 0.5f ? f16 / 0.5f : org.telegram.messenger.y1.a(f16, 0.5f, 0.5f, 1.0f)));
            } else {
                if (i16 == this.f13766c) {
                    fLerp2 = AndroidUtilities.lerp(fLerp2, com.google.android.recaptcha.internal.a.d(fMeasureText, i16 - 1, f10, f15), this.d);
                }
                fLerp = f13;
            }
            canvas.drawCircle(fLerp2, fLerp, f12, paint);
        }
        View view = this.f13764a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
