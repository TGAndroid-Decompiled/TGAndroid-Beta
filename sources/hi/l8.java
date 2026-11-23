package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.kr;
public final class l8 extends FrameLayout {
    public final Paint f14843a;
    public final org.telegram.ui.Components.c6 f14844b;
    public final org.telegram.ui.ActionBar.i6 f14845c;
    public final o8 d;

    public l8(o8 o8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = o8Var;
        this.f14845c = i6Var;
        this.f14843a = new Paint(1);
        this.f14844b = new org.telegram.ui.Components.c6(this, 0L, 350L, kr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.f14845c);
        Paint paint = this.f14843a;
        paint.setColor(w02);
        o8 o8Var = this.d;
        float max = Math.max(0.0f, o8Var.J0());
        if (max < org.telegram.messenger.g0.f24220m) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.c6 c6Var = this.f14844b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, c6Var.d(z10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(o8Var.f30261u0, T1, getWidth() - o8Var.f30261u0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - c6Var.f33931c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        o8Var.f15167r1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24220m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(o8Var.f30261u0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.f24220m, getWidth() - o8Var.f30261u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        o8 o8Var = this.d;
        if (y10 < o8Var.J0()) {
            o8Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
