package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class b extends e {
    public final i6 f14157s;

    public b(i6 i6Var, i6 i6Var2) {
        super(i6Var);
        this.f14157s = i6Var2;
    }

    @Override
    public final float A1() {
        return g0.N(0.6f);
    }

    @Override
    public final int D0() {
        i6 i6Var = this.f14157s;
        if (n6.i1(i6Var)) {
            return n6.w0(n6.f29809wa, i6Var);
        }
        return 0;
    }

    @Override
    public final int D1() {
        i6 i6Var = this.f14157s;
        if (n6.i1(i6Var)) {
            return n6.w0(n6.ya, i6Var);
        }
        return 0;
    }

    @Override
    public final int Q0() {
        int a10 = a(this.d);
        i6 i6Var = this.f14157s;
        if (n6.i1(i6Var) && Color.alpha(n6.w0(n6.f29809wa, i6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override
    public final int X1() {
        i6 i6Var = this.f14157s;
        if (n6.i1(i6Var)) {
            return n6.w0(n6.f29828xa, i6Var);
        }
        return a(this.f13618b);
    }

    @Override
    public final float b() {
        if (n6.i1(this.f14157s)) {
            return g0.N(1.0f);
        }
        return this.f13623r;
    }

    @Override
    public final float c() {
        if (n6.i1(this.f14157s)) {
            return g0.N(2.25f);
        }
        return this.f13622n;
    }

    @Override
    public final int i0() {
        int a10 = a(this.f13619c);
        i6 i6Var = this.f14157s;
        if (n6.i1(i6Var) && Color.alpha(n6.w0(n6.f29809wa, i6Var)) != 0) {
            return 0;
        }
        return a10;
    }
}
