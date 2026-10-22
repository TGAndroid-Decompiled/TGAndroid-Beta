package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class q8 extends FrameLayout {
    public final Paint f9649a;
    public final org.telegram.ui.Components.f6 f9650b;
    public final org.telegram.ui.ActionBar.d6 f9651c;
    public final t8 d;

    public q8(t8 t8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = t8Var;
        this.f9651c = d6Var;
        this.f9649a = new Paint(1);
        this.f9650b = new org.telegram.ui.Components.f6(this, 0L, 350L, bs.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, this.f9651c);
        Paint paint = this.f9649a;
        paint.setColor(w02);
        t8 t8Var = this.d;
        float max = Math.max(0.0f, t8Var.u());
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.f6 f6Var = this.f9650b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, f6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) t8Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) t8Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - f6Var.f26089c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        t8Var.f9860n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.f3) t8Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.f3) t8Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        t8 t8Var = this.d;
        if (y3 < t8Var.u()) {
            t8Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
