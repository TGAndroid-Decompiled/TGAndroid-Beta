package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
public final class m8 extends FrameLayout {
    public final Paint f11257a;
    public final org.telegram.ui.Components.h6 f11258b;
    public final org.telegram.ui.ActionBar.u6 f11259c;
    public final p8 d;

    public m8(p8 p8Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = p8Var;
        this.f11259c = u6Var;
        this.f11257a = new Paint(1);
        this.f11258b = new org.telegram.ui.Components.h6(this, 0L, 350L, ds.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23425h5, this.f11259c);
        Paint paint = this.f11257a;
        paint.setColor(w02);
        p8 p8Var = this.d;
        float max = Math.max(0.0f, p8Var.s());
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.h6 h6Var = this.f11258b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, h6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.k3) p8Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.k3) p8Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - h6Var.f28809c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        p8Var.f11447n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.k3) p8Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.k3) p8Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        p8 p8Var = this.d;
        if (y3 < p8Var.s()) {
            p8Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
