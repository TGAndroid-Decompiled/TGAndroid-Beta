package hb;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
public final class n extends mb.b {
    public static final m H = new m();
    public static final eb.m I = new eb.m("closed");
    public final ArrayList E;
    public String F;
    public eb.i G;

    public n() {
        super(H);
        this.E = new ArrayList();
        this.G = eb.k.f8691a;
    }

    @Override
    public final void b() {
        eb.h hVar = new eb.h();
        w(hVar);
        this.E.add(hVar);
    }

    @Override
    public final void c() {
        eb.l lVar = new eb.l();
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
            if (v() instanceof eb.h) {
                a1.g.y(1, arrayList);
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
            if (v() instanceof eb.l) {
                a1.g.y(1, arrayList);
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
            if (v() instanceof eb.l) {
                this.F = str;
                return;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    @Override
    public final mb.b i() {
        w(eb.k.f8691a);
        return this;
    }

    @Override
    public final void n(double d) {
        if (this.f15750n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new eb.m(Double.valueOf(d)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override
    public final void o(long j10) {
        w(new eb.m(Long.valueOf(j10)));
    }

    @Override
    public final void p(Boolean bool) {
        if (bool == null) {
            w(eb.k.f8691a);
        } else {
            w(new eb.m(bool));
        }
    }

    @Override
    public final void q(Number number) {
        if (number == null) {
            w(eb.k.f8691a);
            return;
        }
        if (this.f15750n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new eb.m(number));
    }

    @Override
    public final void r(String str) {
        if (str == null) {
            w(eb.k.f8691a);
        } else {
            w(new eb.m(str));
        }
    }

    @Override
    public final void s(boolean z10) {
        w(new eb.m(Boolean.valueOf(z10)));
    }

    public final eb.i u() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return this.G;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final eb.i v() {
        return (eb.i) i2.d.g(1, this.E);
    }

    public final void w(eb.i iVar) {
        if (this.F != null) {
            if (!(iVar instanceof eb.k) || this.v) {
                ((eb.l) v()).n(this.F, iVar);
            }
            this.F = null;
        } else if (this.E.isEmpty()) {
            this.G = iVar;
        } else {
            eb.i v = v();
            if (v instanceof eb.h) {
                ((eb.h) v).f8690a.add(iVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override
    public final void flush() {
    }
}
