package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class vb extends ReplacementSpan {
    public View f3919a;
    public float d;
    public boolean f3922e;
    public long f3923f;
    public boolean f3924n;
    public boolean f3925r;
    public int f3920b = 1;
    public int f3921c = 2;
    public final pr h = new pr(0.0f, 0.5f, 0.5f, 1.0f);

    public final void a(org.telegram.ui.Cells.w0 w0Var) {
        this.f3919a = w0Var;
        this.f3924n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10;
        float f11;
        float f12;
        float y3;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        if (this.f3925r) {
            f10 = textPaint.getFontMetrics().ascent;
        } else {
            f10 = textPaint.getFontMetrics().top;
        }
        float f13 = -f10;
        float f14 = textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top;
        if (this.f3924n) {
            f11 = 0.05f;
        } else {
            f11 = 0.0365f;
        }
        float f15 = f14 * f11;
        float f16 = f13 - f15;
        if (this.f3922e) {
            if (System.currentTimeMillis() - this.f3923f > 1000) {
                this.f3922e = false;
            }
        } else {
            float f17 = this.d + 0.053333335f;
            this.d = f17;
            if (f17 > 1.0f) {
                this.d = 0.0f;
                int i15 = this.f3920b - 1;
                this.f3920b = i15;
                this.f3921c--;
                if (i15 < 0) {
                    this.f3920b = 1;
                    this.f3921c = 2;
                    this.f3922e = true;
                    this.f3923f = System.currentTimeMillis();
                }
            }
        }
        for (int i16 = 0; i16 < 3; i16++) {
            float f18 = measureText / 2.0f;
            float f19 = (i16 * measureText) + f7 + f18;
            if (i16 == this.f3920b) {
                f19 = AndroidUtilities.lerp(f19, org.telegram.ui.Cells.p6.a(measureText, i16 + 1, f7, f18), this.d);
                float f20 = this.d;
                if (f20 < 0.5f) {
                    y3 = f20 / 0.5f;
                } else {
                    y3 = org.telegram.messenger.w1.y(f20, 0.5f, 0.5f, 1.0f);
                }
                f12 = AndroidUtilities.lerp(f16, f16 - f18, this.h.getInterpolation(y3));
            } else {
                if (i16 == this.f3921c) {
                    f19 = AndroidUtilities.lerp(f19, org.telegram.ui.Cells.p6.a(measureText, i16 - 1, f7, f18), this.d);
                }
                f12 = f16;
            }
            canvas.drawCircle(f19, f12, f15, paint);
        }
        View view = this.f3919a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
