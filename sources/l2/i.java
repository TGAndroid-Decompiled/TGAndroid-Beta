package l2;

import java.io.IOException;
public final class i {
    public final v2.e f16826a;
    public final m2.m f16827b;
    public final m2.b f16828c;
    public final h d;
    public final long e;
    public final long f16829f;

    public i(long j10, m2.m mVar, m2.b bVar, v2.e eVar, long j11, h hVar) {
        this.e = j10;
        this.f16827b = mVar;
        this.f16828c = bVar;
        this.f16829f = j11;
        this.f16826a = eVar;
        this.d = hVar;
    }

    public final i a(long j10, m2.m mVar) {
        long t10;
        long t11;
        h c10 = this.f16827b.c();
        h c11 = mVar.c();
        if (c10 == null) {
            return new i(j10, mVar, this.f16828c, this.f16826a, this.f16829f, c10);
        } else if (!c10.N()) {
            return new i(j10, mVar, this.f16828c, this.f16826a, this.f16829f, c11);
        } else {
            long V = c10.V(j10);
            if (V == 0) {
                return new i(j10, mVar, this.f16828c, this.f16826a, this.f16829f, c11);
            }
            c11.getClass();
            long R = c10.R();
            long a2 = c10.a(R);
            long j11 = V + R;
            long j12 = j11 - 1;
            long e = c10.e(j12, j10) + c10.a(j12);
            long R2 = c11.R();
            long a10 = c11.a(R2);
            int i10 = (e > a10 ? 1 : (e == a10 ? 0 : -1));
            long j13 = this.f16829f;
            if (i10 == 0) {
                t10 = j11 - R2;
            } else if (i10 >= 0) {
                if (a10 < a2) {
                    t11 = j13 - (c11.t(a2, j10) - R);
                    return new i(j10, mVar, this.f16828c, this.f16826a, t11, c11);
                }
                t10 = c10.t(a10, j10) - R2;
            } else {
                throw new IOException();
            }
            t11 = t10 + j13;
            return new i(j10, mVar, this.f16828c, this.f16826a, t11, c11);
        }
    }

    public final long b(long j10) {
        h hVar = this.d;
        hVar.getClass();
        long j11 = this.e;
        hVar.getClass();
        return (hVar.W(j11, j10) + (hVar.g(j11, j10) + this.f16829f)) - 1;
    }

    public final long c() {
        h hVar = this.d;
        hVar.getClass();
        return hVar.V(this.e);
    }

    public final long d(long j10) {
        long e = e(j10);
        h hVar = this.d;
        hVar.getClass();
        return hVar.e(j10 - this.f16829f, this.e) + e;
    }

    public final long e(long j10) {
        h hVar = this.d;
        hVar.getClass();
        return hVar.a(j10 - this.f16829f);
    }

    public final boolean f(long j10, long j11) {
        h hVar = this.d;
        hVar.getClass();
        if (!hVar.N() && j11 != -9223372036854775807L && d(j10) > j11) {
            return false;
        }
        return true;
    }
}
