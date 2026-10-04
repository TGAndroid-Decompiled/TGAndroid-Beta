package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p5 extends FrameLayout {
    public final mb f5702a;

    public p5(mb mbVar, Context context) {
        super(context);
        this.f5702a = mbVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mb mbVar = this.f5702a;
        Paint paint = mbVar.f5778r1;
        qg.o1 o1Var = mbVar.l1;
        paint.setAlpha((int) ((1.0f - mbVar.f5782t1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        l6 l6Var = mbVar.T0;
        int top = l6Var.getTop();
        float translationY = o1Var.getTranslationY() + l6Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        qg.t1 t1Var = mbVar.f5768m1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), mbVar.f5782t1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), mbVar.f5782t1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), mbVar.f5782t1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), mbVar.f5782t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, mbVar.f5782t1));
        Paint paint2 = mbVar.f5780s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * mbVar.f5782t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            mb mbVar = this.f5702a;
            if (mbVar.f5784u1) {
                mbVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
