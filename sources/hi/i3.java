package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.nr;
public final class i3 extends View implements m2 {
    public final org.telegram.ui.Components.n6 f14787a;

    public i3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, true);
        this.f14787a = n6Var;
        n6Var.n(0.35f, 300L, nr.h);
        n6Var.u(-1);
        n6Var.w(org.telegram.messenger.g0.L(14.0f));
        n6Var.s(org.telegram.messenger.g0.L(1.4f), org.telegram.messenger.g0.L(0.4f), 1275068416);
        n6Var.f37796b = 1;
        n6Var.setCallback(this);
        n6Var.N = org.telegram.messenger.g0.f24046q.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.n6 n6Var = this.f14787a;
        n6Var.setBounds(0, 0, width, height);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f14787a.N = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f10) {
        this.f14787a.u(i0.a.f(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f14787a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
