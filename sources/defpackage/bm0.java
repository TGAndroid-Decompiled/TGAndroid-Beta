package defpackage;

import android.graphics.Color;
public class bm0 implements am0 {
    public final ylb a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public bm0(ylb ylbVar, int i, float f) {
        this.n = -1;
        this.r = anb.b;
        this.a = ylbVar;
        this.b = i;
        this.c = f;
        d();
    }

    @Override
    public int K1() {
        a();
        return this.d;
    }

    @Override
    public int V() {
        a();
        if (b() && Color.alpha(cmb.v0(this.n, this.a)) != 0) {
            return 0;
        }
        return this.f;
    }

    public final void a() {
        if (this.r != anb.b) {
            d();
        }
    }

    public final boolean b() {
        if (this.n >= 0 && cmb.g1(this.a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (gm.B(cmb.v0(this.b, this.a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.r = anb.b;
        this.d = cmb.p1(this.c, cmb.v0(this.b, this.a));
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
    public final int g0() {
        if (b()) {
            return cmb.v0(this.n, this.a);
        }
        return 0;
    }

    @Override
    public final float g1() {
        return gm.N(0.6f);
    }

    @Override
    public final int h1() {
        if (b()) {
            return cmb.v0(cmb.xa, this.a);
        }
        return 0;
    }

    @Override
    public int r1() {
        a();
        if (b()) {
            return cmb.v0(cmb.wa, this.a);
        }
        return this.e;
    }

    @Override
    public int u0() {
        a();
        if (b() && Color.alpha(cmb.v0(this.n, this.a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public final float w0() {
        if (b()) {
            return gm.N(1.0f);
        }
        return -1.0f;
    }

    @Override
    public final float y0() {
        if (b()) {
            return gm.N(2.25f);
        }
        return -1.0f;
    }

    public bm0(int i, ylb ylbVar) {
        this(ylbVar, i, e86.e(262144) ? 0.85f : 0.76f);
    }
}
