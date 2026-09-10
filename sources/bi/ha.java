package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
public final class ha extends FrameLayout {
    public final Paint f2801a;
    public final org.telegram.ui.Components.d6 f2802b;
    public final org.telegram.ui.ActionBar.f6 f2803c;
    public final ka d;

    public ha(ka kaVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = kaVar;
        this.f2803c = f6Var;
        this.f2801a = new Paint(1);
        this.f2802b = new org.telegram.ui.Components.d6(this, 0L, 350L, wr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, this.f2803c);
        Paint paint = this.f2801a;
        paint.setColor(v02);
        ka kaVar = this.d;
        float max = Math.max(0.0f, kaVar.s());
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.d6 d6Var = this.f2802b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, d6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) kaVar).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) kaVar).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - d6Var.f22295c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        kaVar.f3005n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.h3) kaVar).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.h3) kaVar).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        ka kaVar = this.d;
        if (y3 < kaVar.s()) {
            kaVar.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
