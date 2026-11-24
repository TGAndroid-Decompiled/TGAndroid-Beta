package defpackage;

import android.graphics.Color;
public class bl0 implements al0 {
    public final wjb a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public bl0(wjb wjbVar, int i, float f) {
        this.n = -1;
        this.r = zkb.b;
        this.a = wjbVar;
        this.b = i;
        this.c = f;
        d();
    }

    @Override
    public int L() {
        a();
        if (b() && Color.alpha(bkb.v0(this.n, this.a)) != 0) {
            return 0;
        }
        return this.f;
    }

    @Override
    public final float U0() {
        return gl.N(0.6f);
    }

    public final void a() {
        if (this.r != zkb.b) {
            d();
        }
    }

    @Override
    public final int a1() {
        if (b()) {
            return bkb.v0(bkb.xa, this.a);
        }
        return 0;
    }

    public final boolean b() {
        if (this.n >= 0 && bkb.g1(this.a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (gl.B(bkb.v0(this.b, this.a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.r = zkb.b;
        this.d = bkb.p1(this.c, bkb.v0(this.b, this.a));
        if (c()) {
            this.f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int d1() {
        a();
        if (b()) {
            return bkb.v0(bkb.wa, this.a);
        }
        return this.e;
    }

    @Override
    public final int j0() {
        if (b()) {
            return bkb.v0(this.n, this.a);
        }
        return 0;
    }

    @Override
    public int m0() {
        a();
        if (b() && Color.alpha(bkb.v0(this.n, this.a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public final float p0() {
        if (b()) {
            return gl.N(1.0f);
        }
        return -1.0f;
    }

    @Override
    public final float s0() {
        if (b()) {
            return gl.N(2.25f);
        }
        return -1.0f;
    }

    @Override
    public int t1() {
        a();
        return this.d;
    }

    public bl0(int i, wjb wjbVar) {
        this(wjbVar, i, e66.e(262144) ? 0.85f : 0.76f);
    }
}
