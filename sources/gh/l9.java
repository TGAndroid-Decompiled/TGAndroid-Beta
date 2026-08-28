package gh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nz0;
public final class l9 extends ReplacementSpan {
    public final Paint f8512a;
    public final nz0 f8513b;
    public final int f8514c;

    public l9(int i9, String str) {
        this.f8514c = i9;
        Paint paint = new Paint(1);
        this.f8512a = paint;
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i9));
        this.f8513b = new nz0(str, 13.0f, AndroidUtilities.bold());
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        RectF rectF = AndroidUtilities.rectTmp;
        int i14 = i11 + i13;
        rectF.set(f10, (i14 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f10 + this.f8513b.f31223c, (AndroidUtilities.dp(20.0f) + i14) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f8512a);
        int i15 = this.f8514c;
        this.f8513b.c(f10 + AndroidUtilities.dp(6.0f), i14 / 2.0f, 1.0f, i15, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(12.0f) + this.f8513b.f31223c);
    }
}
