package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public class b implements a {
    public final i6 f13607a;
    public final int f13608b;
    public final float f13609c;
    public int d;
    public int f13610e;
    public int f13611f;
    public int h;
    public int f13612n;
    public int f13613r;

    public b(int i7, i6 i6Var) {
        this(i6Var, i7, pc.e(262144) ? 0.85f : 0.76f);
    }

    @Override
    public final float A1() {
        return g0.N(0.6f);
    }

    @Override
    public final int D0() {
        if (b()) {
            return n6.w0(this.f13612n, this.f13607a);
        }
        return 0;
    }

    @Override
    public final int D1() {
        if (b()) {
            return n6.w0(n6.ya, this.f13607a);
        }
        return 0;
    }

    @Override
    public int Q0() {
        a();
        if (b() && Color.alpha(n6.w0(this.f13612n, this.f13607a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public final float T0() {
        if (b()) {
            return g0.N(1.0f);
        }
        return -1.0f;
    }

    @Override
    public final float V0() {
        if (b()) {
            return g0.N(2.25f);
        }
        return -1.0f;
    }

    @Override
    public int X1() {
        a();
        if (b()) {
            return n6.w0(n6.f29828xa, this.f13607a);
        }
        return this.f13610e;
    }

    public final void a() {
        if (this.f13613r != u6.f30164b) {
            d();
        }
    }

    public final boolean b() {
        if (this.f13612n >= 0 && n6.i1(this.f13607a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (g0.B(n6.w0(this.f13608b, this.f13607a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f13613r = u6.f30164b;
        this.d = n6.r1(this.f13609c, n6.w0(this.f13608b, this.f13607a));
        if (c()) {
            this.f13611f = 687865855;
            this.h = 352321535;
            this.f13610e = 0;
            return;
        }
        this.f13611f = -1;
        this.h = -1;
        this.f13610e = 536870912;
    }

    @Override
    public int i0() {
        a();
        if (b() && Color.alpha(n6.w0(this.f13612n, this.f13607a)) != 0) {
            return 0;
        }
        return this.f13611f;
    }

    @Override
    public int x2() {
        a();
        return this.d;
    }

    public b(i6 i6Var, int i7, float f10) {
        this.f13612n = -1;
        this.f13613r = u6.f30164b;
        this.f13607a = i6Var;
        this.f13608b = i7;
        this.f13609c = f10;
        d();
    }
}
