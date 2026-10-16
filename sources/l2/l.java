package l2;

import b2.x;
import e2.m0;
import u2.d1;
public final class l implements d1 {
    public final x f14537a;
    public long[] f14539c;
    public boolean d;
    public m2.g e;
    public boolean f14540f;
    public int h;
    public final n3.b f14538b = new n3.b(0);
    public long f14541n = -9223372036854775807L;

    public l(m2.g gVar, x xVar, boolean z10) {
        this.f14537a = xVar;
        this.e = gVar;
        this.f14539c = gVar.f15079b;
        a(gVar, z10);
    }

    public final void a(m2.g gVar, boolean z10) {
        long j10;
        int i10 = this.h;
        long j11 = -9223372036854775807L;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f14539c[i10 - 1];
        }
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.f15079b;
        this.f14539c = jArr;
        long j12 = this.f14541n;
        if (j12 != -9223372036854775807L) {
            int b10 = m0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.f14539c.length) {
                j11 = j12;
            }
            this.f14541n = j11;
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
        if (i11 == this.f14539c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f14540f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] w9 = this.f14538b.w(this.e.f15078a[i11]);
                hVar.b(w9.length);
                hVar.f10330c.put(w9);
            }
            hVar.e = this.f14539c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            bVar.f43098c = this.f14537a;
            this.f14540f = true;
            return -5;
        }
    }

    @Override
    public final int j(long j10) {
        int max = Math.max(this.h, m0.b(this.f14539c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void b() {
    }
}
