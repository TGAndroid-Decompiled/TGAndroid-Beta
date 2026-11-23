package o2;

import java.io.IOException;
public final class j {
    public final y2.e f21636a;
    public final p2.m f21637b;
    public final p2.b f21638c;
    public final i d;
    public final long f21639e;
    public final long f21640f;

    public j(long j3, p2.m mVar, p2.b bVar, y2.e eVar, long j10, i iVar) {
        this.f21639e = j3;
        this.f21637b = mVar;
        this.f21638c = bVar;
        this.f21640f = j10;
        this.f21636a = eVar;
        this.d = iVar;
    }

    public final j a(long j3, p2.m mVar) {
        long o4;
        long o10;
        i c10 = this.f21637b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j3, mVar, this.f21638c, this.f21636a, this.f21640f, c10);
        } else if (!c10.t()) {
            return new j(j3, mVar, this.f21638c, this.f21636a, this.f21640f, c11);
        } else {
            long y10 = c10.y(j3);
            if (y10 == 0) {
                return new j(j3, mVar, this.f21638c, this.f21636a, this.f21640f, c11);
            }
            c11.getClass();
            long v = c10.v();
            long a10 = c10.a(v);
            long j10 = y10 + v;
            long j11 = j10 - 1;
            long e10 = c10.e(j11, j3) + c10.a(j11);
            long v10 = c11.v();
            long a11 = c11.a(v10);
            int i7 = (e10 > a11 ? 1 : (e10 == a11 ? 0 : -1));
            long j12 = this.f21640f;
            if (i7 == 0) {
                o4 = j10 - v10;
            } else if (i7 >= 0) {
                if (a11 < a10) {
                    o10 = j12 - (c11.o(a10, j3) - v);
                    return new j(j3, mVar, this.f21638c, this.f21636a, o10, c11);
                }
                o4 = c10.o(a11, j3) - v10;
            } else {
                throw new IOException();
            }
            o10 = o4 + j12;
            return new j(j3, mVar, this.f21638c, this.f21636a, o10, c11);
        }
    }

    public final long b(long j3) {
        i iVar = this.d;
        iVar.getClass();
        long j10 = this.f21639e;
        iVar.getClass();
        return (iVar.z(j10, j3) + (iVar.h(j10, j3) + this.f21640f)) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.y(this.f21639e);
    }

    public final long d(long j3) {
        long e10 = e(j3);
        i iVar = this.d;
        iVar.getClass();
        return iVar.e(j3 - this.f21640f, this.f21639e) + e10;
    }

    public final long e(long j3) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.a(j3 - this.f21640f);
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
