package l2;

import java.io.IOException;
public final class j {
    public final v2.e f15925a;
    public final m2.m f15926b;
    public final m2.b f15927c;
    public final i d;
    public final long e;
    public final long f15928f;

    public j(long j10, m2.m mVar, m2.b bVar, v2.e eVar, long j11, i iVar) {
        this.e = j10;
        this.f15926b = mVar;
        this.f15927c = bVar;
        this.f15928f = j11;
        this.f15925a = eVar;
        this.d = iVar;
    }

    public final j a(long j10, m2.m mVar) {
        long n10;
        long n11;
        i d = this.f15926b.d();
        i d10 = mVar.d();
        if (d == null) {
            return new j(j10, mVar, this.f15927c, this.f15925a, this.f15928f, d);
        } else if (!d.s()) {
            return new j(j10, mVar, this.f15927c, this.f15925a, this.f15928f, d10);
        } else {
            long A = d.A(j10);
            if (A == 0) {
                return new j(j10, mVar, this.f15927c, this.f15925a, this.f15928f, d10);
            }
            d10.getClass();
            long w9 = d.w();
            long b10 = d.b(w9);
            long j11 = A + w9;
            long j12 = j11 - 1;
            long c10 = d.c(j12, j10) + d.b(j12);
            long w10 = d10.w();
            long b11 = d10.b(w10);
            int i10 = (c10 > b11 ? 1 : (c10 == b11 ? 0 : -1));
            long j13 = this.f15928f;
            if (i10 == 0) {
                n10 = j11 - w10;
            } else if (i10 >= 0) {
                if (b11 < b10) {
                    n11 = j13 - (d10.n(b10, j10) - w9);
                    return new j(j10, mVar, this.f15927c, this.f15925a, n11, d10);
                }
                n10 = d.n(b11, j10) - w10;
            } else {
                throw new IOException();
            }
            n11 = n10 + j13;
            return new j(j10, mVar, this.f15927c, this.f15925a, n11, d10);
        }
    }

    public final long b(long j10) {
        i iVar = this.d;
        iVar.getClass();
        long j11 = this.e;
        iVar.getClass();
        return (iVar.B(j11, j10) + (iVar.e(j11, j10) + this.f15928f)) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.A(this.e);
    }

    public final long d(long j10) {
        long e = e(j10);
        i iVar = this.d;
        iVar.getClass();
        return iVar.c(j10 - this.f15928f, this.e) + e;
    }

    public final long e(long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.b(j10 - this.f15928f);
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
