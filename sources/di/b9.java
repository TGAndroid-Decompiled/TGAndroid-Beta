package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class b9 extends FrameLayout {
    public final Paint f6662a;
    public final org.telegram.ui.Components.g6 f6663b;
    public final org.telegram.ui.ActionBar.c6 f6664c;
    public final e9 d;

    public b9(e9 e9Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = e9Var;
        this.f6664c = c6Var;
        this.f6662a = new Paint(1);
        this.f6663b = new org.telegram.ui.Components.g6(this, 0L, 350L, es.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, this.f6664c);
        Paint paint = this.f6662a;
        paint.setColor(w02);
        e9 e9Var = this.d;
        float max = Math.max(0.0f, e9Var.u());
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.g6 g6Var = this.f6663b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, g6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.e3) e9Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.e3) e9Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - g6Var.f25190c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        e9Var.f6911n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.e3) e9Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.e3) e9Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        e9 e9Var = this.d;
        if (y3 < e9Var.u()) {
            e9Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
