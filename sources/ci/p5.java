package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p5 extends FrameLayout {
    public final nb f5295a;

    public p5(nb nbVar, Context context) {
        super(context);
        this.f5295a = nbVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        nb nbVar = this.f5295a;
        Paint paint = nbVar.f5363r1;
        qg.p1 p1Var = nbVar.l1;
        paint.setAlpha((int) ((1.0f - nbVar.f5367t1) * p1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        l6 l6Var = nbVar.T0;
        int top = l6Var.getTop();
        float translationY = p1Var.getTranslationY() + l6Var.getTranslationY() + p1Var.getTop() + top;
        float f7 = rectF.left;
        qg.u1 u1Var = nbVar.f5353m1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), nbVar.f5367t1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), nbVar.f5367t1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), nbVar.f5367t1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), nbVar.f5367t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, nbVar.f5367t1));
        Paint paint2 = nbVar.f5365s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * nbVar.f5367t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            nb nbVar = this.f5295a;
            if (nbVar.f5369u1) {
                nbVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
