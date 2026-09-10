package l2;

import b2.s;
import e2.d0;
import u2.d1;
public final class n implements d1 {
    public final s f12754a;
    public long[] f12756c;
    public boolean d;
    public m2.g e;
    public boolean f12757f;
    public int h;
    public final of.b f12755b = new of.b(26);
    public long f12758n = -9223372036854775807L;

    public n(m2.g gVar, s sVar, boolean z10) {
        this.f12754a = sVar;
        this.e = gVar;
        this.f12756c = gVar.f13254b;
        b(gVar, z10);
    }

    public final void b(m2.g gVar, boolean z10) {
        long j3;
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        if (i10 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f12756c[i10 - 1];
        }
        this.d = z10;
        this.e = gVar;
        long[] jArr = gVar.f13254b;
        this.f12756c = jArr;
        long j11 = this.f12758n;
        if (j11 != -9223372036854775807L) {
            int a2 = d0.a(jArr, j11, true);
            this.h = a2;
            if (this.d && a2 == this.f12756c.length) {
                j10 = j11;
            }
            this.f12758n = j10;
        } else if (j3 != -9223372036854775807L) {
            this.h = d0.a(jArr, j3, false);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int g(long j3) {
        int max = Math.max(this.h, d0.a(this.f12756c, j3, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final int t(of.b bVar, h2.h hVar, int i10) {
        boolean z10;
        int i11 = this.h;
        if (i11 == this.f12756c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f12757f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] b02 = this.f12755b.b0(this.e.f13253a[i11]);
                hVar.b(b02.length);
                hVar.f9210c.put(b02);
            }
            hVar.e = this.f12756c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            bVar.f14295c = this.f12754a;
            this.f12757f = true;
            return -5;
        }
    }

    @Override
    public final void a() {
    }
}
