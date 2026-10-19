package l2;

import java.io.IOException;
public final class j {
    public final v2.e f15862a;
    public final m2.m f15863b;
    public final m2.b f15864c;
    public final i d;
    public final long e;
    public final long f15865f;

    public j(long j10, m2.m mVar, m2.b bVar, v2.e eVar, long j11, i iVar) {
        this.e = j10;
        this.f15863b = mVar;
        this.f15864c = bVar;
        this.f15865f = j11;
        this.f15862a = eVar;
        this.d = iVar;
    }

    public final j a(long j10, m2.m mVar) {
        long p5;
        long p9;
        i c10 = this.f15863b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j10, mVar, this.f15864c, this.f15862a, this.f15865f, c10);
        } else if (!c10.s()) {
            return new j(j10, mVar, this.f15864c, this.f15862a, this.f15865f, c11);
        } else {
            long w9 = c10.w(j10);
            if (w9 == 0) {
                return new j(j10, mVar, this.f15864c, this.f15862a, this.f15865f, c11);
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
            long j13 = this.f15865f;
            if (i10 == 0) {
                p5 = j11 - u11;
            } else if (i10 >= 0) {
                if (a10 < a2) {
                    p9 = j13 - (c11.p(a2, j10) - u10);
                    return new j(j10, mVar, this.f15864c, this.f15862a, p9, c11);
                }
                p5 = c10.p(a10, j10) - u11;
            } else {
                throw new IOException();
            }
            p9 = p5 + j13;
            return new j(j10, mVar, this.f15864c, this.f15862a, p9, c11);
        }
    }

    public final long b(long j10) {
        i iVar = this.d;
        iVar.getClass();
        long j11 = this.e;
        iVar.getClass();
        return (iVar.y(j11, j10) + (iVar.e(j11, j10) + this.f15865f)) - 1;
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
        return iVar.d(j10 - this.f15865f, this.e) + e;
    }

    public final long e(long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.a(j10 - this.f15865f);
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
