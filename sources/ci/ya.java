package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.ui.Components.ly0;
public final class ya extends ReplacementSpan {
    public final Paint f6416a;
    public final ly0 f6417b;
    public final int f6418c;

    public ya(int i3, String str) {
        this.f6418c = i3;
        Paint paint = new Paint(1);
        this.f6416a = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i3));
        this.f6417b = new ly0(str, 13.0f, org.telegram.messenger.g0.o());
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        RectF rectF = org.telegram.messenger.g0.P;
        int i14 = i11 + i13;
        rectF.set(f10, (i14 - org.telegram.messenger.g0.L(20.0f)) / 2.0f, org.telegram.messenger.g0.L(12.0f) + f10 + this.f6417b.f35918c, (org.telegram.messenger.g0.L(20.0f) + i14) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.f6416a);
        int i15 = this.f6418c;
        this.f6417b.c(f10 + org.telegram.messenger.g0.L(6.0f), i14 / 2.0f, 1.0f, i15, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (org.telegram.messenger.g0.L(12.0f) + this.f6417b.f35918c);
    }
}
