package l2;

import java.io.IOException;
public final class i {
    public final v2.d f15223a;
    public final m2.m f15224b;
    public final m2.b f15225c;
    public final h d;
    public final long f15226e;
    public final long f15227f;

    public i(long j3, m2.m mVar, m2.b bVar, v2.d dVar, long j10, h hVar) {
        this.f15226e = j3;
        this.f15224b = mVar;
        this.f15225c = bVar;
        this.f15227f = j10;
        this.f15223a = dVar;
        this.d = hVar;
    }

    public final i a(long j3, m2.m mVar) {
        long o9;
        long o10;
        h d = this.f15224b.d();
        h d10 = mVar.d();
        if (d == null) {
            return new i(j3, mVar, this.f15225c, this.f15223a, this.f15227f, d);
        } else if (!d.t()) {
            return new i(j3, mVar, this.f15225c, this.f15223a, this.f15227f, d10);
        } else {
            long w10 = d.w(j3);
            if (w10 == 0) {
                return new i(j3, mVar, this.f15225c, this.f15223a, this.f15227f, d10);
            }
            e2.d.h(d10);
            long u10 = d.u();
            long a2 = d.a(u10);
            long j10 = w10 + u10;
            long j11 = j10 - 1;
            long c10 = d.c(j11, j3) + d.a(j11);
            long u11 = d10.u();
            long a10 = d10.a(u11);
            long j12 = this.f15227f;
            int i10 = (c10 > a10 ? 1 : (c10 == a10 ? 0 : -1));
            if (i10 == 0) {
                o9 = j10 - u11;
            } else if (i10 >= 0) {
                if (a10 < a2) {
                    o10 = j12 - (d10.o(a2, j3) - u10);
                    return new i(j3, mVar, this.f15225c, this.f15223a, o10, d10);
                }
                o9 = d.o(a10, j3) - u11;
            } else {
                throw new IOException();
            }
            o10 = o9 + j12;
            return new i(j3, mVar, this.f15225c, this.f15223a, o10, d10);
        }
    }

    public final long b(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.e(this.f15226e, j3) + this.f15227f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        h hVar = this.d;
        e2.d.h(hVar);
        return (hVar.y(this.f15226e, j3) + b10) - 1;
    }

    public final long d() {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.w(this.f15226e);
    }

    public final long e(long j3) {
        long f7 = f(j3);
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.c(j3 - this.f15227f, this.f15226e) + f7;
    }

    public final long f(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.a(j3 - this.f15227f);
    }

    public final boolean g(long j3, long j10) {
        h hVar = this.d;
        e2.d.h(hVar);
        if (!hVar.t() && j10 != -9223372036854775807L && e(j3) > j10) {
            return false;
        }
        return true;
    }
}
