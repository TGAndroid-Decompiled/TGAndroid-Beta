package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends FrameLayout {
    public final rb f7980a;

    public q5(rb rbVar, Context context) {
        super(context);
        this.f7980a = rbVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        rb rbVar = this.f7980a;
        Paint paint = rbVar.f8013r1;
        rg.q1 q1Var = rbVar.l1;
        paint.setAlpha((int) ((1.0f - rbVar.f8017t1) * q1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        q1Var.b(rectF);
        m6 m6Var = rbVar.T0;
        int top = m6Var.getTop();
        float translationY = q1Var.getTranslationY() + m6Var.getTranslationY() + q1Var.getTop() + top;
        float f7 = rectF.left;
        rg.v1 v1Var = rbVar.f8003m1;
        rectF.set(AndroidUtilities.lerp(f7, v1Var.getLeft(), rbVar.f8017t1), AndroidUtilities.lerp(rectF.top + translationY, v1Var.getTop() - v1Var.getTranslationY(), rbVar.f8017t1), AndroidUtilities.lerp(rectF.right, v1Var.getRight(), rbVar.f8017t1), AndroidUtilities.lerp(translationY + rectF.bottom, v1Var.getBottom() - v1Var.getTranslationY(), rbVar.f8017t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, rbVar.f8017t1));
        Paint paint2 = rbVar.f8015s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * rbVar.f8017t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            rb rbVar = this.f7980a;
            if (rbVar.f8019u1) {
                rbVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
