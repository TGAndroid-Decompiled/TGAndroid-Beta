package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public class b implements a {
    public final i6 f13612a;
    public final int f13613b;
    public final float f13614c;
    public int d;
    public int f13615e;
    public int f13616f;
    public int h;
    public int f13617n;
    public int f13618r;

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
            return n6.w0(n6.ya, this.f13612a);
        }
        return 0;
    }

    @Override
    public final int M0() {
        if (b()) {
            return n6.w0(this.f13617n, this.f13612a);
        }
        return 0;
    }

    @Override
    public int U0() {
        a();
        if (b() && Color.alpha(n6.w0(this.f13617n, this.f13612a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public int W1() {
        a();
        if (b()) {
            return n6.w0(n6.f29771xa, this.f13612a);
        }
        return this.f13615e;
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
        if (this.f13618r != u6.f30083b) {
            d();
        }
    }

    public final boolean b() {
        if (this.f13617n >= 0 && n6.i1(this.f13612a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (g0.B(n6.w0(this.f13613b, this.f13612a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f13618r = u6.f30083b;
        this.d = n6.r1(this.f13614c, n6.w0(this.f13613b, this.f13612a));
        if (c()) {
            this.f13616f = 687865855;
            this.h = 352321535;
            this.f13615e = 0;
            return;
        }
        this.f13616f = -1;
        this.h = -1;
        this.f13615e = 536870912;
    }

    @Override
    public int t0() {
        a();
        if (b() && Color.alpha(n6.w0(this.f13617n, this.f13612a)) != 0) {
            return 0;
        }
        return this.f13616f;
    }

    public b(i6 i6Var, int i7, float f10) {
        this.f13617n = -1;
        this.f13618r = u6.f30083b;
        this.f13612a = i6Var;
        this.f13613b = i7;
        this.f13614c = f10;
        d();
    }
}
