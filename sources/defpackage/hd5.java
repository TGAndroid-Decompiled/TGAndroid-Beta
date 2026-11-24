package defpackage;

import android.content.Context;
public final class hd5 extends cra {
    public final kd5 r;

    public hd5(kd5 kd5Var, Context context) {
        super(context);
        this.r = kd5Var;
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
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(52.0f));
    }
}
