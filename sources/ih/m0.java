package ih;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nz0;
public final class m0 extends ReplacementSpan {
    public final RectF f11748a = new RectF();
    public final Paint f11749b = new Paint(1);
    public final nz0 f11750c = new nz0(LocaleController.getString(R.string.LiveStoryBadge), 8.0f, AndroidUtilities.bold());

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float dp = ((i11 + i13) / 2.0f) + AndroidUtilities.dp(0.0f);
        RectF rectF = this.f11748a;
        rectF.set(f10, dp - AndroidUtilities.dp(6.0f), this.f11750c.l() + f10 + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(6.0f) + dp);
        Paint paint2 = this.f11749b;
        paint2.setColor(-572850);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        this.f11750c.c(AndroidUtilities.dp(4.0f) + f10, dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f11750c.l() + AndroidUtilities.dp(8.0f));
    }
}
