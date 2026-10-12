package l2;

import java.io.IOException;
public final class j {
    public final v2.e f14522a;
    public final m2.m f14523b;
    public final m2.b f14524c;
    public final i d;
    public final long e;
    public final long f14525f;

    public j(long j10, m2.m mVar, m2.b bVar, v2.e eVar, long j11, i iVar) {
        this.e = j10;
        this.f14523b = mVar;
        this.f14524c = bVar;
        this.f14525f = j11;
        this.f14522a = eVar;
        this.d = iVar;
    }

    public final j a(long j10, m2.m mVar) {
        long o10;
        long o11;
        i d = this.f14523b.d();
        i d10 = mVar.d();
        if (d == null) {
            return new j(j10, mVar, this.f14524c, this.f14522a, this.f14525f, d);
        } else if (!d.t()) {
            return new j(j10, mVar, this.f14524c, this.f14522a, this.f14525f, d10);
        } else {
            long w9 = d.w(j10);
            if (w9 == 0) {
                return new j(j10, mVar, this.f14524c, this.f14522a, this.f14525f, d10);
            }
            d10.getClass();
            long u10 = d.u();
            long b10 = d.b(u10);
            long j11 = w9 + u10;
            long j12 = j11 - 1;
            long c10 = d.c(j12, j10) + d.b(j12);
            long u11 = d10.u();
            long b11 = d10.b(u11);
            int i10 = (c10 > b11 ? 1 : (c10 == b11 ? 0 : -1));
            long j13 = this.f14525f;
            if (i10 == 0) {
                o10 = j11 - u11;
            } else if (i10 >= 0) {
                if (b11 < b10) {
                    o11 = j13 - (d10.o(b10, j10) - u10);
                    return new j(j10, mVar, this.f14524c, this.f14522a, o11, d10);
                }
                o10 = d.o(b11, j10) - u11;
            } else {
                throw new IOException();
            }
            o11 = o10 + j13;
            return new j(j10, mVar, this.f14524c, this.f14522a, o11, d10);
        }
    }

    public final long b(long j10) {
        i iVar = this.d;
        iVar.getClass();
        long j11 = this.e;
        iVar.getClass();
        return (iVar.x(j11, j10) + (iVar.e(j11, j10) + this.f14525f)) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.w(this.e);
    }

    public final long d(long j10) {
        long e = e(j10);
        i iVar = this.d;
        iVar.getClass();
        return iVar.c(j10 - this.f14525f, this.e) + e;
    }

    public final long e(long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.b(j10 - this.f14525f);
    }

    public final boolean f(long j10, long j11) {
        i iVar = this.d;
        iVar.getClass();
        if (!iVar.t() && j11 != -9223372036854775807L && d(j10) > j11) {
            return false;
        }
        return true;
    }
}
