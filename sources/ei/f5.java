package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f5 extends FrameLayout {
    public final xa f9009a;

    public f5(xa xaVar, Context context) {
        super(context);
        this.f9009a = xaVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        xa xaVar = this.f9009a;
        Paint paint = xaVar.f9042r1;
        rg.p1 p1Var = xaVar.l1;
        paint.setAlpha((int) ((1.0f - xaVar.f9046t1) * p1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        b6 b6Var = xaVar.T0;
        int top = b6Var.getTop();
        float translationY = p1Var.getTranslationY() + b6Var.getTranslationY() + p1Var.getTop() + top;
        float f7 = rectF.left;
        rg.u1 u1Var = xaVar.f9032m1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), xaVar.f9046t1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), xaVar.f9046t1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), xaVar.f9046t1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), xaVar.f9046t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, xaVar.f9046t1));
        Paint paint2 = xaVar.f9044s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * xaVar.f9046t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            xa xaVar = this.f9009a;
            if (xaVar.f9048u1) {
                xaVar.N0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
