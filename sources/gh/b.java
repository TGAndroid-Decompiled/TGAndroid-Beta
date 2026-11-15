package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
public class b implements a {
    public final e6 f13300a;
    public final int f13301b;
    public final float f13302c;
    public int d;
    public int f13303e;
    public int f13304f;
    public int h;
    public int f13305n;
    public int f13306r;

    public b(int i7, e6 e6Var) {
        this(e6Var, i7, qc.e(262144) ? 0.85f : 0.76f);
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
            return j6.w0(j6.ya, this.f13300a);
        }
        return 0;
    }

    @Override
    public final int M0() {
        if (b()) {
            return j6.w0(this.f13305n, this.f13300a);
        }
        return 0;
    }

    @Override
    public int U0() {
        a();
        if (b() && Color.alpha(j6.w0(this.f13305n, this.f13300a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public int W1() {
        a();
        if (b()) {
            return j6.w0(j6.f29226xa, this.f13300a);
        }
        return this.f13303e;
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
        if (this.f13306r != q6.f29535b) {
            d();
        }
    }

    public final boolean b() {
        if (this.f13305n >= 0 && j6.i1(this.f13300a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (g0.B(j6.w0(this.f13301b, this.f13300a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f13306r = q6.f29535b;
        this.d = j6.r1(this.f13302c, j6.w0(this.f13301b, this.f13300a));
        if (c()) {
            this.f13304f = 687865855;
            this.h = 352321535;
            this.f13303e = 0;
            return;
        }
        this.f13304f = -1;
        this.h = -1;
        this.f13303e = 536870912;
    }

    @Override
    public int t0() {
        a();
        if (b() && Color.alpha(j6.w0(this.f13305n, this.f13300a)) != 0) {
            return 0;
        }
        return this.f13304f;
    }

    public b(e6 e6Var, int i7, float f10) {
        this.f13305n = -1;
        this.f13306r = q6.f29535b;
        this.f13300a = e6Var;
        this.f13301b = i7;
        this.f13302c = f10;
        d();
    }
}
