package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class e8 extends FrameLayout {
    public final Paint f17600a;
    public final org.telegram.ui.Components.d6 f17601b;
    public final org.telegram.ui.ActionBar.c6 f17602c;
    public final h8 d;

    public e8(h8 h8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = h8Var;
        this.f17602c = c6Var;
        this.f17600a = new Paint(1);
        this.f17601b = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, this.f17602c);
        Paint paint = this.f17600a;
        paint.setColor(v02);
        h8 h8Var = this.d;
        float max = Math.max(0.0f, h8Var.s());
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.d6 d6Var = this.f17601b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, d6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) h8Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) h8Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - d6Var.f27666c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        h8Var.f17855n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.f3) h8Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.f3) h8Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y8 = motionEvent.getY();
        h8 h8Var = this.d;
        if (y8 < h8Var.s()) {
            h8Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
