package l2;

import java.io.IOException;
public final class j {
    public final v2.e f11606a;
    public final m2.m f11607b;
    public final m2.b f11608c;
    public final i d;
    public final long e;
    public final long f11609f;

    public j(long j10, m2.m mVar, m2.b bVar, v2.e eVar, long j11, i iVar) {
        this.e = j10;
        this.f11607b = mVar;
        this.f11608c = bVar;
        this.f11609f = j11;
        this.f11606a = eVar;
        this.d = iVar;
    }

    public final j a(long j10, m2.m mVar) {
        long o10;
        long o11;
        i d = this.f11607b.d();
        i d10 = mVar.d();
        if (d == null) {
            return new j(j10, mVar, this.f11608c, this.f11606a, this.f11609f, d);
        } else if (!d.t()) {
            return new j(j10, mVar, this.f11608c, this.f11606a, this.f11609f, d10);
        } else {
            long z10 = d.z(j10);
            if (z10 == 0) {
                return new j(j10, mVar, this.f11608c, this.f11606a, this.f11609f, d10);
            }
            d10.getClass();
            long u10 = d.u();
            long a2 = d.a(u10);
            long j11 = z10 + u10;
            long j12 = j11 - 1;
            long c10 = d.c(j12, j10) + d.a(j12);
            long u11 = d10.u();
            long a10 = d10.a(u11);
            int i10 = (c10 > a10 ? 1 : (c10 == a10 ? 0 : -1));
            long j13 = this.f11609f;
            if (i10 == 0) {
                o10 = j11 - u11;
            } else if (i10 >= 0) {
                if (a10 < a2) {
                    o11 = j13 - (d10.o(a2, j10) - u10);
                    return new j(j10, mVar, this.f11608c, this.f11606a, o11, d10);
                }
                o10 = d.o(a10, j10) - u11;
            } else {
                throw new IOException();
            }
            o11 = o10 + j13;
            return new j(j10, mVar, this.f11608c, this.f11606a, o11, d10);
        }
    }

    public final long b(long j10) {
        i iVar = this.d;
        iVar.getClass();
        long j11 = this.e;
        iVar.getClass();
        return (iVar.A(j11, j10) + (iVar.e(j11, j10) + this.f11609f)) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.z(this.e);
    }

    public final long d(long j10) {
        long e = e(j10);
        i iVar = this.d;
        iVar.getClass();
        return iVar.c(j10 - this.f11609f, this.e) + e;
    }

    public final long e(long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.a(j10 - this.f11609f);
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
