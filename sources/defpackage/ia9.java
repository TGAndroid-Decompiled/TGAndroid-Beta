package defpackage;

import java.util.ArrayList;
public final class ia9 extends ka9 implements d73 {
    public final rx9 f;

    public ia9(go4 go4Var, mo5 mo5Var, rx9 rx9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(go4Var, mo5Var, rx9Var, arrayList, arrayList2, arrayList3);
        this.f = rx9Var;
    }

    @Override
    public final long J(long j, long j2) {
        return this.f.g(j, j2);
    }

    @Override
    public final boolean T() {
        return this.f.j();
    }

    @Override
    public final long V() {
        return this.f.d;
    }

    @Override
    public final long X(long j) {
        return this.f.e(j);
    }

    @Override
    public final long e(long j) {
        return this.f.h(j);
    }

    @Override
    public final long e0(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override
    public final long j(long j, long j2) {
        return this.f.f(j, j2);
    }

    @Override
    public final long m(long j, long j2) {
        return this.f.d(j, j2);
    }

    @Override
    public final long u(long j, long j2) {
        rx9 rx9Var = this.f;
        if (rx9Var.f != null) {
            return -9223372036854775807L;
        }
        long c = rx9Var.c(j, j2) + rx9Var.d(j, j2);
        return (rx9Var.f(c, j) + rx9Var.h(c)) - rx9Var.i;
    }

    @Override
    public final b19 w(long j) {
        return this.f.i(this, j);
    }

    @Override
    public final d73 b() {
        return this;
    }
}
