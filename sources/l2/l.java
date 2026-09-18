package l2;

import b2.s;
import e2.d0;
import n4.y;
import u2.b1;
public final class l implements b1 {
    public final s f14015a;
    public long[] f14017c;
    public boolean d;
    public m2.g e;
    public boolean f14018f;
    public int h;
    public final y f14016b = new y(27);
    public long f14019n = -9223372036854775807L;

    public l(m2.g gVar, s sVar, boolean z10) {
        this.f14015a = sVar;
        this.e = gVar;
        this.f14017c = gVar.f14601b;
        b(gVar, z10);
    }

    public final void b(m2.g gVar, boolean z10) {
        long j3;
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        if (i10 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f14017c[i10 - 1];
        }
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.f14601b;
        this.f14017c = jArr;
        long j11 = this.f14019n;
        if (j11 != -9223372036854775807L) {
            int a2 = d0.a(jArr, j11, true);
            this.h = a2;
            if (this.d && a2 == this.f14017c.length) {
                j10 = j11;
            }
            this.f14019n = j10;
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
        if (i11 == this.f14017c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f14018f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] N = this.f14016b.N(this.e.f14600a[i11]);
                hVar.b(N.length);
                hVar.f10096c.put(N);
            }
            hVar.e = this.f14017c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            yVar.f15180c = this.f14015a;
            this.f14018f = true;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        int max = Math.max(this.h, d0.a(this.f14017c, j3, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void a() {
    }
}
