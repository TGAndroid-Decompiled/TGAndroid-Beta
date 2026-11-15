package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class b extends e {
    public final e6 f13848s;

    public b(e6 e6Var, e6 e6Var2) {
        super(e6Var);
        this.f13848s = e6Var2;
    }

    @Override
    public final float A1() {
        return g0.N(0.6f);
    }

    @Override
    public final int D1() {
        e6 e6Var = this.f13848s;
        if (j6.i1(e6Var)) {
            return j6.w0(j6.ya, e6Var);
        }
        return 0;
    }

    @Override
    public final int M0() {
        e6 e6Var = this.f13848s;
        if (j6.i1(e6Var)) {
            return j6.w0(j6.f29207wa, e6Var);
        }
        return 0;
    }

    @Override
    public final int U0() {
        int a10 = a(this.d);
        e6 e6Var = this.f13848s;
        if (j6.i1(e6Var) && Color.alpha(j6.w0(j6.f29207wa, e6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override
    public final int W1() {
        e6 e6Var = this.f13848s;
        if (j6.i1(e6Var)) {
            return j6.w0(j6.f29226xa, e6Var);
        }
        return a(this.f13311b);
    }

    @Override
    public final float b() {
        if (j6.i1(this.f13848s)) {
            return g0.N(1.0f);
        }
        return this.f13316r;
    }

    @Override
    public final float c() {
        if (j6.i1(this.f13848s)) {
            return g0.N(2.25f);
        }
        return this.f13315n;
    }

    @Override
    public final int t0() {
        int a10 = a(this.f13312c);
        e6 e6Var = this.f13848s;
        if (j6.i1(e6Var) && Color.alpha(j6.w0(j6.f29207wa, e6Var)) != 0) {
            return 0;
        }
        return a10;
    }
}
