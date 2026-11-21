package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class b extends e {
    public final h6 f14191s;

    public b(h6 h6Var, h6 h6Var2) {
        super(h6Var);
        this.f14191s = h6Var2;
    }

    @Override
    public final float A1() {
        return g0.N(0.6f);
    }

    @Override
    public final int D1() {
        h6 h6Var = this.f14191s;
        if (m6.i1(h6Var)) {
            return m6.w0(m6.ya, h6Var);
        }
        return 0;
    }

    @Override
    public final int M0() {
        h6 h6Var = this.f14191s;
        if (m6.i1(h6Var)) {
            return m6.w0(m6.f29736wa, h6Var);
        }
        return 0;
    }

    @Override
    public final int U0() {
        int a10 = a(this.d);
        h6 h6Var = this.f14191s;
        if (m6.i1(h6Var) && Color.alpha(m6.w0(m6.f29736wa, h6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override
    public final int W1() {
        h6 h6Var = this.f14191s;
        if (m6.i1(h6Var)) {
            return m6.w0(m6.f29755xa, h6Var);
        }
        return a(this.f13652b);
    }

    @Override
    public final float b() {
        if (m6.i1(this.f14191s)) {
            return g0.N(1.0f);
        }
        return this.f13657r;
    }

    @Override
    public final float c() {
        if (m6.i1(this.f14191s)) {
            return g0.N(2.25f);
        }
        return this.f13656n;
    }

    @Override
    public final int t0() {
        int a10 = a(this.f13653c);
        h6 h6Var = this.f14191s;
        if (m6.i1(h6Var) && Color.alpha(m6.w0(m6.f29736wa, h6Var)) != 0) {
            return 0;
        }
        return a10;
    }
}
