package l2;

import b2.s;
import e2.d0;
import n4.y;
import u2.b1;
public final class l implements b1 {
    public final s f15240a;
    public long[] f15242c;
    public boolean d;
    public m2.g f15243e;
    public boolean f15244f;
    public int h;
    public final y f15241b = new y(27);
    public long f15245n = -9223372036854775807L;

    public l(m2.g gVar, s sVar, boolean z10) {
        this.f15240a = sVar;
        this.f15243e = gVar;
        this.f15242c = gVar.f15782b;
        a(gVar, z10);
    }

    public final void a(m2.g gVar, boolean z10) {
        long j3;
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        if (i10 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f15242c[i10 - 1];
        }
        this.d = z10;
        this.f15243e = gVar;
        long[] jArr = gVar.f15782b;
        this.f15242c = jArr;
        long j11 = this.f15245n;
        if (j11 != -9223372036854775807L) {
            int a2 = d0.a(jArr, j11, true);
            this.h = a2;
            if (this.d && a2 == this.f15242c.length) {
                j10 = j11;
            }
            this.f15245n = j10;
        } else if (j3 != -9223372036854775807L) {
            this.h = d0.a(jArr, j3, false);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int f(y yVar, h2.g gVar, int i10) {
        boolean z10;
        int i11 = this.h;
        if (i11 == this.f15242c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            gVar.f6773b = 4;
            return -4;
        } else if ((i10 & 2) == 0 && this.f15244f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] E = this.f15241b.E(this.f15243e.f15781a[i11]);
                gVar.l(E.length);
                gVar.f10847e.put(E);
            }
            gVar.h = this.f15242c[i11];
            gVar.f6773b = 1;
            return -4;
        } else {
            yVar.f16497c = this.f15240a;
            this.f15244f = true;
            return -5;
        }
    }

    @Override
    public final int m(long j3) {
        int max = Math.max(this.h, d0.a(this.f15242c, j3, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void b() {
    }
}
