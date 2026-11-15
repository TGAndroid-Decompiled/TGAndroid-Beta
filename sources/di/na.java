package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.ui.Components.oy0;
public final class na extends ReplacementSpan {
    public final Paint f9118a;
    public final oy0 f9119b;
    public final int f9120c;

    public na(int i7, String str) {
        this.f9120c = i7;
        Paint paint = new Paint(1);
        this.f9118a = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, i7));
        this.f9119b = new oy0(str, 13.0f, org.telegram.messenger.g0.o());
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        RectF rectF = org.telegram.messenger.g0.P;
        int i14 = i11 + i13;
        rectF.set(f10, (i14 - org.telegram.messenger.g0.L(20.0f)) / 2.0f, org.telegram.messenger.g0.L(12.0f) + f10 + this.f9119b.f38103c, (org.telegram.messenger.g0.L(20.0f) + i14) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.f9118a);
        int i15 = this.f9120c;
        this.f9119b.c(f10 + org.telegram.messenger.g0.L(6.0f), i14 / 2.0f, 1.0f, i15, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (org.telegram.messenger.g0.L(12.0f) + this.f9119b.f38103c);
    }
}
