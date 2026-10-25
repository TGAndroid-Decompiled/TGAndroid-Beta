package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q11;
public final class i3 extends ReplacementSpan {
    public final RectF f8668a = new RectF();
    public final Paint f8669b = new Paint(1);
    public final q11 f8670c = new q11(LocaleController.getString(R.string.LiveStoryBadge), 9.0f, AndroidUtilities.bold());

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
        RectF rectF = this.f8668a;
        rectF.set(f7, dp - AndroidUtilities.dp(7.0f), this.f8670c.l() + f7 + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f) + dp);
        Paint paint2 = this.f8669b;
        paint2.setColor(-572850);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        this.f8670c.c(AndroidUtilities.dp(6.0f) + f7, dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f8670c.l() + AndroidUtilities.dp(12.0f));
    }
}
