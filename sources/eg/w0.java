package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mt0;
public final class w0 extends FrameLayout {
    public final mt0 f5524a;

    public w0(mt0 mt0Var, Context context) {
        super(context);
        this.f5524a = mt0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mt0 mt0Var = this.f5524a;
        Paint paint = mt0Var.f5136y1;
        i2 i2Var = mt0Var.f5127r1;
        paint.setAlpha((int) ((1.0f - mt0Var.A1) * i2Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        i2Var.b(rectF);
        y0 y0Var = mt0Var.Z0;
        int top = y0Var.getTop();
        float translationY = i2Var.getTranslationY() + y0Var.getTranslationY() + i2Var.getTop() + top;
        float f10 = rectF.left;
        o2 o2Var = mt0Var.f5128s1;
        rectF.set(AndroidUtilities.lerp(f10, o2Var.getLeft(), mt0Var.A1), AndroidUtilities.lerp(rectF.top + translationY, o2Var.getTop() - o2Var.getTranslationY(), mt0Var.A1), AndroidUtilities.lerp(rectF.right, o2Var.getRight(), mt0Var.A1), AndroidUtilities.lerp(translationY + rectF.bottom, o2Var.getBottom() - o2Var.getTranslationY(), mt0Var.A1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, mt0Var.A1));
        Paint paint2 = mt0Var.f5138z1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * mt0Var.A1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            mt0 mt0Var = this.f5524a;
            if (mt0Var.B1) {
                mt0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
