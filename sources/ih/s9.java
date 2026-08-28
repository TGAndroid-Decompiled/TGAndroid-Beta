package ih;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class s9 extends ReplacementSpan {
    public View f12134a;
    public float d;
    public boolean f12137e;
    public long f12138f;
    public boolean f12139n;
    public boolean f12140r;
    public int f12135b = 1;
    public int f12136c = 2;
    public final gr h = new gr(0.0f, 0.5f, 0.5f, 1.0f);

    public final void a(org.telegram.ui.Cells.w0 w0Var) {
        this.f12134a = w0Var;
        this.f12139n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11;
        float f12;
        float f13;
        float a2;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        if (this.f12140r) {
            f11 = textPaint.getFontMetrics().ascent;
        } else {
            f11 = textPaint.getFontMetrics().top;
        }
        float f14 = -f11;
        float f15 = textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top;
        if (this.f12139n) {
            f12 = 0.05f;
        } else {
            f12 = 0.0365f;
        }
        float f16 = f15 * f12;
        float f17 = f14 - f16;
        if (this.f12137e) {
            if (System.currentTimeMillis() - this.f12138f > 1000) {
                this.f12137e = false;
            }
        } else {
            float f18 = this.d + 0.053333335f;
            this.d = f18;
            if (f18 > 1.0f) {
                this.d = 0.0f;
                int i14 = this.f12135b - 1;
                this.f12135b = i14;
                this.f12136c--;
                if (i14 < 0) {
                    this.f12135b = 1;
                    this.f12136c = 2;
                    this.f12137e = true;
                    this.f12138f = System.currentTimeMillis();
                }
            }
        }
        for (int i15 = 0; i15 < 3; i15++) {
            float f19 = measureText / 2.0f;
            float f20 = (i15 * measureText) + f10 + f19;
            if (i15 == this.f12135b) {
                f20 = AndroidUtilities.lerp(f20, aa.d.w(measureText, i15 + 1, f10, f19), this.d);
                float f21 = this.d;
                if (f21 < 0.5f) {
                    a2 = f21 / 0.5f;
                } else {
                    a2 = org.telegram.messenger.l0.a(f21, 0.5f, 0.5f, 1.0f);
                }
                f13 = AndroidUtilities.lerp(f17, f17 - f19, this.h.getInterpolation(a2));
            } else {
                if (i15 == this.f12136c) {
                    f20 = AndroidUtilities.lerp(f20, aa.d.w(measureText, i15 - 1, f10, f19), this.d);
                }
                f13 = f17;
            }
            canvas.drawCircle(f20, f13, f16, paint);
        }
        View view = this.f12134a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
