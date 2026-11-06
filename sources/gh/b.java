package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.rc;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public class b implements a {
    public final f6 f13958a;
    public final int f13959b;
    public final float f13960c;
    public int d;
    public int f13961e;
    public int f13962f;
    public int h;
    public int f13963n;
    public int f13964r;

    public b(int i7, f6 f6Var) {
        this(f6Var, i7, rc.e(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int A() {
        a();
        if (b() && Color.alpha(k6.w0(this.f13963n, this.f13958a)) != 0) {
            return 0;
        }
        return this.f13962f;
    }

    @Override
    public final int C0() {
        if (b()) {
            return k6.w0(k6.ya, this.f13958a);
        }
        return 0;
    }

    @Override
    public final int M() {
        if (b()) {
            return k6.w0(this.f13963n, this.f13958a);
        }
        return 0;
    }

    @Override
    public int O() {
        a();
        if (b() && Color.alpha(k6.w0(this.f13963n, this.f13958a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public int R0() {
        a();
        if (b()) {
            return k6.w0(k6.f28226xa, this.f13958a);
        }
        return this.f13961e;
    }

    public final void a() {
        if (this.f13964r != r6.f28476b) {
            d();
        }
    }

    public final boolean b() {
        if (this.f13963n >= 0 && k6.i1(this.f13958a)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (g0.B(k6.w0(this.f13959b, this.f13958a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f13964r = r6.f28476b;
        this.d = k6.r1(this.f13960c, k6.w0(this.f13959b, this.f13958a));
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

    public b(f6 f6Var, int i7, float f10) {
        this.f13963n = -1;
        this.f13964r = r6.f28476b;
        this.f13958a = f6Var;
        this.f13959b = i7;
        this.f13960c = f10;
        d();
    }
}
