package l2;

import java.io.IOException;
public final class i {
    public final v2.d f14039a;
    public final m2.m f14040b;
    public final m2.b f14041c;
    public final h d;
    public final long e;
    public final long f14042f;

    public i(long j3, m2.m mVar, m2.b bVar, v2.d dVar, long j10, h hVar) {
        this.e = j3;
        this.f14040b = mVar;
        this.f14041c = bVar;
        this.f14042f = j10;
        this.f14039a = dVar;
        this.d = hVar;
    }

    public final i a(long j3, m2.m mVar) {
        long s10;
        long s11;
        h d = this.f14040b.d();
        h d10 = mVar.d();
        if (d == null) {
            return new i(j3, mVar, this.f14041c, this.f14039a, this.f14042f, d);
        } else if (!d.v()) {
            return new i(j3, mVar, this.f14041c, this.f14039a, this.f14042f, d10);
        } else {
            long z10 = d.z(j3);
            if (z10 == 0) {
                return new i(j3, mVar, this.f14041c, this.f14039a, this.f14042f, d10);
            }
            e2.d.h(d10);
            long w10 = d.w();
            long b10 = d.b(w10);
            long j10 = z10 + w10;
            long j11 = j10 - 1;
            long c10 = d.c(j11, j3) + d.b(j11);
            long w11 = d10.w();
            long b11 = d10.b(w11);
            long j12 = this.f14042f;
            int i10 = (c10 > b11 ? 1 : (c10 == b11 ? 0 : -1));
            if (i10 == 0) {
                s10 = j10 - w11;
            } else if (i10 >= 0) {
                if (b11 < b10) {
                    s11 = j12 - (d10.s(b10, j3) - w10);
                    return new i(j3, mVar, this.f14041c, this.f14039a, s11, d10);
                }
                s10 = d.s(b11, j3) - w11;
            } else {
                throw new IOException();
            }
            s11 = s10 + j12;
            return new i(j3, mVar, this.f14041c, this.f14039a, s11, d10);
        }
    }

    public final long b(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.e(this.e, j3) + this.f14042f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        h hVar = this.d;
        e2.d.h(hVar);
        return (hVar.E(this.e, j3) + b10) - 1;
    }

    public final long d() {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.z(this.e);
    }

    public final long e(long j3) {
        long f7 = f(j3);
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.c(j3 - this.f14042f, this.e) + f7;
    }

    public final long f(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.b(j3 - this.f14042f);
    }

    public final boolean g(long j3, long j10) {
        h hVar = this.d;
        e2.d.h(hVar);
        if (!hVar.v() && j10 != -9223372036854775807L && e(j3) > j10) {
            return false;
        }
        return true;
    }
}
