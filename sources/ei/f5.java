package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f5 extends FrameLayout {
    public final xa f8999a;

    public f5(xa xaVar, Context context) {
        super(context);
        this.f8999a = xaVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        xa xaVar = this.f8999a;
        Paint paint = xaVar.f9032r1;
        rg.o1 o1Var = xaVar.l1;
        paint.setAlpha((int) ((1.0f - xaVar.f9036t1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        b6 b6Var = xaVar.T0;
        int top = b6Var.getTop();
        float translationY = o1Var.getTranslationY() + b6Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        rg.t1 t1Var = xaVar.f9022m1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), xaVar.f9036t1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), xaVar.f9036t1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), xaVar.f9036t1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), xaVar.f9036t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, xaVar.f9036t1));
        Paint paint2 = xaVar.f9034s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * xaVar.f9036t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            xa xaVar = this.f8999a;
            if (xaVar.f9038u1) {
                xaVar.O0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
