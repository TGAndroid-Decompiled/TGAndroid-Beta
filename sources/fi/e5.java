package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e5 extends FrameLayout {
    public final ta f10778a;

    public e5(ta taVar, Context context) {
        super(context);
        this.f10778a = taVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ta taVar = this.f10778a;
        Paint paint = taVar.f10790g1;
        sg.q1 q1Var = taVar.f10779a1;
        paint.setAlpha((int) ((1.0f - taVar.f10794i1) * q1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        q1Var.b(rectF);
        a6 a6Var = taVar.I0;
        int top = a6Var.getTop();
        float translationY = q1Var.getTranslationY() + a6Var.getTranslationY() + q1Var.getTop() + top;
        float f7 = rectF.left;
        sg.v1 v1Var = taVar.f10780b1;
        rectF.set(AndroidUtilities.lerp(f7, v1Var.getLeft(), taVar.f10794i1), AndroidUtilities.lerp(rectF.top + translationY, v1Var.getTop() - v1Var.getTranslationY(), taVar.f10794i1), AndroidUtilities.lerp(rectF.right, v1Var.getRight(), taVar.f10794i1), AndroidUtilities.lerp(translationY + rectF.bottom, v1Var.getBottom() - v1Var.getTranslationY(), taVar.f10794i1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, taVar.f10794i1));
        Paint paint2 = taVar.f10792h1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * taVar.f10794i1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ta taVar = this.f10778a;
            if (taVar.f10796j1) {
                taVar.M0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
