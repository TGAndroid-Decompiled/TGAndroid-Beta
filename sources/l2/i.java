package l2;

import java.io.IOException;
public final class i {
    public final v2.d f13843a;
    public final m2.m f13844b;
    public final m2.b f13845c;
    public final h d;
    public final long e;
    public final long f13846f;

    public i(long j3, m2.m mVar, m2.b bVar, v2.d dVar, long j10, h hVar) {
        this.e = j3;
        this.f13844b = mVar;
        this.f13845c = bVar;
        this.f13846f = j10;
        this.f13843a = dVar;
        this.d = hVar;
    }

    public final i a(long j3, m2.m mVar) {
        long v;
        long v9;
        h d = this.f13844b.d();
        h d10 = mVar.d();
        if (d == null) {
            return new i(j3, mVar, this.f13845c, this.f13843a, this.f13846f, d);
        } else if (!d.H()) {
            return new i(j3, mVar, this.f13845c, this.f13843a, this.f13846f, d10);
        } else {
            long P = d.P(j3);
            if (P == 0) {
                return new i(j3, mVar, this.f13845c, this.f13843a, this.f13846f, d10);
            }
            e2.d.h(d10);
            long M = d.M();
            long b10 = d.b(M);
            long j10 = P + M;
            long j11 = j10 - 1;
            long c10 = d.c(j11, j3) + d.b(j11);
            long M2 = d10.M();
            long b11 = d10.b(M2);
            long j12 = this.f13846f;
            int i10 = (c10 > b11 ? 1 : (c10 == b11 ? 0 : -1));
            if (i10 == 0) {
                v = j10 - M2;
            } else if (i10 >= 0) {
                if (b11 < b10) {
                    v9 = j12 - (d10.v(b10, j3) - M);
                    return new i(j3, mVar, this.f13845c, this.f13843a, v9, d10);
                }
                v = d.v(b11, j3) - M2;
            } else {
                throw new IOException();
            }
            v9 = v + j12;
            return new i(j3, mVar, this.f13845c, this.f13843a, v9, d10);
        }
    }

    public final long b(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.f(this.e, j3) + this.f13846f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        h hVar = this.d;
        e2.d.h(hVar);
        return (hVar.S(this.e, j3) + b10) - 1;
    }

    public final long d() {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.P(this.e);
    }

    public final long e(long j3) {
        long f7 = f(j3);
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.c(j3 - this.f13846f, this.e) + f7;
    }

    public final long f(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.b(j3 - this.f13846f);
    }

    public final boolean g(long j3, long j10) {
        h hVar = this.d;
        e2.d.h(hVar);
        if (!hVar.H() && j10 != -9223372036854775807L && e(j3) > j10) {
            return false;
        }
        return true;
    }
}
