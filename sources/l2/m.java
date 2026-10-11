package l2;

import b2.s;
import e2.d0;
import n4.x;
import u2.a1;
public final class m implements a1 {
    public final s f15406a;
    public long[] f15408c;
    public boolean d;
    public m2.g f15409e;
    public boolean f15410f;
    public int h;
    public final pf.b f15407b = new pf.b(29);
    public long f15411n = -9223372036854775807L;

    public m(m2.g gVar, s sVar, boolean z10) {
        this.f15406a = sVar;
        this.f15409e = gVar;
        this.f15408c = gVar.f15998b;
        b(gVar, z10);
    }

    public final void b(m2.g gVar, boolean z10) {
        long j3;
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        if (i10 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f15408c[i10 - 1];
        }
        this.d = z10;
        this.f15409e = gVar;
        long[] jArr = gVar.f15998b;
        this.f15408c = jArr;
        long j11 = this.f15411n;
        if (j11 != -9223372036854775807L) {
            int a2 = d0.a(jArr, j11, true);
            this.h = a2;
            if (this.d && a2 == this.f15408c.length) {
                j10 = j11;
            }
            this.f15411n = j10;
        } else if (j3 != -9223372036854775807L) {
            this.h = d0.a(jArr, j3, false);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int f(x xVar, h2.h hVar, int i10) {
        boolean z10;
        int i11 = this.h;
        if (i11 == this.f15408c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f15410f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] M = this.f15407b.M(this.f15409e.f15997a[i11]);
                hVar.b(M.length);
                hVar.f10984c.put(M);
            }
            hVar.f10985e = this.f15408c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            xVar.f16695c = this.f15406a;
            this.f15410f = true;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        int max = Math.max(this.h, d0.a(this.f15408c, j3, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void a() {
    }
}
