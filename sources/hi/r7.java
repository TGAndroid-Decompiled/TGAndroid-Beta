package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.nr;
public final class r7 extends FrameLayout {
    public final Paint f15308a;
    public final org.telegram.ui.Components.d6 f15309b;
    public final org.telegram.ui.ActionBar.h6 f15310c;
    public final u7 d;

    public r7(u7 u7Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = u7Var;
        this.f15310c = h6Var;
        this.f15308a = new Paint(1);
        this.f15309b = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, this.f15310c);
        Paint paint = this.f15308a;
        paint.setColor(w02);
        u7 u7Var = this.d;
        float max = Math.max(0.0f, u7Var.J0());
        if (max < org.telegram.messenger.g0.f24004m) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.d6 d6Var = this.f15309b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, d6Var.d(z10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(u7Var.f30177u0, T1, getWidth() - u7Var.f30177u0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - d6Var.f34349c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        u7Var.f15502r1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24004m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(u7Var.f30177u0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.f24004m, getWidth() - u7Var.f30177u0, getHeight());
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
