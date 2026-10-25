package l2;

import b2.x;
import e2.n0;
import n4.s;
import u2.d1;
public final class l implements d1 {
    public final x f16841a;
    public long[] f16843c;
    public boolean d;
    public m2.g e;
    public boolean f16844f;
    public int h;
    public final m4.c f16842b = new m4.c(2);
    public long f16845n = -9223372036854775807L;

    public l(m2.g gVar, x xVar, boolean z10) {
        this.f16841a = xVar;
        this.e = gVar;
        this.f16843c = gVar.f17958b;
        a(gVar, z10);
    }

    public final void a(m2.g gVar, boolean z10) {
        long j10;
        int i10 = this.h;
        long j11 = -9223372036854775807L;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f16843c[i10 - 1];
        }
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.f17958b;
        this.f16843c = jArr;
        long j12 = this.f16845n;
        if (j12 != -9223372036854775807L) {
            int b10 = n0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.f16843c.length) {
                j11 = j12;
            }
            this.f16845n = j11;
        } else if (j10 != -9223372036854775807L) {
            this.h = n0.b(jArr, j10, false);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int f(s sVar, h2.h hVar, int i10) {
        boolean z10;
        int i11 = this.h;
        if (i11 == this.f16843c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f16844f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] B = this.f16842b.B(this.e.f17957a[i11]);
                hVar.b(B.length);
                hVar.f12570c.put(B);
            }
            hVar.e = this.f16843c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            sVar.f18697c = this.f16841a;
            this.f16844f = true;
            return -5;
        }
    }

    @Override
    public final int j(long j10) {
        int max = Math.max(this.h, n0.b(this.f16843c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void d() {
    }
}
