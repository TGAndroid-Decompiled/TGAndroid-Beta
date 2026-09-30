package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class pc extends ReplacementSpan {
    public View f1406a;
    public float d;
    public boolean e;
    public long f1409f;
    public boolean f1410n;
    public boolean f1411r;
    public int f1407b = 1;
    public int f1408c = 2;
    public final tr h = new tr(0.0f, 0.5f, 0.5f, 1.0f);

    public final void a(org.telegram.ui.Cells.w0 w0Var) {
        this.f1406a = w0Var;
        this.f1410n = false;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10;
        float f11;
        float f12;
        float x10;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        if (this.f1411r) {
            f10 = textPaint.getFontMetrics().ascent;
        } else {
            f10 = textPaint.getFontMetrics().top;
        }
        float f13 = -f10;
        float f14 = textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top;
        if (this.f1410n) {
            f11 = 0.05f;
        } else {
            f11 = 0.0365f;
        }
        float f15 = f14 * f11;
        float f16 = f13 - f15;
        if (this.e) {
            if (System.currentTimeMillis() - this.f1409f > 1000) {
                this.e = false;
            }
        } else {
            float f17 = this.d + 0.053333335f;
            this.d = f17;
            if (f17 > 1.0f) {
                this.d = 0.0f;
                int i15 = this.f1407b - 1;
                this.f1407b = i15;
                this.f1408c--;
                if (i15 < 0) {
                    this.f1407b = 1;
                    this.f1408c = 2;
                    this.e = true;
                    this.f1409f = System.currentTimeMillis();
                }
            }
        }
        for (int i16 = 0; i16 < 3; i16++) {
            float f18 = measureText / 2.0f;
            float f19 = (i16 * measureText) + f7 + f18;
            if (i16 == this.f1407b) {
                f19 = AndroidUtilities.lerp(f19, org.telegram.ui.Cells.c1.b(measureText, i16 + 1, f7, f18), this.d);
                float f20 = this.d;
                if (f20 < 0.5f) {
                    x10 = f20 / 0.5f;
                } else {
                    x10 = org.telegram.messenger.f0.x(f20, 0.5f, 0.5f, 1.0f);
                }
                f12 = AndroidUtilities.lerp(f16, f16 - f18, this.h.getInterpolation(x10));
            } else {
                if (i16 == this.f1408c) {
                    f19 = AndroidUtilities.lerp(f19, org.telegram.ui.Cells.c1.b(measureText, i16 - 1, f7, f18), this.d);
                }
                f12 = f16;
            }
            canvas.drawCircle(f19, f12, f15, paint);
        }
        View view = this.f1406a;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }
}
