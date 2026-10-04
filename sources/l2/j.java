package l2;

import java.io.IOException;
public final class j {
    public final v2.d f15284a;
    public final m2.m f15285b;
    public final m2.b f15286c;
    public final i d;
    public final long f15287e;
    public final long f15288f;

    public j(long j3, m2.m mVar, m2.b bVar, v2.d dVar, long j10, i iVar) {
        this.f15287e = j3;
        this.f15285b = mVar;
        this.f15286c = bVar;
        this.f15288f = j10;
        this.f15284a = dVar;
        this.d = iVar;
    }

    public final j a(long j3, m2.m mVar) {
        long H;
        long H2;
        i c10 = this.f15285b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j3, mVar, this.f15286c, this.f15284a, this.f15288f, c10);
        } else if (!c10.e0()) {
            return new j(j3, mVar, this.f15286c, this.f15284a, this.f15288f, c11);
        } else {
            long p02 = c10.p0(j3);
            if (p02 == 0) {
                return new j(j3, mVar, this.f15286c, this.f15284a, this.f15288f, c11);
            }
            e2.d.h(c11);
            long j02 = c10.j0();
            long a2 = c10.a(j02);
            long j10 = p02 + j02;
            long j11 = j10 - 1;
            long i10 = c10.i(j11, j3) + c10.a(j11);
            long j03 = c11.j0();
            long a10 = c11.a(j03);
            long j12 = this.f15288f;
            int i11 = (i10 > a10 ? 1 : (i10 == a10 ? 0 : -1));
            if (i11 == 0) {
                H = j10 - j03;
            } else if (i11 >= 0) {
                if (a10 < a2) {
                    H2 = j12 - (c11.H(a2, j3) - j02);
                    return new j(j3, mVar, this.f15286c, this.f15284a, H2, c11);
                }
                H = c10.H(a10, j3) - j03;
            } else {
                throw new IOException();
            }
            H2 = H + j12;
            return new j(j3, mVar, this.f15286c, this.f15284a, H2, c11);
        }
    }

    public final long b(long j3) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.n(this.f15287e, j3) + this.f15288f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        i iVar = this.d;
        e2.d.h(iVar);
        return (iVar.q0(this.f15287e, j3) + b10) - 1;
    }

    public final long d() {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.p0(this.f15287e);
    }

    public final long e(long j3) {
        long f7 = f(j3);
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.i(j3 - this.f15288f, this.f15287e) + f7;
    }

    public final long f(long j3) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.a(j3 - this.f15288f);
    }

    public final boolean g(long j3, long j10) {
        i iVar = this.d;
        e2.d.h(iVar);
        if (!iVar.e0() && j10 != -9223372036854775807L && e(j3) > j10) {
            return false;
        }
        return true;
    }
}
