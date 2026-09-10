package l2;

import java.io.IOException;
public final class k {
    public final v2.d f12739a;
    public final m2.m f12740b;
    public final m2.b f12741c;
    public final j d;
    public final long e;
    public final long f12742f;

    public k(long j3, m2.m mVar, m2.b bVar, v2.d dVar, long j10, j jVar) {
        this.e = j3;
        this.f12740b = mVar;
        this.f12741c = bVar;
        this.f12742f = j10;
        this.f12739a = dVar;
        this.d = jVar;
    }

    public final k a(long j3, m2.m mVar) {
        long w10;
        long w11;
        j d = this.f12740b.d();
        j d10 = mVar.d();
        if (d == null) {
            return new k(j3, mVar, this.f12741c, this.f12739a, this.f12742f, d);
        } else if (!d.E()) {
            return new k(j3, mVar, this.f12741c, this.f12739a, this.f12742f, d10);
        } else {
            long K = d.K(j3);
            if (K == 0) {
                return new k(j3, mVar, this.f12741c, this.f12739a, this.f12742f, d10);
            }
            e2.d.h(d10);
            long J = d.J();
            long a2 = d.a(J);
            long j10 = K + J;
            long j11 = j10 - 1;
            long c10 = d.c(j11, j3) + d.a(j11);
            long J2 = d10.J();
            long a10 = d10.a(J2);
            long j12 = this.f12742f;
            int i10 = (c10 > a10 ? 1 : (c10 == a10 ? 0 : -1));
            if (i10 == 0) {
                w10 = j10 - J2;
            } else if (i10 >= 0) {
                if (a10 < a2) {
                    w11 = j12 - (d10.w(a2, j3) - J);
                    return new k(j3, mVar, this.f12741c, this.f12739a, w11, d10);
                }
                w10 = d.w(a10, j3) - J2;
            } else {
                throw new IOException();
            }
            w11 = w10 + j12;
            return new k(j3, mVar, this.f12741c, this.f12739a, w11, d10);
        }
    }

    public final long b(long j3) {
        j jVar = this.d;
        e2.d.h(jVar);
        return jVar.i(this.e, j3) + this.f12742f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        j jVar = this.d;
        e2.d.h(jVar);
        return (jVar.M(this.e, j3) + b10) - 1;
    }

    public final long d() {
        j jVar = this.d;
        e2.d.h(jVar);
        return jVar.K(this.e);
    }

    public final long e(long j3) {
        long f7 = f(j3);
        j jVar = this.d;
        e2.d.h(jVar);
        return jVar.c(j3 - this.f12742f, this.e) + f7;
    }

    public final long f(long j3) {
        j jVar = this.d;
        e2.d.h(jVar);
        return jVar.a(j3 - this.f12742f);
    }

    public final boolean g(long j3, long j10) {
        j jVar = this.d;
        e2.d.h(jVar);
        if (!jVar.E() && j10 != -9223372036854775807L && e(j3) > j10) {
            return false;
        }
        return true;
    }
}
