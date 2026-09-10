package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o6 extends FrameLayout {
    public final ad f3320a;

    public o6(ad adVar, Context context) {
        super(context);
        this.f3320a = adVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ad adVar = this.f3320a;
        Paint paint = adVar.f3532r1;
        pg.o1 o1Var = adVar.l1;
        paint.setAlpha((int) ((1.0f - adVar.f3536t1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        l7 l7Var = adVar.T0;
        int top = l7Var.getTop();
        float translationY = o1Var.getTranslationY() + l7Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        pg.t1 t1Var = adVar.f3522m1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), adVar.f3536t1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), adVar.f3536t1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), adVar.f3536t1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), adVar.f3536t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, adVar.f3536t1));
        Paint paint2 = adVar.f3534s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * adVar.f3536t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ad adVar = this.f3320a;
            if (adVar.f3538u1) {
                adVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
