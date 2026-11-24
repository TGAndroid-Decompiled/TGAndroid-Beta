package defpackage;

import android.view.Surface;
public final class ep9 implements aq9 {
    public final pp9 a;

    public ep9(pp9 pp9Var) {
        this.a = pp9Var;
    }

    @Override
    public final void a(int i, int i2) {
        gm.c3(new ku(this, i / i2, (byte) 4));
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
