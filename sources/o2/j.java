package o2;

import java.io.IOException;
public final class j {
    public final y2.e f21735a;
    public final p2.m f21736b;
    public final p2.b f21737c;
    public final i d;
    public final long f21738e;
    public final long f21739f;

    public j(long j3, p2.m mVar, p2.b bVar, y2.e eVar, long j10, i iVar) {
        this.f21738e = j3;
        this.f21736b = mVar;
        this.f21737c = bVar;
        this.f21739f = j10;
        this.f21735a = eVar;
        this.d = iVar;
    }

    public final j a(long j3, p2.m mVar) {
        long n10;
        long n11;
        i d = this.f21736b.d();
        i d2 = mVar.d();
        if (d == null) {
            return new j(j3, mVar, this.f21737c, this.f21735a, this.f21739f, d);
        } else if (!d.r()) {
            return new j(j3, mVar, this.f21737c, this.f21735a, this.f21739f, d2);
        } else {
            long x10 = d.x(j3);
            if (x10 == 0) {
                return new j(j3, mVar, this.f21737c, this.f21735a, this.f21739f, d2);
            }
            d2.getClass();
            long s5 = d.s();
            long a10 = d.a(s5);
            long j10 = x10 + s5;
            long j11 = j10 - 1;
            long c10 = d.c(j11, j3) + d.a(j11);
            long s9 = d2.s();
            long a11 = d2.a(s9);
            int i7 = (c10 > a11 ? 1 : (c10 == a11 ? 0 : -1));
            long j12 = this.f21739f;
            if (i7 == 0) {
                n10 = j10 - s9;
            } else if (i7 >= 0) {
                if (a11 < a10) {
                    n11 = j12 - (d2.n(a10, j3) - s5);
                    return new j(j3, mVar, this.f21737c, this.f21735a, n11, d2);
                }
                n10 = d.n(a11, j3) - s9;
            } else {
                throw new IOException();
            }
            n11 = n10 + j12;
            return new j(j3, mVar, this.f21737c, this.f21735a, n11, d2);
        }
    }

    public final long b(long j3) {
        i iVar = this.d;
        iVar.getClass();
        long j10 = this.f21738e;
        iVar.getClass();
        return (iVar.z(j10, j3) + (iVar.e(j10, j3) + this.f21739f)) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.x(this.f21738e);
    }

    public final long d(long j3) {
        long e10 = e(j3);
        i iVar = this.d;
        iVar.getClass();
        return iVar.c(j3 - this.f21739f, this.f21738e) + e10;
    }

    public final long e(long j3) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.a(j3 - this.f21739f);
    }

    public final boolean f(long j3, long j10) {
        i iVar = this.d;
        iVar.getClass();
        if (!iVar.r() && j10 != -9223372036854775807L && d(j3) > j10) {
            return false;
        }
        return true;
    }
}
