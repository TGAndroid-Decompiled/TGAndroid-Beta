package nh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k01;
public final class l0 extends ReplacementSpan {
    public final RectF f15561a = new RectF();
    public final Paint f15562b = new Paint(1);
    public final k01 f15563c = new k01(LocaleController.getString(R.string.LiveStoryBadge), 8.0f, AndroidUtilities.bold());

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(0.0f);
        RectF rectF = this.f15561a;
        rectF.set(f10, dp - AndroidUtilities.dp(6.0f), this.f15563c.l() + f10 + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(6.0f) + dp);
        Paint paint2 = this.f15562b;
        paint2.setColor(-572850);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        this.f15563c.c(AndroidUtilities.dp(4.0f) + f10, dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f15563c.l() + AndroidUtilities.dp(8.0f));
    }
}
