package defpackage;

import android.view.Surface;
public final class tq9 implements qr9 {
    public final er9 a;

    public tq9(er9 er9Var) {
        this.a = er9Var;
    }

    @Override
    public final void a(int i, int i2) {
        hl.c3(new jt(this, i / i2, (byte) 4));
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
