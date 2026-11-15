package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.er;
public final class r7 extends FrameLayout {
    public final Paint f14996a;
    public final org.telegram.ui.Components.u5 f14997b;
    public final org.telegram.ui.ActionBar.e6 f14998c;
    public final u7 d;

    public r7(u7 u7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = u7Var;
        this.f14998c = e6Var;
        this.f14996a = new Paint(1);
        this.f14997b = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.f14998c);
        Paint paint = this.f14996a;
        paint.setColor(w02);
        u7 u7Var = this.d;
        float max = Math.max(0.0f, u7Var.I0());
        if (max < org.telegram.messenger.g0.f23605m) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.u5 u5Var = this.f14997b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, u5Var.d(z10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(u7Var.f29717u0, T1, getWidth() - u7Var.f29717u0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - u5Var.f39900c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        u7Var.f15196r1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f23605m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(u7Var.f29717u0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.f23605m, getWidth() - u7Var.f29717u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        u7 u7Var = this.d;
        if (y10 < u7Var.I0()) {
            u7Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
