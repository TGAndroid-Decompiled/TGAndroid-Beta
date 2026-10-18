package l2;

import java.io.IOException;
public final class j {
    public final v2.e f15861a;
    public final m2.m f15862b;
    public final m2.b f15863c;
    public final i d;
    public final long e;
    public final long f15864f;

    public j(long j10, m2.m mVar, m2.b bVar, v2.e eVar, long j11, i iVar) {
        this.e = j10;
        this.f15862b = mVar;
        this.f15863c = bVar;
        this.f15864f = j11;
        this.f15861a = eVar;
        this.d = iVar;
    }

    public final j a(long j10, m2.m mVar) {
        long o10;
        long o11;
        i c10 = this.f15862b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j10, mVar, this.f15863c, this.f15861a, this.f15864f, c10);
        } else if (!c10.s()) {
            return new j(j10, mVar, this.f15863c, this.f15861a, this.f15864f, c11);
        } else {
            long w9 = c10.w(j10);
            if (w9 == 0) {
                return new j(j10, mVar, this.f15863c, this.f15861a, this.f15864f, c11);
            }
            c11.getClass();
            long u10 = c10.u();
            long a2 = c10.a(u10);
            long j11 = w9 + u10;
            long j12 = j11 - 1;
            long d = c10.d(j12, j10) + c10.a(j12);
            long u11 = c11.u();
            long a10 = c11.a(u11);
            int i10 = (d > a10 ? 1 : (d == a10 ? 0 : -1));
            long j13 = this.f15864f;
            if (i10 == 0) {
                o10 = j11 - u11;
            } else if (i10 >= 0) {
                if (a10 < a2) {
                    o11 = j13 - (c11.o(a2, j10) - u10);
                    return new j(j10, mVar, this.f15863c, this.f15861a, o11, c11);
                }
                o10 = c10.o(a10, j10) - u11;
            } else {
                throw new IOException();
            }
            o11 = o10 + j13;
            return new j(j10, mVar, this.f15863c, this.f15861a, o11, c11);
        }
    }

    public final long b(long j10) {
        i iVar = this.d;
        iVar.getClass();
        long j11 = this.e;
        iVar.getClass();
        return (iVar.x(j11, j10) + (iVar.e(j11, j10) + this.f15864f)) - 1;
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
        return iVar.d(j10 - this.f15864f, this.e) + e;
    }

    public final long e(long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.a(j10 - this.f15864f);
    }

    public final boolean f(long j10, long j11) {
        i iVar = this.d;
        iVar.getClass();
        if (!iVar.s() && j11 != -9223372036854775807L && d(j10) > j11) {
            return false;
        }
        return true;
    }
}
