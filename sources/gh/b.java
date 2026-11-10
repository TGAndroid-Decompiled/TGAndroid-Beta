package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public class b implements a {
    public final h6 f13960a;
    public final int f13961b;
    public final float f13962c;
    public int d;
    public int f13963e;
    public int f13964f;
    public int h;
    public int f13965n;
    public int f13966r;

    public b(int i7, h6 h6Var) {
        this(h6Var, i7, sc.e(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int A() {
        a();
        if (b() && Color.alpha(m6.w0(this.f13965n, this.f13960a)) != 0) {
            return 0;
        }
        return this.f13964f;
    }

    @Override
    public final int C0() {
        if (b()) {
            return m6.w0(m6.ya, this.f13960a);
        }
        return 0;
    }

    @Override
    public final int M() {
        if (b()) {
            return m6.w0(this.f13965n, this.f13960a);
        }
        return 0;
    }

    @Override
    public int O() {
        a();
        if (b() && Color.alpha(m6.w0(this.f13965n, this.f13960a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public int R0() {
        a();
        if (b()) {
            return m6.w0(m6.f28267xa, this.f13960a);
        }
        return this.f13963e;
    }

    public final void a() {
        if (this.f13966r != t6.f28531b) {
            d();
        }
    }

    public final boolean b() {
        if (this.f13965n >= 0 && m6.i1(this.f13960a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (g0.B(m6.w0(this.f13961b, this.f13960a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f13966r = t6.f28531b;
        this.d = m6.r1(this.f13962c, m6.w0(this.f13961b, this.f13960a));
        if (c()) {
            this.f13964f = 687865855;
            this.h = 352321535;
            this.f13963e = 0;
            return;
        }
        this.f13964f = -1;
        this.h = -1;
        this.f13963e = 536870912;
    }

    @Override
    public int e1() {
        a();
        return this.d;
    }

    @Override
    public final float j0() {
        if (b()) {
            return g0.N(1.0f);
        }
        return -1.0f;
    }

    @Override
    public final float o0() {
        if (b()) {
            return g0.N(2.25f);
        }
        return -1.0f;
    }

    @Override
    public final float v0() {
        return g0.N(0.6f);
    }

    public b(h6 h6Var, int i7, float f10) {
        this.f13965n = -1;
        this.f13966r = t6.f28531b;
        this.f13960a = h6Var;
        this.f13961b = i7;
        this.f13962c = f10;
        d();
    }
}
