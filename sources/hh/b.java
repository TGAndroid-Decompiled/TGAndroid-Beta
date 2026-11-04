package hh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.lc;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public class b implements a {
    public final e6 f14404a;
    public final int f14405b;
    public final float f14406c;
    public int d;
    public int f14407e;
    public int f14408f;
    public int h;
    public int f14409n;
    public int f14410r;

    public b(int i3, e6 e6Var) {
        this(e6Var, i3, lc.e(262144) ? 0.85f : 0.76f);
    }

    @Override
    public final int F() {
        if (b()) {
            return k6.w0(this.f14409n, this.f14404a);
        }
        return 0;
    }

    @Override
    public int M() {
        a();
        if (b() && Color.alpha(k6.w0(this.f14409n, this.f14404a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public final float O() {
        if (b()) {
            return g0.N(1.0f);
        }
        return -1.0f;
    }

    @Override
    public final float W() {
        if (b()) {
            return g0.N(2.25f);
        }
        return -1.0f;
    }

    public final void a() {
        if (this.f14410r != r6.f28515b) {
            d();
        }
    }

    @Override
    public final float a0() {
        return g0.N(0.6f);
    }

    public final boolean b() {
        if (this.f14409n >= 0 && k6.i1(this.f14404a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (g0.B(k6.w0(this.f14405b, this.f14404a)) < 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public final int c0() {
        if (b()) {
            return k6.w0(k6.f28276ya, this.f14404a);
        }
        return 0;
    }

    public final void d() {
        this.f14410r = r6.f28515b;
        this.d = k6.r1(this.f14406c, k6.w0(this.f14405b, this.f14404a));
        if (c()) {
            this.f14408f = 687865855;
            this.h = 352321535;
            this.f14407e = 0;
            return;
        }
        this.f14408f = -1;
        this.h = -1;
        this.f14407e = 536870912;
    }

    @Override
    public int u0() {
        a();
        if (b()) {
            return k6.w0(k6.xa, this.f14404a);
        }
        return this.f14407e;
    }

    @Override
    public int w0() {
        a();
        return this.d;
    }

    @Override
    public int x() {
        a();
        if (b() && Color.alpha(k6.w0(this.f14409n, this.f14404a)) != 0) {
            return 0;
        }
        return this.f14408f;
    }

    public b(e6 e6Var, int i3, float f10) {
        this.f14409n = -1;
        this.f14410r = r6.f28515b;
        this.f14404a = e6Var;
        this.f14405b = i3;
        this.f14406c = f10;
        d();
    }
}
