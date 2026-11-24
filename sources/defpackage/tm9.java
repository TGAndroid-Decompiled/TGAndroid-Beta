package defpackage;

import android.view.Surface;
public final class tm9 implements zn9 {
    public final um9 a;
    public final zn9 b;

    public tm9(um9 um9Var, zn9 zn9Var) {
        this.a = um9Var;
        this.b = zn9Var;
    }

    @Override
    public final void a(int i, int i2) {
        if (this.a.W != i || this.a.X != i2) {
            this.a.W = i;
            this.a.X = i2;
            gl.d3(new zk9(this, (byte) 5));
        }
        this.b.a(i, i2);
    }

    @Override
    public final boolean b() {
        return this.b.b();
    }

    @Override
    public final Surface getSurface() {
        return this.b.getSurface();
    }
}
