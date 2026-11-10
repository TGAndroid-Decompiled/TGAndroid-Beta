package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class b extends e {
    public final h6 f14493s;

    public b(h6 h6Var, h6 h6Var2) {
        super(h6Var);
        this.f14493s = h6Var2;
    }

    @Override
    public final int A() {
        int a10 = a(this.f13972c);
        h6 h6Var = this.f14493s;
        if (m6.i1(h6Var) && Color.alpha(m6.w0(m6.f28248wa, h6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override
    public final int C0() {
        h6 h6Var = this.f14493s;
        if (m6.i1(h6Var)) {
            return m6.w0(m6.ya, h6Var);
        }
        return 0;
    }

    @Override
    public final int M() {
        h6 h6Var = this.f14493s;
        if (m6.i1(h6Var)) {
            return m6.w0(m6.f28248wa, h6Var);
        }
        return 0;
    }

    @Override
    public final int O() {
        int a10 = a(this.d);
        h6 h6Var = this.f14493s;
        if (m6.i1(h6Var) && Color.alpha(m6.w0(m6.f28248wa, h6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override
    public final int R0() {
        h6 h6Var = this.f14493s;
        if (m6.i1(h6Var)) {
            return m6.w0(m6.f28267xa, h6Var);
        }
        return a(this.f13971b);
    }

    @Override
    public final float b() {
        if (m6.i1(this.f14493s)) {
            return g0.N(1.0f);
        }
        return this.f13976r;
    }

    @Override
    public final float c() {
        if (m6.i1(this.f14493s)) {
            return g0.N(2.25f);
        }
        return this.f13975n;
    }

    @Override
    public final float v0() {
        return g0.N(0.6f);
    }
}
