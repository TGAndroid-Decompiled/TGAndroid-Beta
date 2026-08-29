package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends FrameLayout {
    public final ja f18787a;

    public w4(ja jaVar, Context context) {
        super(context);
        this.f18787a = jaVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ja jaVar = this.f18787a;
        Paint paint = jaVar.f18647n1;
        bg.n2 n2Var = jaVar.f18636h1;
        paint.setAlpha((int) ((1.0f - jaVar.f18651p1) * n2Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        n2Var.b(rectF);
        p5 p5Var = jaVar.P0;
        int top = p5Var.getTop();
        float translationY = n2Var.getTranslationY() + p5Var.getTranslationY() + n2Var.getTop() + top;
        float f9 = rectF.left;
        bg.t2 t2Var = jaVar.f18638i1;
        rectF.set(AndroidUtilities.lerp(f9, t2Var.getLeft(), jaVar.f18651p1), AndroidUtilities.lerp(rectF.top + translationY, t2Var.getTop() - t2Var.getTranslationY(), jaVar.f18651p1), AndroidUtilities.lerp(rectF.right, t2Var.getRight(), jaVar.f18651p1), AndroidUtilities.lerp(translationY + rectF.bottom, t2Var.getBottom() - t2Var.getTranslationY(), jaVar.f18651p1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, jaVar.f18651p1));
        Paint paint2 = jaVar.f18649o1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * jaVar.f18651p1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ja jaVar = this.f18787a;
            if (jaVar.f18653q1) {
                jaVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
