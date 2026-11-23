package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public class b implements a {
    public final h6 f13644a;
    public final int f13645b;
    public final float f13646c;
    public int d;
    public int f13647e;
    public int f13648f;
    public int h;
    public int f13649n;
    public int f13650r;

    public b(int i7, h6 h6Var) {
        this(h6Var, i7, qc.e(262144) ? 0.85f : 0.76f);
    }

    @Override
    public final float A1() {
        return g0.N(0.6f);
    }

    @Override
    public int A2() {
        a();
        return this.d;
    }

    @Override
    public final int D1() {
        if (b()) {
            return m6.w0(m6.ya, this.f13644a);
        }
        return 0;
    }

    @Override
    public final int M0() {
        if (b()) {
            return m6.w0(this.f13649n, this.f13644a);
        }
        return 0;
    }

    @Override
    public int U0() {
        a();
        if (b() && Color.alpha(m6.w0(this.f13649n, this.f13644a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public int W1() {
        a();
        if (b()) {
            return m6.w0(m6.f29758xa, this.f13644a);
        }
        return this.f13647e;
    }

    @Override
    public final float Y0() {
        if (b()) {
            return g0.N(1.0f);
        }
        return -1.0f;
    }

    @Override
    public final float Z0() {
        if (b()) {
            return g0.N(2.25f);
        }
        return -1.0f;
    }

    public final void a() {
        if (this.f13650r != t6.f30069b) {
            d();
        }
    }

    public final boolean b() {
        if (this.f13649n >= 0 && m6.i1(this.f13644a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (g0.B(m6.w0(this.f13645b, this.f13644a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f13650r = t6.f30069b;
        this.d = m6.r1(this.f13646c, m6.w0(this.f13645b, this.f13644a));
        if (c()) {
            this.f13648f = 687865855;
            this.h = 352321535;
            this.f13647e = 0;
            return;
        }
        this.f13648f = -1;
        this.h = -1;
        this.f13647e = 536870912;
    }

    @Override
    public int t0() {
        a();
        if (b() && Color.alpha(m6.w0(this.f13649n, this.f13644a)) != 0) {
            return 0;
        }
        return this.f13648f;
    }

    public b(h6 h6Var, int i7, float f10) {
        this.f13649n = -1;
        this.f13650r = t6.f30069b;
        this.f13644a = h6Var;
        this.f13645b = i7;
        this.f13646c = f10;
        d();
    }
}
