package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.kr;
public final class r3 extends View implements v2 {
    public final org.telegram.ui.Components.m6 f15289a;

    public r3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, true);
        this.f15289a = m6Var;
        m6Var.n(0.35f, 300L, kr.h);
        m6Var.u(-1);
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.s(org.telegram.messenger.g0.L(1.4f), org.telegram.messenger.g0.L(0.4f), 1275068416);
        m6Var.f37394b = 1;
        m6Var.setCallback(this);
        m6Var.N = org.telegram.messenger.g0.f24226q.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.m6 m6Var = this.f15289a;
        m6Var.setBounds(0, 0, width, height);
        m6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f15289a.N = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f10) {
        this.f15289a.u(i0.a.f(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f15289a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
