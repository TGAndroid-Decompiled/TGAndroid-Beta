package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends FrameLayout {
    public final qb f5345a;

    public q5(qb qbVar, Context context) {
        super(context);
        this.f5345a = qbVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qb qbVar = this.f5345a;
        Paint paint = qbVar.f5441r1;
        qg.o1 o1Var = qbVar.l1;
        paint.setAlpha((int) ((1.0f - qbVar.f5445t1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        m6 m6Var = qbVar.T0;
        int top = m6Var.getTop();
        float translationY = o1Var.getTranslationY() + m6Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        qg.t1 t1Var = qbVar.f5431m1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), qbVar.f5445t1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), qbVar.f5445t1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), qbVar.f5445t1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), qbVar.f5445t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, qbVar.f5445t1));
        Paint paint2 = qbVar.f5443s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * qbVar.f5445t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            qb qbVar = this.f5345a;
            if (qbVar.f5447u1) {
                qbVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
