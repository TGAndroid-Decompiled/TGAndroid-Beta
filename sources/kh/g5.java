package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g5 extends FrameLayout {
    public final ya f15267a;

    public g5(ya yaVar, Context context) {
        super(context);
        this.f15267a = yaVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ya yaVar = this.f15267a;
        Paint paint = yaVar.f15292n1;
        yf.o1 o1Var = yaVar.f15281h1;
        paint.setAlpha((int) ((1.0f - yaVar.f15296p1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        c6 c6Var = yaVar.P0;
        int top = c6Var.getTop();
        float translationY = o1Var.getTranslationY() + c6Var.getTranslationY() + o1Var.getTop() + top;
        float f10 = rectF.left;
        yf.t1 t1Var = yaVar.f15283i1;
        rectF.set(AndroidUtilities.lerp(f10, t1Var.getLeft(), yaVar.f15296p1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), yaVar.f15296p1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), yaVar.f15296p1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), yaVar.f15296p1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, yaVar.f15296p1));
        Paint paint2 = yaVar.f15294o1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * yaVar.f15296p1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ya yaVar = this.f15267a;
            if (yaVar.f15298q1) {
                yaVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
