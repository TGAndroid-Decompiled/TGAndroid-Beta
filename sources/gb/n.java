package gb;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
public final class n extends lb.b {
    public static final m H = new m();
    public static final db.m I = new db.m("closed");
    public final ArrayList E;
    public String F;
    public db.i G;

    public n() {
        super(H);
        this.E = new ArrayList();
        this.G = db.k.f6682a;
    }

    @Override
    public final void b() {
        db.h hVar = new db.h();
        w(hVar);
        this.E.add(hVar);
    }

    @Override
    public final void c() {
        db.l lVar = new db.l();
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
            if (v() instanceof db.h) {
                a4.a.x(1, arrayList);
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
            if (v() instanceof db.l) {
                a4.a.x(1, arrayList);
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
            if (v() instanceof db.l) {
                this.F = str;
                return;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    @Override
    public final lb.b i() {
        w(db.k.f6682a);
        return this;
    }

    @Override
    public final void n(double d) {
        if (this.f15356n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new db.m(Double.valueOf(d)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override
    public final void o(long j3) {
        w(new db.m(Long.valueOf(j3)));
    }

    @Override
    public final void p(Boolean bool) {
        if (bool == null) {
            w(db.k.f6682a);
        } else {
            w(new db.m(bool));
        }
    }

    @Override
    public final void q(Number number) {
        if (number == null) {
            w(db.k.f6682a);
            return;
        }
        if (this.f15356n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new db.m(number));
    }

    @Override
    public final void r(String str) {
        if (str == null) {
            w(db.k.f6682a);
        } else {
            w(new db.m(str));
        }
    }

    @Override
    public final void s(boolean z10) {
        w(new db.m(Boolean.valueOf(z10)));
    }

    public final db.i u() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return this.G;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final db.i v() {
        return (db.i) i2.g.h(1, this.E);
    }

    public final void w(db.i iVar) {
        if (this.F != null) {
            if (!(iVar instanceof db.k) || this.v) {
                ((db.l) v()).o(this.F, iVar);
            }
            this.F = null;
        } else if (this.E.isEmpty()) {
            this.G = iVar;
        } else {
            db.i v = v();
            if (v instanceof db.h) {
                ((db.h) v).f6681a.add(iVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override
    public final void flush() {
    }
}
