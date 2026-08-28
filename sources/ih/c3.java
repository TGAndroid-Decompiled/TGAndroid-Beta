package ih;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nz0;
public final class c3 extends ReplacementSpan {
    public final RectF f11286a = new RectF();
    public final Paint f11287b = new Paint(1);
    public final nz0 f11288c = new nz0(LocaleController.getString(R.string.LiveStoryBadge), 9.0f, AndroidUtilities.bold());

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float dp = ((i11 + i13) / 2.0f) + AndroidUtilities.dp(1.33f);
        RectF rectF = this.f11286a;
        rectF.set(f10, dp - AndroidUtilities.dp(7.0f), this.f11288c.l() + f10 + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f) + dp);
        Paint paint2 = this.f11287b;
        paint2.setColor(-572850);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        this.f11288c.c(AndroidUtilities.dp(6.0f) + f10, dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f11288c.l() + AndroidUtilities.dp(12.0f));
    }
}
