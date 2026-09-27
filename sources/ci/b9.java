package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
public final class b9 extends FrameLayout {
    public final Paint f4417a;
    public final org.telegram.ui.Components.e6 f4418b;
    public final org.telegram.ui.ActionBar.e6 f4419c;
    public final e9 d;

    public b9(e9 e9Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = e9Var;
        this.f4419c = e6Var;
        this.f4417a = new Paint(1);
        this.f4418b = new org.telegram.ui.Components.e6(this, 0L, 350L, sr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, this.f4419c);
        Paint paint = this.f4417a;
        paint.setColor(v02);
        e9 e9Var = this.d;
        float max = Math.max(0.0f, e9Var.s());
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.e6 e6Var = this.f4418b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, e6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.g3) e9Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) e9Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - e6Var.f23890c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        e9Var.f4669n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.g3) e9Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.g3) e9Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        e9 e9Var = this.d;
        if (y3 < e9Var.s()) {
            e9Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
