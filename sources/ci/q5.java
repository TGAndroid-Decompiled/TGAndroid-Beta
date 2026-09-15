package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends FrameLayout {
    public final qb f5340a;

    public q5(qb qbVar, Context context) {
        super(context);
        this.f5340a = qbVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qb qbVar = this.f5340a;
        Paint paint = qbVar.f5436r1;
        qg.r1 r1Var = qbVar.l1;
        paint.setAlpha((int) ((1.0f - qbVar.f5440t1) * r1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        r1Var.b(rectF);
        m6 m6Var = qbVar.T0;
        int top = m6Var.getTop();
        float translationY = r1Var.getTranslationY() + m6Var.getTranslationY() + r1Var.getTop() + top;
        float f7 = rectF.left;
        qg.w1 w1Var = qbVar.f5426m1;
        rectF.set(AndroidUtilities.lerp(f7, w1Var.getLeft(), qbVar.f5440t1), AndroidUtilities.lerp(rectF.top + translationY, w1Var.getTop() - w1Var.getTranslationY(), qbVar.f5440t1), AndroidUtilities.lerp(rectF.right, w1Var.getRight(), qbVar.f5440t1), AndroidUtilities.lerp(translationY + rectF.bottom, w1Var.getBottom() - w1Var.getTranslationY(), qbVar.f5440t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, qbVar.f5440t1));
        Paint paint2 = qbVar.f5438s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * qbVar.f5440t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            qb qbVar = this.f5340a;
            if (qbVar.f5442u1) {
                qbVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
