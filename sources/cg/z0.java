package cg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class z0 extends org.telegram.ui.Cells.q {
    public r2 f3469e;
    public Paint f3470f;
    public float h;

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        r2 r2Var = this.f3469e;
        r2Var.f3332c.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), getMeasuredWidth() - AndroidUtilities.dp(5.0f), getMeasuredHeight() - AndroidUtilities.dp(5.0f));
        float f9 = -dp;
        r2Var.f3330a.set(f9, f9, getWidth() + dp, getHeight() + dp);
        canvas.save();
        float f10 = 1.0f - this.h;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        r2Var.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f3470f);
        super.draw(canvas);
    }
}
