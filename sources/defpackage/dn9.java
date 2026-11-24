package defpackage;

import android.view.Surface;
public final class dn9 implements zn9 {
    public final on9 a;

    public dn9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override
    public final void a(int i, int i2) {
        gl.d3(new kt(this, i / i2, (byte) 4));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final Surface getSurface() {
        return this.a.r0;
    }
}
