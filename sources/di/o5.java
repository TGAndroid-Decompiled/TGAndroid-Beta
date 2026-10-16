package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o5 extends FrameLayout {
    public final mb f7514a;

    public o5(mb mbVar, Context context) {
        super(context);
        this.f7514a = mbVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mb mbVar = this.f7514a;
        Paint paint = mbVar.f7547r1;
        rg.q1 q1Var = mbVar.l1;
        paint.setAlpha((int) ((1.0f - mbVar.f7551t1) * q1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        q1Var.b(rectF);
        k6 k6Var = mbVar.T0;
        int top = k6Var.getTop();
        float translationY = q1Var.getTranslationY() + k6Var.getTranslationY() + q1Var.getTop() + top;
        float f7 = rectF.left;
        rg.v1 v1Var = mbVar.f7537m1;
        rectF.set(AndroidUtilities.lerp(f7, v1Var.getLeft(), mbVar.f7551t1), AndroidUtilities.lerp(rectF.top + translationY, v1Var.getTop() - v1Var.getTranslationY(), mbVar.f7551t1), AndroidUtilities.lerp(rectF.right, v1Var.getRight(), mbVar.f7551t1), AndroidUtilities.lerp(translationY + rectF.bottom, v1Var.getBottom() - v1Var.getTranslationY(), mbVar.f7551t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, mbVar.f7551t1));
        Paint paint2 = mbVar.f7549s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * mbVar.f7551t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            mb mbVar = this.f7514a;
            if (mbVar.f7553u1) {
                mbVar.O0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
