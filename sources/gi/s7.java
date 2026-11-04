package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.xq;
public final class s7 extends FrameLayout {
    public final Paint f13566a;
    public final org.telegram.ui.Components.u5 f13567b;
    public final org.telegram.ui.ActionBar.e6 f13568c;
    public final v7 d;

    public s7(v7 v7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = v7Var;
        this.f13568c = e6Var;
        this.f13566a = new Paint(1);
        this.f13567b = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.f13568c);
        Paint paint = this.f13566a;
        paint.setColor(w02);
        v7 v7Var = this.d;
        float max = Math.max(0.0f, v7Var.I0());
        if (max < org.telegram.messenger.g0.f22602m) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.u5 u5Var = this.f13567b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, u5Var.d(z10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(v7Var.f28618u0, T1, getWidth() - v7Var.f28618u0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - u5Var.f38645c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        v7Var.f13693o1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22602m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(v7Var.f28618u0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.f22602m, getWidth() - v7Var.f28618u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y9 = motionEvent.getY();
        v7 v7Var = this.d;
        if (y9 < v7Var.I0()) {
            v7Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
