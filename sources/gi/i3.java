package gi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.xq;
public final class i3 extends View implements m2 {
    public final org.telegram.ui.Components.g6 f12965a;

    public i3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, true, true);
        this.f12965a = g6Var;
        g6Var.n(0.35f, 300L, xq.h);
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.s(org.telegram.messenger.g0.L(1.4f), org.telegram.messenger.g0.L(0.4f), 1275068416);
        g6Var.f33983b = 1;
        g6Var.setCallback(this);
        g6Var.M = org.telegram.messenger.g0.f22608q.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.g6 g6Var = this.f12965a;
        g6Var.setBounds(0, 0, width, height);
        g6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f12965a.M = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f10) {
        this.f12965a.u(i0.a.f(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f12965a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
