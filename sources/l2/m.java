package l2;

import b2.w;
import e2.m0;
import u2.f1;
public final class m implements f1 {
    public final w f15940a;
    public long[] f15942c;
    public boolean d;
    public m2.g e;
    public boolean f15943f;
    public int h;
    public final n2.e f15941b = new n2.e(1);
    public long f15944n = -9223372036854775807L;

    public m(m2.g gVar, w wVar, boolean z10) {
        this.f15940a = wVar;
        this.e = gVar;
        this.f15942c = gVar.f16501b;
        b(gVar, z10);
    }

    public final void b(m2.g gVar, boolean z10) {
        long j10;
        int i10 = this.h;
        long j11 = -9223372036854775807L;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f15942c[i10 - 1];
        }
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.f16501b;
        this.f15942c = jArr;
        long j12 = this.f15944n;
        if (j12 != -9223372036854775807L) {
            int b10 = m0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.f15942c.length) {
                j11 = j12;
            }
            this.f15944n = j11;
        } else if (j10 != -9223372036854775807L) {
            this.h = m0.b(jArr, j10, false);
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        boolean z10;
        int i11 = this.h;
        if (i11 == this.f15942c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f15943f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] u10 = this.f15941b.u(this.e.f16500a[i11]);
                hVar.b(u10.length);
                hVar.f11661c.put(u10);
            }
            hVar.e = this.f15942c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            bVar.f44864c = this.f15940a;
            this.f15943f = true;
            return -5;
        }
    }

    @Override
    public final int m(long j10) {
        int max = Math.max(this.h, m0.b(this.f15942c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void a() {
    }
}
