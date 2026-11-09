package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
public class b implements a {
    public final g6 f13958a;
    public final int f13959b;
    public final float f13960c;
    public int d;
    public int f13961e;
    public int f13962f;
    public int h;
    public int f13963n;
    public int f13964r;

    public b(int i7, g6 g6Var) {
        this(g6Var, i7, sc.e(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int A() {
        a();
        if (b() && Color.alpha(l6.w0(this.f13963n, this.f13958a)) != 0) {
            return 0;
        }
        return this.f13962f;
    }

    @Override
    public final int C0() {
        if (b()) {
            return l6.w0(l6.ya, this.f13958a);
        }
        return 0;
    }

    @Override
    public final int M() {
        if (b()) {
            return l6.w0(this.f13963n, this.f13958a);
        }
        return 0;
    }

    @Override
    public int O() {
        a();
        if (b() && Color.alpha(l6.w0(this.f13963n, this.f13958a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public int R0() {
        a();
        if (b()) {
            return l6.w0(l6.f28242xa, this.f13958a);
        }
        return this.f13961e;
    }

    public final void a() {
        if (this.f13964r != s6.f28501b) {
            d();
        }
    }

    public final boolean b() {
        if (this.f13963n >= 0 && l6.i1(this.f13958a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (g0.B(l6.w0(this.f13959b, this.f13958a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f13964r = s6.f28501b;
        this.d = l6.r1(this.f13960c, l6.w0(this.f13959b, this.f13958a));
        if (c()) {
            this.f13962f = 687865855;
            this.h = 352321535;
            this.f13961e = 0;
            return;
        }
        this.f13962f = -1;
        this.h = -1;
        this.f13961e = 536870912;
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

    public b(g6 g6Var, int i7, float f10) {
        this.f13963n = -1;
        this.f13964r = s6.f28501b;
        this.f13958a = g6Var;
        this.f13959b = i7;
        this.f13960c = f10;
        d();
    }
}
