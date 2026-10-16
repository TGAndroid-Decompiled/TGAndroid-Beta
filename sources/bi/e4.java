package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i11;
public final class e4 extends ReplacementSpan {
    public final RectF f2984a = new RectF();
    public final Paint f2985b = new Paint(1);
    public final i11 f2986c = new i11(LocaleController.getString(R.string.LiveStoryBadge), 9.0f, AndroidUtilities.bold());

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
        RectF rectF = this.f2984a;
        rectF.set(f7, dp - AndroidUtilities.dp(7.0f), this.f2986c.l() + f7 + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f) + dp);
        Paint paint2 = this.f2985b;
        paint2.setColor(-572850);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        this.f2986c.c(AndroidUtilities.dp(6.0f) + f7, dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f2986c.l() + AndroidUtilities.dp(12.0f));
    }
}
