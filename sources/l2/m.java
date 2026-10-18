package l2;

import b2.w;
import e2.m0;
import u2.c1;
public final class m implements c1 {
    public final w f15878a;
    public long[] f15880c;
    public boolean d;
    public m2.g e;
    public boolean f15881f;
    public int h;
    public final n2.e f15879b = new n2.e(1);
    public long f15882n = -9223372036854775807L;

    public m(m2.g gVar, w wVar, boolean z10) {
        this.f15878a = wVar;
        this.e = gVar;
        this.f15880c = gVar.f16439b;
        b(gVar, z10);
    }

    public final void b(m2.g gVar, boolean z10) {
        long j10;
        int i10 = this.h;
        long j11 = -9223372036854775807L;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f15880c[i10 - 1];
        }
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.f16439b;
        this.f15880c = jArr;
        long j12 = this.f15882n;
        if (j12 != -9223372036854775807L) {
            int b10 = m0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.f15880c.length) {
                j11 = j12;
            }
            this.f15882n = j11;
        } else if (j10 != -9223372036854775807L) {
            this.h = m0.b(jArr, j10, false);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        boolean z10;
        int i11 = this.h;
        if (i11 == this.f15880c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f15881f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] x10 = this.f15879b.x(this.e.f16438a[i11]);
                hVar.b(x10.length);
                hVar.f11637c.put(x10);
            }
            hVar.e = this.f15880c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            bVar.f44486c = this.f15878a;
            this.f15881f = true;
            return -5;
        }
    }

    @Override
    public final int h(long j10) {
        int max = Math.max(this.h, m0.b(this.f15880c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void a() {
    }
}
