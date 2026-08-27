package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class f5 extends FrameLayout {

    public final va f15957a;

    public f5(va vaVar, Context context) {
        super(context);
        this.f15957a = vaVar;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        va vaVar = this.f15957a;
        Paint paint = vaVar.f15982n1;
        zf.o1 o1Var = vaVar.f15971h1;
        paint.setAlpha((int) ((1.0f - vaVar.f15986p1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        b6 b6Var = vaVar.P0;
        float translationY = o1Var.getTranslationY() + b6Var.getTranslationY() + o1Var.getTop() + b6Var.getTop();
        float f10 = rectF.left;
        zf.t1 t1Var = vaVar.f15973i1;
        rectF.set(AndroidUtilities.lerp(f10, t1Var.getLeft(), vaVar.f15986p1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), vaVar.f15986p1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), vaVar.f15986p1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), vaVar.f15986p1));
        float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, vaVar.f15986p1));
        Paint paint2 = vaVar.f15984o1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * vaVar.f15986p1));
        canvas.drawRoundRect(rectF, fDp, fDp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, fDp, fDp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            va vaVar = this.f15957a;
            if (vaVar.f15988q1) {
                vaVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
