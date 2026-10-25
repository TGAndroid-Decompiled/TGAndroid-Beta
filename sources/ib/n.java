package ib;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
public final class n extends nb.b {
    public static final m H = new m();
    public static final fb.m I = new fb.m("closed");
    public final ArrayList E;
    public String F;
    public fb.i G;

    public n() {
        super(H);
        this.E = new ArrayList();
        this.G = fb.k.f10396a;
    }

    @Override
    public final void b() {
        fb.h hVar = new fb.h();
        w(hVar);
        this.E.add(hVar);
    }

    @Override
    public final void c() {
        fb.l lVar = new fb.l();
        w(lVar);
        this.E.add(lVar);
    }

    @Override
    public final void close() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            arrayList.add(I);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty() && this.F == null) {
            if (v() instanceof fb.h) {
                a1.g.A(1, arrayList);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty() && this.F == null) {
            if (v() instanceof fb.l) {
                a1.g.A(1, arrayList);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.E.isEmpty() && this.F == null) {
            if (v() instanceof fb.l) {
                this.F = str;
                return;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    @Override
    public final nb.b i() {
        w(fb.k.f10396a);
        return this;
    }

    @Override
    public final void n(double d) {
        if (this.f18769n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new fb.m(Double.valueOf(d)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override
    public final void o(long j10) {
        w(new fb.m(Long.valueOf(j10)));
    }

    @Override
    public final void p(Boolean bool) {
        if (bool == null) {
            w(fb.k.f10396a);
        } else {
            w(new fb.m(bool));
        }
    }

    @Override
    public final void q(Number number) {
        if (number == null) {
            w(fb.k.f10396a);
            return;
        }
        if (this.f18769n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new fb.m(number));
    }

    @Override
    public final void r(String str) {
        if (str == null) {
            w(fb.k.f10396a);
        } else {
            w(new fb.m(str));
        }
    }

    @Override
    public final void s(boolean z10) {
        w(new fb.m(Boolean.valueOf(z10)));
    }

    public final fb.i u() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return this.G;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final fb.i v() {
        return (fb.i) ic.a.g(1, this.E);
    }

    public final void w(fb.i iVar) {
        if (this.F != null) {
            if (!(iVar instanceof fb.k) || this.v) {
                ((fb.l) v()).n(this.F, iVar);
            }
            this.F = null;
        } else if (this.E.isEmpty()) {
            this.G = iVar;
        } else {
            fb.i v = v();
            if (v instanceof fb.h) {
                ((fb.h) v).f10395a.add(iVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override
    public final void flush() {
    }
}
