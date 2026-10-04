package l2;

import b2.s;
import e2.d0;
import n4.y;
import u2.c1;
public final class m implements c1 {
    public final s f15301a;
    public long[] f15303c;
    public boolean d;
    public m2.g f15304e;
    public boolean f15305f;
    public int h;
    public final y f15302b = new y(27);
    public long f15306n = -9223372036854775807L;

    public m(m2.g gVar, s sVar, boolean z10) {
        this.f15301a = sVar;
        this.f15304e = gVar;
        this.f15303c = gVar.f15997b;
        b(gVar, z10);
    }

    public final void b(m2.g gVar, boolean z10) {
        long j3;
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        if (i10 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f15303c[i10 - 1];
        }
        this.d = z10;
        this.f15304e = gVar;
        long[] jArr = gVar.f15997b;
        this.f15303c = jArr;
        long j11 = this.f15306n;
        if (j11 != -9223372036854775807L) {
            int a2 = d0.a(jArr, j11, true);
            this.h = a2;
            if (this.d && a2 == this.f15303c.length) {
                j10 = j11;
            }
            this.f15306n = j10;
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
        if (i11 == this.f15303c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f15305f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] P = this.f15302b.P(this.f15304e.f15996a[i11]);
                hVar.b(P.length);
                hVar.f10979c.put(P);
            }
            hVar.f10980e = this.f15303c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            yVar.f16640c = this.f15301a;
            this.f15305f = true;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        int max = Math.max(this.h, d0.a(this.f15303c, j3, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void a() {
    }
}
