package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class f9 extends FrameLayout {
    public final Paint f4661a;
    public final org.telegram.ui.Components.c6 f4662b;
    public final org.telegram.ui.ActionBar.e6 f4663c;
    public final i9 d;

    public f9(i9 i9Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = i9Var;
        this.f4663c = e6Var;
        this.f4661a = new Paint(1);
        this.f4662b = new org.telegram.ui.Components.c6(this, 0L, 350L, qr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18907h5, this.f4663c);
        Paint paint = this.f4661a;
        paint.setColor(v02);
        i9 i9Var = this.d;
        float max = Math.max(0.0f, i9Var.s());
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.c6 c6Var = this.f4662b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, c6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) i9Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) i9Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - c6Var.f22953c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        i9Var.f4798n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.f3) i9Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.f3) i9Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        i9 i9Var = this.d;
        if (y3 < i9Var.s()) {
            i9Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
