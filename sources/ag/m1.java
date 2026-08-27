package ag;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public final class m1 extends org.telegram.ui.Cells.q {

    public j3 f560e;

    public Paint f561f;
    public float h;

    @Override
    public final void draw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(10.0f);
        j3 j3Var = this.f560e;
        j3Var.f501c.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), getMeasuredWidth() - AndroidUtilities.dp(5.0f), getMeasuredHeight() - AndroidUtilities.dp(5.0f));
        float f10 = -iDp;
        j3Var.f499a.set(f10, f10, getWidth() + iDp, getHeight() + iDp);
        canvas.save();
        float f11 = 1.0f - this.h;
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        j3Var.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f561f);
        super.draw(canvas);
    }
}
