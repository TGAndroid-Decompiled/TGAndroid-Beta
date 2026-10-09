package l2;

import java.io.IOException;
public final class j {
    public final v2.d f15350a;
    public final m2.m f15351b;
    public final m2.b f15352c;
    public final i d;
    public final long f15353e;
    public final long f15354f;

    public j(long j3, m2.m mVar, m2.b bVar, v2.d dVar, long j10, i iVar) {
        this.f15353e = j3;
        this.f15351b = mVar;
        this.f15352c = bVar;
        this.f15354f = j10;
        this.f15350a = dVar;
        this.d = iVar;
    }

    public final j a(long j3, m2.m mVar) {
        long n10;
        long n11;
        i c10 = this.f15351b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j3, mVar, this.f15352c, this.f15350a, this.f15354f, c10);
        } else if (!c10.t()) {
            return new j(j3, mVar, this.f15352c, this.f15350a, this.f15354f, c11);
        } else {
            long w10 = c10.w(j3);
            if (w10 == 0) {
                return new j(j3, mVar, this.f15352c, this.f15350a, this.f15354f, c11);
            }
            e2.d.h(c11);
            long u10 = c10.u();
            long b10 = c10.b(u10);
            long j10 = w10 + u10;
            long j11 = j10 - 1;
            long d = c10.d(j11, j3) + c10.b(j11);
            long u11 = c11.u();
            long b11 = c11.b(u11);
            int i10 = (d > b11 ? 1 : (d == b11 ? 0 : -1));
            long j12 = this.f15354f;
            if (i10 == 0) {
                n10 = j10 - u11;
            } else if (i10 >= 0) {
                if (b11 < b10) {
                    n11 = j12 - (c11.n(b10, j3) - u10);
                    return new j(j3, mVar, this.f15352c, this.f15350a, n11, c11);
                }
                n10 = c10.n(b11, j3) - u11;
            } else {
                throw new IOException();
            }
            n11 = n10 + j12;
            return new j(j3, mVar, this.f15352c, this.f15350a, n11, c11);
        }
    }

    public final long b(long j3) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.f(this.f15353e, j3) + this.f15354f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        i iVar = this.d;
        e2.d.h(iVar);
        return (iVar.y(this.f15353e, j3) + b10) - 1;
    }

    public final long d() {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.w(this.f15353e);
    }

    public final long e(long j3) {
        long f7 = f(j3);
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.d(j3 - this.f15354f, this.f15353e) + f7;
    }

    public final long f(long j3) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.b(j3 - this.f15354f);
    }

    public final boolean g(long j3, long j10) {
        i iVar = this.d;
        e2.d.h(iVar);
        if (!iVar.t() && j10 != -9223372036854775807L && e(j3) > j10) {
            return false;
        }
        return true;
    }
}
