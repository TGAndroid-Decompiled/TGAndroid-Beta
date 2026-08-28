package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class r8 extends FrameLayout {
    public final Paint f15963a;
    public final org.telegram.ui.Components.y5 f15964b;
    public final org.telegram.ui.ActionBar.b6 f15965c;
    public final u8 d;

    public r8(u8 u8Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = u8Var;
        this.f15965c = b6Var;
        this.f15963a = new Paint(1);
        this.f15964b = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i9;
        int i10;
        int i11;
        int i12;
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, this.f15965c);
        Paint paint = this.f15963a;
        paint.setColor(v02);
        u8 u8Var = this.d;
        float max = Math.max(0.0f, u8Var.s());
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.y5 y5Var = this.f15964b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, y5Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i9 = ((org.telegram.ui.ActionBar.f3) u8Var).backgroundPaddingLeft;
        int width = getWidth();
        i10 = ((org.telegram.ui.ActionBar.f3) u8Var).backgroundPaddingLeft;
        rectF.set(i9, lerp, width - i10, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - y5Var.f34854c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        u8Var.f16169n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i11 = ((org.telegram.ui.ActionBar.f3) u8Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i12 = ((org.telegram.ui.ActionBar.f3) u8Var).backgroundPaddingLeft;
        canvas.clipRect(i11, dp2, width2 - i12, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        u8 u8Var = this.d;
        if (y10 < u8Var.s()) {
            u8Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
