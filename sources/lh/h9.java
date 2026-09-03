package lh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;
public final class h9 extends ReplacementSpan {
    public final Paint f12545a;
    public final k01 f12546b;
    public final int f12547c;

    public h9(int i10, String str) {
        this.f12547c = i10;
        Paint paint = new Paint(1);
        this.f12545a = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
        this.f12546b = new k01(str, 13.0f, AndroidUtilities.bold());
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        RectF rectF = AndroidUtilities.rectTmp;
        int i15 = i12 + i14;
        rectF.set(f10, (i15 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f10 + this.f12546b.f26124c, (AndroidUtilities.dp(20.0f) + i15) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f12545a);
        int i16 = this.f12547c;
        this.f12546b.c(f10 + AndroidUtilities.dp(6.0f), i15 / 2.0f, 1.0f, i16, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(12.0f) + this.f12546b.f26124c);
    }
}
