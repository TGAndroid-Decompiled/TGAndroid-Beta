package defpackage;

import android.view.Surface;
public final class jq9 implements qr9 {
    public final kq9 a;
    public final qr9 b;

    public jq9(kq9 kq9Var, qr9 qr9Var) {
        this.a = kq9Var;
        this.b = qr9Var;
    }

    @Override
    public final void a(int i, int i2) {
        if (this.a.W != i || this.a.X != i2) {
            this.a.W = i;
            this.a.X = i2;
            hl.c3(new v59(this, (byte) 21));
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
