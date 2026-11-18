package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public class b implements a {
    public final i6 f13615a;
    public final int f13616b;
    public final float f13617c;
    public int d;
    public int f13618e;
    public int f13619f;
    public int h;
    public int f13620n;
    public int f13621r;

    public b(int i7, i6 i6Var) {
        this(i6Var, i7, pc.e(262144) ? 0.85f : 0.76f);
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
            return n6.w0(n6.ya, this.f13615a);
        }
        return 0;
    }

    @Override
    public final int M0() {
        if (b()) {
            return n6.w0(this.f13620n, this.f13615a);
        }
        return 0;
    }

    @Override
    public int U0() {
        a();
        if (b() && Color.alpha(n6.w0(this.f13620n, this.f13615a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public int W1() {
        a();
        if (b()) {
            return n6.w0(n6.f29773xa, this.f13615a);
        }
        return this.f13618e;
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
        if (this.f13621r != u6.f30085b) {
            d();
        }
    }

    public final boolean b() {
        if (this.f13620n >= 0 && n6.i1(this.f13615a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (g0.B(n6.w0(this.f13616b, this.f13615a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f13621r = u6.f30085b;
        this.d = n6.r1(this.f13617c, n6.w0(this.f13616b, this.f13615a));
        if (c()) {
            this.f13619f = 687865855;
            this.h = 352321535;
            this.f13618e = 0;
            return;
        }
        this.f13619f = -1;
        this.h = -1;
        this.f13618e = 536870912;
    }

    @Override
    public int t0() {
        a();
        if (b() && Color.alpha(n6.w0(this.f13620n, this.f13615a)) != 0) {
            return 0;
        }
        return this.f13619f;
    }

    public b(i6 i6Var, int i7, float f10) {
        this.f13620n = -1;
        this.f13621r = u6.f30085b;
        this.f13615a = i6Var;
        this.f13616b = i7;
        this.f13617c = f10;
        d();
    }
}
