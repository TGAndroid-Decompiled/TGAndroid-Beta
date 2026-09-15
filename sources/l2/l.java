package l2;

import b2.s;
import e2.d0;
import n4.y;
import u2.b1;
public final class l implements b1 {
    public final s f13858a;
    public long[] f13860c;
    public boolean d;
    public m2.g e;
    public boolean f13861f;
    public int h;
    public final y f13859b = new y(27);
    public long f13862n = -9223372036854775807L;

    public l(m2.g gVar, s sVar, boolean z10) {
        this.f13858a = sVar;
        this.e = gVar;
        this.f13860c = gVar.f14416b;
        b(gVar, z10);
    }

    public final void b(m2.g gVar, boolean z10) {
        long j3;
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        if (i10 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f13860c[i10 - 1];
        }
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.f14416b;
        this.f13860c = jArr;
        long j11 = this.f13862n;
        if (j11 != -9223372036854775807L) {
            int a2 = d0.a(jArr, j11, true);
            this.h = a2;
            if (this.d && a2 == this.f13860c.length) {
                j10 = j11;
            }
            this.f13862n = j10;
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
        if (i11 == this.f13860c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f13861f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] N = this.f13859b.N(this.e.f14415a[i11]);
                hVar.b(N.length);
                hVar.f10092c.put(N);
            }
            hVar.e = this.f13860c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            yVar.f14995c = this.f13858a;
            this.f13861f = true;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        int max = Math.max(this.h, d0.a(this.f13860c, j3, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void a() {
    }
}
