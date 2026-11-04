package n2;

import java.io.IOException;
public final class j {
    public final x2.e f20176a;
    public final o2.m f20177b;
    public final o2.b f20178c;
    public final i d;
    public final long f20179e;
    public final long f20180f;

    public j(long j10, o2.m mVar, o2.b bVar, x2.e eVar, long j11, i iVar) {
        this.f20179e = j10;
        this.f20177b = mVar;
        this.f20178c = bVar;
        this.f20180f = j11;
        this.f20176a = eVar;
        this.d = iVar;
    }

    public final j a(long j10, o2.m mVar) {
        long s6;
        long s10;
        i c2 = this.f20177b.c();
        i c10 = mVar.c();
        if (c2 == null) {
            return new j(j10, mVar, this.f20178c, this.f20176a, this.f20180f, c2);
        } else if (!c2.A()) {
            return new j(j10, mVar, this.f20178c, this.f20176a, this.f20180f, c10);
        } else {
            long H = c2.H(j10);
            if (H == 0) {
                return new j(j10, mVar, this.f20178c, this.f20176a, this.f20180f, c10);
            }
            c10.getClass();
            long C = c2.C();
            long b10 = c2.b(C);
            long j11 = H + C;
            long j12 = j11 - 1;
            long i3 = c2.i(j12, j10) + c2.b(j12);
            long C2 = c10.C();
            long b11 = c10.b(C2);
            int i10 = (i3 > b11 ? 1 : (i3 == b11 ? 0 : -1));
            long j13 = this.f20180f;
            if (i10 == 0) {
                s6 = j11 - C2;
            } else if (i10 >= 0) {
                if (b11 < b10) {
                    s10 = j13 - (c10.s(b10, j10) - C);
                    return new j(j10, mVar, this.f20178c, this.f20176a, s10, c10);
                }
                s6 = c2.s(b11, j10) - C2;
            } else {
                throw new IOException();
            }
            s10 = s6 + j13;
            return new j(j10, mVar, this.f20178c, this.f20176a, s10, c10);
        }
    }

    public final long b(long j10) {
        i iVar = this.d;
        iVar.getClass();
        long j11 = this.f20179e;
        iVar.getClass();
        return (iVar.K(j11, j10) + (iVar.j(j11, j10) + this.f20180f)) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.H(this.f20179e);
    }

    public final long d(long j10) {
        long e10 = e(j10);
        i iVar = this.d;
        iVar.getClass();
        return iVar.i(j10 - this.f20180f, this.f20179e) + e10;
    }

    public final long e(long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.b(j10 - this.f20180f);
    }

    public final boolean f(long j10, long j11) {
        i iVar = this.d;
        iVar.getClass();
        if (!iVar.A() && j11 != -9223372036854775807L && d(j10) > j11) {
            return false;
        }
        return true;
    }
}
