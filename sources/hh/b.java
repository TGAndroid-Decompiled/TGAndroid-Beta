package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public final class b extends e {
    public final g6 f14491s;

    public b(g6 g6Var, g6 g6Var2) {
        super(g6Var);
        this.f14491s = g6Var2;
    }

    @Override
    public final int A() {
        int a10 = a(this.f13970c);
        g6 g6Var = this.f14491s;
        if (l6.i1(g6Var) && Color.alpha(l6.w0(l6.f28223wa, g6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override
    public final int C0() {
        g6 g6Var = this.f14491s;
        if (l6.i1(g6Var)) {
            return l6.w0(l6.ya, g6Var);
        }
        return 0;
    }

    @Override
    public final int M() {
        g6 g6Var = this.f14491s;
        if (l6.i1(g6Var)) {
            return l6.w0(l6.f28223wa, g6Var);
        }
        return 0;
    }

    @Override
    public final int O() {
        int a10 = a(this.d);
        g6 g6Var = this.f14491s;
        if (l6.i1(g6Var) && Color.alpha(l6.w0(l6.f28223wa, g6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override
    public final int R0() {
        g6 g6Var = this.f14491s;
        if (l6.i1(g6Var)) {
            return l6.w0(l6.f28242xa, g6Var);
        }
        return a(this.f13969b);
    }

    @Override
    public final float b() {
        if (l6.i1(this.f14491s)) {
            return g0.N(1.0f);
        }
        return this.f13974r;
    }

    @Override
    public final float c() {
        if (l6.i1(this.f14491s)) {
            return g0.N(2.25f);
        }
        return this.f13973n;
    }

    @Override
    public final float v0() {
        return g0.N(0.6f);
    }
}
