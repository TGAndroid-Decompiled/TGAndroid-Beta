package defpackage;

import android.content.Context;
public final class ws5 extends njb {
    public final xs5 E;
    public final o04 x;
    public boolean y;

    public ws5(xs5 xs5Var, Context context) {
        super(context);
        this.E = xs5Var;
        this.x = new o04(this, (byte) 16);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o04 o04Var = this.x;
        gm.r(o04Var);
        if (this.y) {
            gm.d3(o04Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.r(this.x);
    }
}
