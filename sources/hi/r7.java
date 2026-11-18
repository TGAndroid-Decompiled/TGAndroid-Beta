package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.lr;
public final class r7 extends FrameLayout {
    public final Paint f15329a;
    public final org.telegram.ui.Components.c6 f15330b;
    public final org.telegram.ui.ActionBar.i6 f15331c;
    public final u7 d;

    public r7(u7 u7Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = u7Var;
        this.f15331c = i6Var;
        this.f15329a = new Paint(1);
        this.f15330b = new org.telegram.ui.Components.c6(this, 0L, 350L, lr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, this.f15331c);
        Paint paint = this.f15329a;
        paint.setColor(w02);
        u7 u7Var = this.d;
        float max = Math.max(0.0f, u7Var.J0());
        if (max < org.telegram.messenger.g0.f24112m) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.c6 c6Var = this.f15330b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, c6Var.d(z10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(u7Var.f30225u0, T1, getWidth() - u7Var.f30225u0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - c6Var.f33892c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        u7Var.f15543r1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24112m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(u7Var.f30225u0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.f24112m, getWidth() - u7Var.f30225u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        u7 u7Var = this.d;
        if (y10 < u7Var.J0()) {
            u7Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
