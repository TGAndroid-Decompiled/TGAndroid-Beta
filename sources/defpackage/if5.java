package defpackage;

import android.content.Context;
public final class if5 extends eva {
    public final lf5 r;

    public if5(lf5 lf5Var, Context context) {
        super(context);
        this.r = lf5Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hl.L(52.0f));
    }
}
