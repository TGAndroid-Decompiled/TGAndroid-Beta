package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class b extends e {
    public final f6 f14491s;

    public b(f6 f6Var, f6 f6Var2) {
        super(f6Var);
        this.f14491s = f6Var2;
    }

    @Override
    public final int A() {
        int a10 = a(this.f13970c);
        f6 f6Var = this.f14491s;
        if (k6.i1(f6Var) && Color.alpha(k6.w0(k6.f28207wa, f6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override
    public final int C0() {
        f6 f6Var = this.f14491s;
        if (k6.i1(f6Var)) {
            return k6.w0(k6.ya, f6Var);
        }
        return 0;
    }

    @Override
    public final int M() {
        f6 f6Var = this.f14491s;
        if (k6.i1(f6Var)) {
            return k6.w0(k6.f28207wa, f6Var);
        }
        return 0;
    }

    @Override
    public final int O() {
        int a10 = a(this.d);
        f6 f6Var = this.f14491s;
        if (k6.i1(f6Var) && Color.alpha(k6.w0(k6.f28207wa, f6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override
    public final int R0() {
        f6 f6Var = this.f14491s;
        if (k6.i1(f6Var)) {
            return k6.w0(k6.f28226xa, f6Var);
        }
        return a(this.f13969b);
    }

    @Override
    public final float b() {
        if (k6.i1(this.f14491s)) {
            return g0.N(1.0f);
        }
        return this.f13974r;
    }

    @Override
    public final float c() {
        if (k6.i1(this.f14491s)) {
            return g0.N(2.25f);
        }
        return this.f13973n;
    }

    @Override
    public final float v0() {
        return g0.N(0.6f);
    }
}
