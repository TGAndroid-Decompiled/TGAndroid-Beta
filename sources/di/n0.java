package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q11;
public final class n0 extends ReplacementSpan {
    public final RectF f8808a = new RectF();
    public final Paint f8809b = new Paint(1);
    public final q11 f8810c = new q11(LocaleController.getString(R.string.LiveStoryBadge), 8.0f, AndroidUtilities.bold());

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(0.0f);
        RectF rectF = this.f8808a;
        rectF.set(f7, dp - AndroidUtilities.dp(6.0f), this.f8810c.l() + f7 + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(6.0f) + dp);
        Paint paint2 = this.f8809b;
        paint2.setColor(-572850);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        this.f8810c.c(AndroidUtilities.dp(4.0f) + f7, dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f8810c.l() + AndroidUtilities.dp(8.0f));
    }
}
