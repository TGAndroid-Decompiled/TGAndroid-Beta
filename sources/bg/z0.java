package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ws0;
public final class z0 extends FrameLayout {
    public final ws0 f2634a;

    public z0(ws0 ws0Var, Context context) {
        super(context);
        this.f2634a = ws0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ws0 ws0Var = this.f2634a;
        Paint paint = ws0Var.f2257x1;
        n2 n2Var = ws0Var.f2248q1;
        paint.setAlpha((int) ((1.0f - ws0Var.f2261z1) * n2Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        n2Var.b(rectF);
        b1 b1Var = ws0Var.Y0;
        int top = b1Var.getTop();
        float translationY = n2Var.getTranslationY() + b1Var.getTranslationY() + n2Var.getTop() + top;
        float f9 = rectF.left;
        t2 t2Var = ws0Var.f2249r1;
        rectF.set(AndroidUtilities.lerp(f9, t2Var.getLeft(), ws0Var.f2261z1), AndroidUtilities.lerp(rectF.top + translationY, t2Var.getTop() - t2Var.getTranslationY(), ws0Var.f2261z1), AndroidUtilities.lerp(rectF.right, t2Var.getRight(), ws0Var.f2261z1), AndroidUtilities.lerp(translationY + rectF.bottom, t2Var.getBottom() - t2Var.getTranslationY(), ws0Var.f2261z1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, ws0Var.f2261z1));
        Paint paint2 = ws0Var.f2259y1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * ws0Var.f2261z1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ws0 ws0Var = this.f2634a;
            if (ws0Var.A1) {
                ws0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
