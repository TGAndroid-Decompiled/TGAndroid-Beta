package o2;

import java.io.IOException;
public final class j {
    public final y2.e f20754a;
    public final p2.m f20755b;
    public final p2.b f20756c;
    public final i d;
    public final long f20757e;
    public final long f20758f;

    public j(long j3, p2.m mVar, p2.b bVar, y2.e eVar, long j10, i iVar) {
        this.f20757e = j3;
        this.f20755b = mVar;
        this.f20756c = bVar;
        this.f20758f = j10;
        this.f20754a = eVar;
        this.d = iVar;
    }

    public final j a(long j3, p2.m mVar) {
        long o4;
        long o10;
        i c10 = this.f20755b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j3, mVar, this.f20756c, this.f20754a, this.f20758f, c10);
        } else if (!c10.t()) {
            return new j(j3, mVar, this.f20756c, this.f20754a, this.f20758f, c11);
        } else {
            long x10 = c10.x(j3);
            if (x10 == 0) {
                return new j(j3, mVar, this.f20756c, this.f20754a, this.f20758f, c11);
            }
            c11.getClass();
            long u10 = c10.u();
            long a10 = c10.a(u10);
            long j10 = x10 + u10;
            long j11 = j10 - 1;
            long d = c10.d(j11, j3) + c10.a(j11);
            long u11 = c11.u();
            long a11 = c11.a(u11);
            int i7 = (d > a11 ? 1 : (d == a11 ? 0 : -1));
            long j12 = this.f20758f;
            if (i7 == 0) {
                o4 = j10 - u11;
            } else if (i7 >= 0) {
                if (a11 < a10) {
                    o10 = j12 - (c11.o(a10, j3) - u10);
                    return new j(j3, mVar, this.f20756c, this.f20754a, o10, c11);
                }
                o4 = c10.o(a11, j3) - u11;
            } else {
                throw new IOException();
            }
            o10 = o4 + j12;
            return new j(j3, mVar, this.f20756c, this.f20754a, o10, c11);
        }
    }

    public final long b(long j3) {
        i iVar = this.d;
        iVar.getClass();
        long j10 = this.f20757e;
        iVar.getClass();
        return (iVar.z(j10, j3) + (iVar.e(j10, j3) + this.f20758f)) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.x(this.f20757e);
    }

    public final long d(long j3) {
        long e10 = e(j3);
        i iVar = this.d;
        iVar.getClass();
        return iVar.d(j3 - this.f20758f, this.f20757e) + e10;
    }

    public final long e(long j3) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.a(j3 - this.f20758f);
    }

    public final boolean f(long j3, long j10) {
        i iVar = this.d;
        iVar.getClass();
        if (!iVar.t() && j10 != -9223372036854775807L && d(j3) > j10) {
            return false;
        }
        return true;
    }
}
