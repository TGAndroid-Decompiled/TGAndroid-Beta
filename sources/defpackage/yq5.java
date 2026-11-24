package defpackage;

import android.content.Context;
public final class yq5 extends mhb {
    public final zq5 E;
    public final ez3 x;
    public boolean y;

    public yq5(zq5 zq5Var, Context context) {
        super(context);
        this.E = zq5Var;
        this.x = new ez3(this, (byte) 16);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ez3 ez3Var = this.x;
        gl.r(ez3Var);
        if (this.y) {
            gl.e3(ez3Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gl.r(this.x);
    }
}
