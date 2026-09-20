package l2;

import b2.s;
import e2.d0;
import n4.y;
import u2.c1;
public final class l implements c1 {
    public final s f14054a;
    public long[] f14056c;
    public boolean d;
    public m2.g e;
    public boolean f14057f;
    public int h;
    public final m5.e f14055b = new m5.e(1, (byte) 0);
    public long f14058n = -9223372036854775807L;

    public l(m2.g gVar, s sVar, boolean z10) {
        this.f14054a = sVar;
        this.e = gVar;
        this.f14056c = gVar.f14637b;
        b(gVar, z10);
    }

    public final void b(m2.g gVar, boolean z10) {
        long j3;
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        if (i10 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f14056c[i10 - 1];
        }
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.f14637b;
        this.f14056c = jArr;
        long j11 = this.f14058n;
        if (j11 != -9223372036854775807L) {
            int a2 = d0.a(jArr, j11, true);
            this.h = a2;
            if (this.d && a2 == this.f14056c.length) {
                j10 = j11;
            }
            this.f14058n = j10;
        } else if (j3 != -9223372036854775807L) {
            this.h = d0.a(jArr, j3, false);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        boolean z10;
        int i11 = this.h;
        if (i11 == this.f14056c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f14057f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] v = this.f14055b.v(this.e.f14636a[i11]);
                hVar.b(v.length);
                hVar.f10097c.put(v);
            }
            hVar.e = this.f14056c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            yVar.f15218b = this.f14054a;
            this.f14057f = true;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        int max = Math.max(this.h, d0.a(this.f14056c, j3, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void a() {
    }
}
