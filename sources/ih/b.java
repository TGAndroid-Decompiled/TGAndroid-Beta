package ih;

import android.graphics.Color;
import hh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public final class b extends e {
    public final e6 f14767s;

    public b(e6 e6Var, e6 e6Var2) {
        super(e6Var);
        this.f14767s = e6Var2;
    }

    @Override
    public final int F() {
        e6 e6Var = this.f14767s;
        if (k6.i1(e6Var)) {
            return k6.w0(k6.f28238wa, e6Var);
        }
        return 0;
    }

    @Override
    public final int M() {
        int a10 = a(this.d);
        e6 e6Var = this.f14767s;
        if (k6.i1(e6Var) && Color.alpha(k6.w0(k6.f28238wa, e6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override
    public final float a0() {
        return g0.N(0.6f);
    }

    @Override
    public final float b() {
        if (k6.i1(this.f14767s)) {
            return g0.N(1.0f);
        }
        return this.f14420r;
    }

    @Override
    public final float c() {
        if (k6.i1(this.f14767s)) {
            return g0.N(2.25f);
        }
        return this.f14419n;
    }

    @Override
    public final int c0() {
        e6 e6Var = this.f14767s;
        if (k6.i1(e6Var)) {
            return k6.w0(k6.f28276ya, e6Var);
        }
        return 0;
    }

    @Override
    public final int u0() {
        e6 e6Var = this.f14767s;
        if (k6.i1(e6Var)) {
            return k6.w0(k6.xa, e6Var);
        }
        return a(this.f14415b);
    }

    @Override
    public final int x() {
        int a10 = a(this.f14416c);
        e6 e6Var = this.f14767s;
        if (k6.i1(e6Var) && Color.alpha(k6.w0(k6.f28238wa, e6Var)) != 0) {
            return 0;
        }
        return a10;
    }
}
