package fi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.wq;
public final class k3 extends View implements o2 {
    public final org.telegram.ui.Components.h6 f12267a;

    public k3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(true, true, true);
        this.f12267a = h6Var;
        h6Var.n(0.35f, 300L, wq.h);
        h6Var.u(-1);
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.s(org.telegram.messenger.g0.L(1.4f), org.telegram.messenger.g0.L(0.4f), 1275068416);
        h6Var.f34187b = 1;
        h6Var.setCallback(this);
        h6Var.M = org.telegram.messenger.g0.f22567q.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.h6 h6Var = this.f12267a;
        h6Var.setBounds(0, 0, width, height);
        h6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f12267a.M = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f10) {
        this.f12267a.u(i0.a.f(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f12267a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
