package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.ui.Components.my0;
public final class cc extends ReplacementSpan {
    public final Paint f3609a;
    public final my0 f3610b;
    public final int f3611c;

    public cc(int i7, String str) {
        this.f3611c = i7;
        Paint paint = new Paint(1);
        this.f3609a = paint;
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, i7));
        this.f3610b = new my0(str, 13.0f, org.telegram.messenger.g0.o());
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        RectF rectF = org.telegram.messenger.g0.P;
        int i14 = i11 + i13;
        rectF.set(f10, (i14 - org.telegram.messenger.g0.L(20.0f)) / 2.0f, org.telegram.messenger.g0.L(12.0f) + f10 + this.f3610b.f36133c, (org.telegram.messenger.g0.L(20.0f) + i14) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.f3609a);
        int i15 = this.f3611c;
        this.f3610b.c(f10 + org.telegram.messenger.g0.L(6.0f), i14 / 2.0f, 1.0f, i15, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (org.telegram.messenger.g0.L(12.0f) + this.f3610b.f36133c);
    }
}
