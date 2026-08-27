package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class p8 extends FrameLayout {

    public final Paint f16533a;

    public final org.telegram.ui.Components.y5 f16534b;

    public final org.telegram.ui.ActionBar.c6 f16535c;
    public final s8 d;

    public p8(s8 s8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = s8Var;
        this.f16535c = c6Var;
        this.f16533a = new Paint(1);
        this.f16534b = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, this.f16535c);
        Paint paint = this.f16533a;
        paint.setColor(iV0);
        s8 s8Var = this.d;
        float fMax = Math.max(0.0f, s8Var.t());
        boolean z10 = fMax < ((float) AndroidUtilities.statusBarHeight);
        org.telegram.ui.Components.y5 y5Var = this.f16534b;
        float fLerp = AndroidUtilities.lerp(fMax, 0.0f, y5Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((org.telegram.ui.ActionBar.e3) s8Var).backgroundPaddingLeft, fLerp, getWidth() - ((org.telegram.ui.ActionBar.e3) s8Var).backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + getHeight());
        float fDp = (1.0f - y5Var.f34812c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, fDp, fDp, paint);
        s8Var.f16738n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + fLerp));
        canvas.save();
        canvas.clipRect(((org.telegram.ui.ActionBar.e3) s8Var).backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight, getWidth() - ((org.telegram.ui.ActionBar.e3) s8Var).backgroundPaddingLeft, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        s8 s8Var = this.d;
        if (y10 >= s8Var.t()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        s8Var.dismiss();
        return true;
    }
}
