package m4;

import java.io.IOException;
public final class i {
    public final l4.d f17316a;
    public final n4.m f17317b;
    public final n4.b f17318c;
    public final h d;
    public final long f17319e;
    public final long f17320f;

    public i(long j10, n4.m mVar, n4.b bVar, l4.d dVar, long j11, h hVar) {
        this.f17319e = j10;
        this.f17317b = mVar;
        this.f17318c = bVar;
        this.f17320f = j11;
        this.f17316a = dVar;
        this.d = hVar;
    }

    public final i a(long j10, n4.m mVar) {
        long q10;
        long q11;
        h c10 = this.f17317b.c();
        h c11 = mVar.c();
        if (c10 == null) {
            return new i(j10, mVar, this.f17318c, this.f17316a, this.f17320f, c10);
        } else if (!c10.v()) {
            return new i(j10, mVar, this.f17318c, this.f17316a, this.f17320f, c11);
        } else {
            long z10 = c10.z(j10);
            if (z10 == 0) {
                return new i(j10, mVar, this.f17318c, this.f17316a, this.f17320f, c11);
            }
            long x10 = c10.x();
            long a2 = c10.a(x10);
            long j11 = z10 + x10;
            long j12 = j11 - 1;
            long f10 = c10.f(j12, j10) + c10.a(j12);
            long x11 = c11.x();
            long a3 = c11.a(x11);
            long j13 = this.f17320f;
            int i9 = (f10 > a3 ? 1 : (f10 == a3 ? 0 : -1));
            if (i9 == 0) {
                q10 = j11 - x11;
            } else if (i9 >= 0) {
                if (a3 < a2) {
                    q11 = j13 - (c11.q(a2, j10) - x10);
                    return new i(j10, mVar, this.f17318c, this.f17316a, q11, c11);
                }
                q10 = c10.q(a3, j10) - x11;
            } else {
                throw new IOException();
            }
            q11 = q10 + j13;
            return new i(j10, mVar, this.f17318c, this.f17316a, q11, c11);
        }
    }

    public final long b(long j10) {
        h hVar = this.d;
        long j11 = this.f17319e;
        return (hVar.C(j11, j10) + (hVar.i(j11, j10) + this.f17320f)) - 1;
    }

    public final long c(long j10) {
        return this.d.f(j10 - this.f17320f, this.f17319e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.a(j10 - this.f17320f);
    }
}
