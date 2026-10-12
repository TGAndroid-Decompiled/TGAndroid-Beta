package l2;

import java.io.IOException;
public final class j {
    public final v2.d f15099a;
    public final m2.m f15100b;
    public final m2.b f15101c;
    public final i d;
    public final long f15102e;
    public final long f15103f;

    public j(long j3, m2.m mVar, m2.b bVar, v2.d dVar, long j10, i iVar) {
        this.f15102e = j3;
        this.f15100b = mVar;
        this.f15101c = bVar;
        this.f15103f = j10;
        this.f15099a = dVar;
        this.d = iVar;
    }

    public final j a(long j3, m2.m mVar) {
        long C;
        long C2;
        i c10 = this.f15100b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j3, mVar, this.f15101c, this.f15099a, this.f15103f, c10);
        } else if (!c10.T()) {
            return new j(j3, mVar, this.f15101c, this.f15099a, this.f15103f, c11);
        } else {
            long c02 = c10.c0(j3);
            if (c02 == 0) {
                return new j(j3, mVar, this.f15101c, this.f15099a, this.f15103f, c11);
            }
            e2.d.h(c11);
            long Y = c10.Y();
            long a2 = c10.a(Y);
            long j10 = c02 + Y;
            long j11 = j10 - 1;
            long i10 = c10.i(j11, j3) + c10.a(j11);
            long Y2 = c11.Y();
            long a10 = c11.a(Y2);
            int i11 = (i10 > a10 ? 1 : (i10 == a10 ? 0 : -1));
            long j12 = this.f15103f;
            if (i11 == 0) {
                C = j10 - Y2;
            } else if (i11 >= 0) {
                if (a10 < a2) {
                    C2 = j12 - (c11.C(a2, j3) - Y);
                    return new j(j3, mVar, this.f15101c, this.f15099a, C2, c11);
                }
                C = c10.C(a10, j3) - Y2;
            } else {
                throw new IOException();
            }
            C2 = C + j12;
            return new j(j3, mVar, this.f15101c, this.f15099a, C2, c11);
        }
    }

    public final long b(long j3) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.n(this.f15102e, j3) + this.f15103f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        i iVar = this.d;
        e2.d.h(iVar);
        return (iVar.d0(this.f15102e, j3) + b10) - 1;
    }

    public final long d() {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.c0(this.f15102e);
    }

    public final long e(long j3) {
        long f7 = f(j3);
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.i(j3 - this.f15103f, this.f15102e) + f7;
    }

    public final long f(long j3) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.a(j3 - this.f15103f);
    }

    public final boolean g(long j3, long j10) {
        i iVar = this.d;
        e2.d.h(iVar);
        if (!iVar.T() && j10 != -9223372036854775807L && e(j3) > j10) {
            return false;
        }
        return true;
    }
}
