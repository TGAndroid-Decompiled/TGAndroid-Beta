package oa;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
public final class n extends ta.c {
    public static final m D = new m();
    public static final la.m E = new la.m("closed");
    public final ArrayList A;
    public String B;
    public la.i C;

    public n() {
        super(D);
        this.A = new ArrayList();
        this.C = la.k.f16726a;
    }

    @Override
    public final void b() {
        la.h hVar = new la.h();
        w(hVar);
        this.A.add(hVar);
    }

    @Override
    public final void c() {
        la.l lVar = new la.l();
        w(lVar);
        this.A.add(lVar);
    }

    @Override
    public final void close() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            arrayList.add(E);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty() && this.B == null) {
            if (v() instanceof la.h) {
                aa.d.u(1, arrayList);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty() && this.B == null) {
            if (v() instanceof la.l) {
                aa.d.u(1, arrayList);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.A.isEmpty() && this.B == null) {
            if (v() instanceof la.l) {
                this.B = str;
                return;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    @Override
    public final ta.c i() {
        w(la.k.f16726a);
        return this;
    }

    @Override
    public final void n(double d) {
        if (this.f47764n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new la.m(Double.valueOf(d)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override
    public final void o(long j10) {
        w(new la.m(Long.valueOf(j10)));
    }

    @Override
    public final void p(Boolean bool) {
        if (bool == null) {
            w(la.k.f16726a);
        } else {
            w(new la.m(bool));
        }
    }

    @Override
    public final void q(Number number) {
        if (number == null) {
            w(la.k.f16726a);
            return;
        }
        if (this.f47764n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new la.m(number));
    }

    @Override
    public final void r(String str) {
        if (str == null) {
            w(la.k.f16726a);
        } else {
            w(new la.m(str));
        }
    }

    @Override
    public final void s(boolean z10) {
        w(new la.m(Boolean.valueOf(z10)));
    }

    public final la.i u() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return this.C;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final la.i v() {
        return (la.i) j3.r0.j(1, this.A);
    }

    public final void w(la.i iVar) {
        if (this.B != null) {
            if (!(iVar instanceof la.k) || this.v) {
                ((la.l) v()).o(this.B, iVar);
            }
            this.B = null;
        } else if (this.A.isEmpty()) {
            this.C = iVar;
        } else {
            la.i v = v();
            if (v instanceof la.h) {
                ((la.h) v).f16725a.add(iVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override
    public final void flush() {
    }
}
