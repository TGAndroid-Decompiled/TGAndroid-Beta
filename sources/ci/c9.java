package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
public final class c9 extends FrameLayout {
    public final Paint f4841a;
    public final org.telegram.ui.Components.g6 f4842b;
    public final org.telegram.ui.ActionBar.d6 f4843c;
    public final f9 d;

    public c9(f9 f9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = f9Var;
        this.f4843c = d6Var;
        this.f4841a = new Paint(1);
        this.f4842b = new org.telegram.ui.Components.g6(this, 0L, 350L, is.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, this.f4843c);
        Paint paint = this.f4841a;
        paint.setColor(w02);
        f9 f9Var = this.d;
        float max = Math.max(0.0f, f9Var.u());
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.g6 g6Var = this.f4842b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, g6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.e3) f9Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.e3) f9Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - g6Var.f26613c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        f9Var.f5090n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.e3) f9Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.e3) f9Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        f9 f9Var = this.d;
        if (y3 < f9Var.u()) {
            f9Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
