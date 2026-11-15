package o2;

import java.io.IOException;
public final class j {
    public final y2.e f21278a;
    public final p2.m f21279b;
    public final p2.b f21280c;
    public final i d;
    public final long f21281e;
    public final long f21282f;

    public j(long j3, p2.m mVar, p2.b bVar, y2.e eVar, long j10, i iVar) {
        this.f21281e = j3;
        this.f21279b = mVar;
        this.f21280c = bVar;
        this.f21282f = j10;
        this.f21278a = eVar;
        this.d = iVar;
    }

    public final j a(long j3, p2.m mVar) {
        long L;
        long L2;
        i c10 = this.f21279b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j3, mVar, this.f21280c, this.f21278a, this.f21282f, c10);
        } else if (!c10.g0()) {
            return new j(j3, mVar, this.f21280c, this.f21278a, this.f21282f, c11);
        } else {
            long t02 = c10.t0(j3);
            if (t02 == 0) {
                return new j(j3, mVar, this.f21280c, this.f21278a, this.f21282f, c11);
            }
            c11.getClass();
            long k02 = c10.k0();
            long b10 = c10.b(k02);
            long j10 = t02 + k02;
            long j11 = j10 - 1;
            long i7 = c10.i(j11, j3) + c10.b(j11);
            long k03 = c11.k0();
            long b11 = c11.b(k03);
            int i10 = (i7 > b11 ? 1 : (i7 == b11 ? 0 : -1));
            long j12 = this.f21282f;
            if (i10 == 0) {
                L = j10 - k03;
            } else if (i10 >= 0) {
                if (b11 < b10) {
                    L2 = j12 - (c11.L(b10, j3) - k02);
                    return new j(j3, mVar, this.f21280c, this.f21278a, L2, c11);
                }
                L = c10.L(b11, j3) - k03;
            } else {
                throw new IOException();
            }
            L2 = L + j12;
            return new j(j3, mVar, this.f21280c, this.f21278a, L2, c11);
        }
    }

    public final long b(long j3) {
        i iVar = this.d;
        iVar.getClass();
        long j10 = this.f21281e;
        iVar.getClass();
        return (iVar.v0(j10, j3) + (iVar.y(j10, j3) + this.f21282f)) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.t0(this.f21281e);
    }

    public final long d(long j3) {
        long e10 = e(j3);
        i iVar = this.d;
        iVar.getClass();
        return iVar.i(j3 - this.f21282f, this.f21281e) + e10;
    }

    public final long e(long j3) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.b(j3 - this.f21282f);
    }

    public final boolean f(long j3, long j10) {
        i iVar = this.d;
        iVar.getClass();
        if (!iVar.g0() && j10 != -9223372036854775807L && d(j3) > j10) {
            return false;
        }
        return true;
    }
}
