package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e5 extends FrameLayout {
    public final ta f10777a;

    public e5(ta taVar, Context context) {
        super(context);
        this.f10777a = taVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ta taVar = this.f10777a;
        Paint paint = taVar.f10789g1;
        sg.p1 p1Var = taVar.f10778a1;
        paint.setAlpha((int) ((1.0f - taVar.f10793i1) * p1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        a6 a6Var = taVar.I0;
        int top = a6Var.getTop();
        float translationY = p1Var.getTranslationY() + a6Var.getTranslationY() + p1Var.getTop() + top;
        float f7 = rectF.left;
        sg.u1 u1Var = taVar.f10779b1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), taVar.f10793i1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), taVar.f10793i1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), taVar.f10793i1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), taVar.f10793i1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, taVar.f10793i1));
        Paint paint2 = taVar.f10791h1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * taVar.f10793i1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ta taVar = this.f10777a;
            if (taVar.f10795j1) {
                taVar.M0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
