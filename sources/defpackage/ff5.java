package defpackage;

import android.content.Context;
public final class ff5 extends dta {
    public final if5 r;

    public ff5(if5 if5Var, Context context) {
        super(context);
        this.r = if5Var;
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
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gm.L(52.0f));
    }
}
