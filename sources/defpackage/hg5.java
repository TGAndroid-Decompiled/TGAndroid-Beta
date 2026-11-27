package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class hg5 extends View implements qk4 {
    public final hn a;

    public hg5(Activity activity) {
        super(activity);
        hn hnVar = new hn(true, true, true);
        this.a = hnVar;
        hnVar.n(0.35f, 300L, k43.h);
        hnVar.u(-1);
        hnVar.w(hl.L(14.0f));
        hnVar.s(hl.L(1.4f), hl.L(0.4f), 1275068416);
        hnVar.b = 1;
        hnVar.setCallback(this);
        hnVar.N = hl.q.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        hn hnVar = this.a;
        hnVar.setBounds(0, 0, width, height);
        hnVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.N = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f) {
        this.a.u(vm2.f(f, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
