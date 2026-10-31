package l2;

import b2.x;
import e2.l0;
import u2.d1;
public final class m implements d1 {
    public final x f11621a;
    public long[] f11623c;
    public boolean d;
    public m2.g e;
    public boolean f11624f;
    public int h;
    public final m5.e f11622b = new m5.e(2);
    public long f11625n = -9223372036854775807L;

    public m(m2.g gVar, x xVar, boolean z10) {
        this.f11621a = xVar;
        this.e = gVar;
        this.f11623c = gVar.f12653b;
        b(gVar, z10);
    }

    public final void b(m2.g gVar, boolean z10) {
        long j10;
        int i10 = this.h;
        long j11 = -9223372036854775807L;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f11623c[i10 - 1];
        }
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.f12653b;
        this.f11623c = jArr;
        long j12 = this.f11625n;
        if (j12 != -9223372036854775807L) {
            int b10 = l0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.f11623c.length) {
                j11 = j12;
            }
            this.f11625n = j11;
        } else if (j10 != -9223372036854775807L) {
            this.h = l0.b(jArr, j10, false);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int i(long j10) {
        int max = Math.max(this.h, l0.b(this.f11623c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        boolean z10;
        int i11 = this.h;
        if (i11 == this.f11623c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f11624f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] G = this.f11622b.G(this.e.f12652a[i11]);
                hVar.c(G.length);
                hVar.f7586c.put(G);
            }
            hVar.e = this.f11623c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            bVar.f7658c = this.f11621a;
            this.f11624f = true;
            return -5;
        }
    }

    @Override
    public final void a() {
    }
}
