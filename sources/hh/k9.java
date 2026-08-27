package hh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pz0;

public final class k9 extends ReplacementSpan {

    public final Paint f9622a;

    public final pz0 f9623b;

    public final int f9624c;

    public k9(int i10, String str) {
        this.f9624c = i10;
        Paint paint = new Paint(1);
        this.f9622a = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i10));
        this.f9623b = new pz0(str, 13.0f, AndroidUtilities.bold());
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        RectF rectF = AndroidUtilities.rectTmp;
        int i15 = i12 + i14;
        rectF.set(f10, (i15 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f10 + this.f9623b.f31697c, (AndroidUtilities.dp(20.0f) + i15) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f9622a);
        this.f9623b.c(f10 + AndroidUtilities.dp(6.0f), i15 / 2.0f, 1.0f, this.f9624c, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(12.0f) + this.f9623b.f31697c);
    }
}
