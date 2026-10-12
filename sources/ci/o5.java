package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o5 extends FrameLayout {
    public final nb f5677a;

    public o5(nb nbVar, Context context) {
        super(context);
        this.f5677a = nbVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        nb nbVar = this.f5677a;
        Paint paint = nbVar.f5820r1;
        qg.o1 o1Var = nbVar.l1;
        paint.setAlpha((int) ((1.0f - nbVar.f5824t1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        l6 l6Var = nbVar.T0;
        int top = l6Var.getTop();
        float translationY = o1Var.getTranslationY() + l6Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        qg.t1 t1Var = nbVar.f5810m1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), nbVar.f5824t1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), nbVar.f5824t1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), nbVar.f5824t1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), nbVar.f5824t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, nbVar.f5824t1));
        Paint paint2 = nbVar.f5822s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * nbVar.f5824t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            nb nbVar = this.f5677a;
            if (nbVar.f5826u1) {
                nbVar.O0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
