package defpackage;

import android.graphics.Color;
public class cl0 implements bl0 {
    public final vnb a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public cl0(vnb vnbVar, int i, float f) {
        this.n = -1;
        this.r = yob.b;
        this.a = vnbVar;
        this.b = i;
        this.c = f;
        d();
    }

    @Override
    public final float B0() {
        if (b()) {
            return hl.N(1.0f);
        }
        return -1.0f;
    }

    @Override
    public final float D0() {
        if (b()) {
            return hl.N(2.25f);
        }
        return -1.0f;
    }

    @Override
    public int Q1() {
        a();
        return this.d;
    }

    @Override
    public int X() {
        a();
        if (b() && Color.alpha(aob.v0(this.n, this.a)) != 0) {
            return 0;
        }
        return this.f;
    }

    public final void a() {
        if (this.r != yob.b) {
            d();
        }
    }

    public final boolean b() {
        if (this.n >= 0 && aob.g1(this.a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (hl.B(aob.v0(this.b, this.a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.r = yob.b;
        this.d = aob.p1(this.c, aob.v0(this.b, this.a));
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
    public final int m0() {
        if (b()) {
            return aob.v0(this.n, this.a);
        }
        return 0;
    }

    @Override
    public final float m1() {
        return hl.N(0.6f);
    }

    @Override
    public final int o1() {
        if (b()) {
            return aob.v0(aob.ya, this.a);
        }
        return 0;
    }

    @Override
    public int x0() {
        a();
        if (b() && Color.alpha(aob.v0(this.n, this.a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public int x1() {
        a();
        if (b()) {
            return aob.v0(aob.xa, this.a);
        }
        return this.e;
    }

    public cl0(int i, vnb vnbVar) {
        this(vnbVar, i, i86.e(262144) ? 0.85f : 0.76f);
    }
}
