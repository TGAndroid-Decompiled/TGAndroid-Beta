package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public class b implements a {
    public final h6 f13641a;
    public final int f13642b;
    public final float f13643c;
    public int d;
    public int f13644e;
    public int f13645f;
    public int h;
    public int f13646n;
    public int f13647r;

    public b(int i7, h6 h6Var) {
        this(h6Var, i7, pc.e(262144) ? 0.85f : 0.76f);
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
            return m6.w0(m6.ya, this.f13641a);
        }
        return 0;
    }

    @Override
    public final int M0() {
        if (b()) {
            return m6.w0(this.f13646n, this.f13641a);
        }
        return 0;
    }

    @Override
    public int U0() {
        a();
        if (b() && Color.alpha(m6.w0(this.f13646n, this.f13641a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public int W1() {
        a();
        if (b()) {
            return m6.w0(m6.f29755xa, this.f13641a);
        }
        return this.f13644e;
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
        if (this.f13647r != t6.f30066b) {
            d();
        }
    }

    public final boolean b() {
        if (this.f13646n >= 0 && m6.i1(this.f13641a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (g0.B(m6.w0(this.f13642b, this.f13641a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f13647r = t6.f30066b;
        this.d = m6.r1(this.f13643c, m6.w0(this.f13642b, this.f13641a));
        if (c()) {
            this.f13645f = 687865855;
            this.h = 352321535;
            this.f13644e = 0;
            return;
        }
        this.f13645f = -1;
        this.h = -1;
        this.f13644e = 536870912;
    }

    @Override
    public int t0() {
        a();
        if (b() && Color.alpha(m6.w0(this.f13646n, this.f13641a)) != 0) {
            return 0;
        }
        return this.f13645f;
    }

    public b(h6 h6Var, int i7, float f10) {
        this.f13646n = -1;
        this.f13647r = t6.f30066b;
        this.f13641a = h6Var;
        this.f13642b = i7;
        this.f13643c = f10;
        d();
    }
}
