package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.er;
public final class i3 extends View implements m2 {
    public final org.telegram.ui.Components.g6 f14416a;

    public i3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, true, true);
        this.f14416a = g6Var;
        g6Var.n(0.35f, 300L, er.h);
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.s(org.telegram.messenger.g0.L(1.4f), org.telegram.messenger.g0.L(0.4f), 1275068416);
        g6Var.f34833b = 1;
        g6Var.setCallback(this);
        g6Var.N = org.telegram.messenger.g0.f23611q.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.g6 g6Var = this.f14416a;
        g6Var.setBounds(0, 0, width, height);
        g6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f14416a.N = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f10) {
        this.f14416a.u(i0.a.f(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f14416a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
