package fi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.xq;
public final class k3 extends View implements o2 {
    public final org.telegram.ui.Components.i6 f12266a;

    public k3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, true);
        this.f12266a = i6Var;
        i6Var.n(0.35f, 300L, xq.h);
        i6Var.u(-1);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.s(org.telegram.messenger.g0.L(1.4f), org.telegram.messenger.g0.L(0.4f), 1275068416);
        i6Var.f34508b = 1;
        i6Var.setCallback(this);
        i6Var.M = org.telegram.messenger.g0.f22544q.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.i6 i6Var = this.f12266a;
        i6Var.setBounds(0, 0, width, height);
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f12266a.M = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f10) {
        this.f12266a.u(i0.a.f(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f12266a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
