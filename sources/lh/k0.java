package lh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zz0;
public final class k0 extends ReplacementSpan {
    public final RectF f15816a = new RectF();
    public final Paint f15817b = new Paint(1);
    public final zz0 f15818c = new zz0(LocaleController.getString(R.string.LiveStoryBadge), 8.0f, AndroidUtilities.bold());

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(0.0f);
        RectF rectF = this.f15816a;
        rectF.set(f9, dp - AndroidUtilities.dp(6.0f), this.f15818c.l() + f9 + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(6.0f) + dp);
        Paint paint2 = this.f15817b;
        paint2.setColor(-572850);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        this.f15818c.c(AndroidUtilities.dp(4.0f) + f9, dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f15818c.l() + AndroidUtilities.dp(8.0f));
    }
}
