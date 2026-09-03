package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mt0;
public final class y0 extends FrameLayout {
    public final mt0 f4863a;

    public y0(mt0 mt0Var, Context context) {
        super(context);
        this.f4863a = mt0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mt0 mt0Var = this.f4863a;
        Paint paint = mt0Var.f4499y1;
        k2 k2Var = mt0Var.f4490r1;
        paint.setAlpha((int) ((1.0f - mt0Var.A1) * k2Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        k2Var.b(rectF);
        a1 a1Var = mt0Var.Z0;
        int top = a1Var.getTop();
        float translationY = k2Var.getTranslationY() + a1Var.getTranslationY() + k2Var.getTop() + top;
        float f10 = rectF.left;
        q2 q2Var = mt0Var.f4491s1;
        rectF.set(AndroidUtilities.lerp(f10, q2Var.getLeft(), mt0Var.A1), AndroidUtilities.lerp(rectF.top + translationY, q2Var.getTop() - q2Var.getTranslationY(), mt0Var.A1), AndroidUtilities.lerp(rectF.right, q2Var.getRight(), mt0Var.A1), AndroidUtilities.lerp(translationY + rectF.bottom, q2Var.getBottom() - q2Var.getTranslationY(), mt0Var.A1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, mt0Var.A1));
        Paint paint2 = mt0Var.f4501z1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * mt0Var.A1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            mt0 mt0Var = this.f4863a;
            if (mt0Var.B1) {
                mt0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
