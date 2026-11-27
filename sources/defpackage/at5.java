package defpackage;

import android.content.Context;
public final class at5 extends ilb {
    public final bt5 E;
    public final zz3 x;
    public boolean y;

    public at5(bt5 bt5Var, Context context) {
        super(context);
        this.E = bt5Var;
        this.x = new zz3(this, (byte) 16);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zz3 zz3Var = this.x;
        hl.r(zz3Var);
        if (this.y) {
            hl.d3(zz3Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hl.r(this.x);
    }
}
