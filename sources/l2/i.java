package l2;

import java.io.IOException;
public final class i {
    public final v2.d f14000a;
    public final m2.m f14001b;
    public final m2.b f14002c;
    public final h d;
    public final long e;
    public final long f14003f;

    public i(long j3, m2.m mVar, m2.b bVar, v2.d dVar, long j10, h hVar) {
        this.e = j3;
        this.f14001b = mVar;
        this.f14002c = bVar;
        this.f14003f = j10;
        this.f14000a = dVar;
        this.d = hVar;
    }

    public final i a(long j3, m2.m mVar) {
        long s10;
        long s11;
        h d = this.f14001b.d();
        h d10 = mVar.d();
        if (d == null) {
            return new i(j3, mVar, this.f14002c, this.f14000a, this.f14003f, d);
        } else if (!d.w()) {
            return new i(j3, mVar, this.f14002c, this.f14000a, this.f14003f, d10);
        } else {
            long z10 = d.z(j3);
            if (z10 == 0) {
                return new i(j3, mVar, this.f14002c, this.f14000a, this.f14003f, d10);
            }
            e2.d.h(d10);
            long y3 = d.y();
            long b10 = d.b(y3);
            long j10 = z10 + y3;
            long j11 = j10 - 1;
            long c10 = d.c(j11, j3) + d.b(j11);
            long y10 = d10.y();
            long b11 = d10.b(y10);
            long j12 = this.f14003f;
            int i10 = (c10 > b11 ? 1 : (c10 == b11 ? 0 : -1));
            if (i10 == 0) {
                s10 = j10 - y10;
            } else if (i10 >= 0) {
                if (b11 < b10) {
                    s11 = j12 - (d10.s(b10, j3) - y3);
                    return new i(j3, mVar, this.f14002c, this.f14000a, s11, d10);
                }
                s10 = d.s(b11, j3) - y10;
            } else {
                throw new IOException();
            }
            s11 = s10 + j12;
            return new i(j3, mVar, this.f14002c, this.f14000a, s11, d10);
        }
    }

    public final long b(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.f(this.e, j3) + this.f14003f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        h hVar = this.d;
        e2.d.h(hVar);
        return (hVar.A(this.e, j3) + b10) - 1;
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
        return hVar.c(j3 - this.f14003f, this.e) + f7;
    }

    public final long f(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.b(j3 - this.f14003f);
    }

    public final boolean g(long j3, long j10) {
        h hVar = this.d;
        e2.d.h(hVar);
        if (!hVar.w() && j10 != -9223372036854775807L && e(j3) > j10) {
            return false;
        }
        return true;
    }
}
