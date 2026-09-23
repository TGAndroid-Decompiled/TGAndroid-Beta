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
        qg.r1 r1Var = nbVar.l1;
        paint.setAlpha((int) ((1.0f - nbVar.f5367t1) * r1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        r1Var.b(rectF);
        l6 l6Var = nbVar.T0;
        int top = l6Var.getTop();
        float translationY = r1Var.getTranslationY() + l6Var.getTranslationY() + r1Var.getTop() + top;
        float f7 = rectF.left;
        qg.w1 w1Var = nbVar.f5353m1;
        rectF.set(AndroidUtilities.lerp(f7, w1Var.getLeft(), nbVar.f5367t1), AndroidUtilities.lerp(rectF.top + translationY, w1Var.getTop() - w1Var.getTranslationY(), nbVar.f5367t1), AndroidUtilities.lerp(rectF.right, w1Var.getRight(), nbVar.f5367t1), AndroidUtilities.lerp(translationY + rectF.bottom, w1Var.getBottom() - w1Var.getTranslationY(), nbVar.f5367t1));
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
