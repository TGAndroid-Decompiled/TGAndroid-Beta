package defpackage;

import android.view.Surface;
public final class uo9 implements aq9 {
    public final vo9 a;
    public final aq9 b;

    public uo9(vo9 vo9Var, aq9 aq9Var) {
        this.a = vo9Var;
        this.b = aq9Var;
    }

    @Override
    public final void a(int i, int i2) {
        if (this.a.W != i || this.a.X != i2) {
            this.a.W = i;
            this.a.X = i2;
            gm.c3(new kf9(this, (byte) 13));
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
