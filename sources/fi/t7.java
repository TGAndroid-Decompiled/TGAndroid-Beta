package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.wq;
public final class t7 extends FrameLayout {
    public final Paint f12860a;
    public final org.telegram.ui.Components.v5 f12861b;
    public final org.telegram.ui.ActionBar.h6 f12862c;
    public final w7 d;

    public t7(w7 w7Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = w7Var;
        this.f12862c = h6Var;
        this.f12860a = new Paint(1);
        this.f12861b = new org.telegram.ui.Components.v5(this, 0L, 350L, wq.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.f12862c);
        Paint paint = this.f12860a;
        paint.setColor(w02);
        w7 w7Var = this.d;
        float max = Math.max(0.0f, w7Var.I0());
        if (max < org.telegram.messenger.g0.f22561m) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.Components.v5 v5Var = this.f12861b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, v5Var.d(z9));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(w7Var.f28705t0, T1, getWidth() - w7Var.f28705t0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - v5Var.f38854c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        w7Var.f13063q1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22561m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(w7Var.f28705t0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.f22561m, getWidth() - w7Var.f28705t0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        w7 w7Var = this.d;
        if (y10 < w7Var.I0()) {
            w7Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
