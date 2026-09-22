package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends FrameLayout {
    public final qb f5344a;

    public q5(qb qbVar, Context context) {
        super(context);
        this.f5344a = qbVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qb qbVar = this.f5344a;
        Paint paint = qbVar.f5440r1;
        qg.p1 p1Var = qbVar.l1;
        paint.setAlpha((int) ((1.0f - qbVar.f5444t1) * p1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        m6 m6Var = qbVar.T0;
        int top = m6Var.getTop();
        float translationY = p1Var.getTranslationY() + m6Var.getTranslationY() + p1Var.getTop() + top;
        float f7 = rectF.left;
        qg.u1 u1Var = qbVar.f5430m1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), qbVar.f5444t1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), qbVar.f5444t1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), qbVar.f5444t1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), qbVar.f5444t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, qbVar.f5444t1));
        Paint paint2 = qbVar.f5442s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * qbVar.f5444t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            qb qbVar = this.f5344a;
            if (qbVar.f5446u1) {
                qbVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
