package jh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pz0;

public final class b3 extends ReplacementSpan {

    public final RectF f13079a = new RectF();

    public final Paint f13080b = new Paint(1);

    public final pz0 f13081c = new pz0(LocaleController.getString(R.string.LiveStoryBadge), 9.0f, AndroidUtilities.bold());

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float fDp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
        float fDp2 = fDp - AndroidUtilities.dp(7.0f);
        float fL = this.f13081c.l() + f10 + AndroidUtilities.dp(12.0f);
        float fDp3 = AndroidUtilities.dp(7.0f) + fDp;
        RectF rectF = this.f13079a;
        rectF.set(f10, fDp2, fL, fDp3);
        Paint paint2 = this.f13080b;
        paint2.setColor(-572850);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        this.f13081c.c(AndroidUtilities.dp(6.0f) + f10, fDp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f13081c.l() + AndroidUtilities.dp(12.0f));
    }
}
