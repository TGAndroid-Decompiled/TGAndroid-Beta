package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.nr;
public final class q7 extends FrameLayout {
    public final Paint f15311a;
    public final org.telegram.ui.Components.d6 f15312b;
    public final org.telegram.ui.ActionBar.h6 f15313c;
    public final t7 d;

    public q7(t7 t7Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = t7Var;
        this.f15313c = h6Var;
        this.f15311a = new Paint(1);
        this.f15312b = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.f15313c);
        Paint paint = this.f15311a;
        paint.setColor(w02);
        t7 t7Var = this.d;
        float max = Math.max(0.0f, t7Var.J0());
        if (max < org.telegram.messenger.g0.f24040m) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.d6 d6Var = this.f15312b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, d6Var.d(z10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(t7Var.f30211u0, T1, getWidth() - t7Var.f30211u0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - d6Var.f34386c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        t7Var.f15515r1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24040m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(t7Var.f30211u0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.f24040m, getWidth() - t7Var.f30211u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        t7 t7Var = this.d;
        if (y10 < t7Var.J0()) {
            t7Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
