package l2;

import b2.s;
import e2.d0;
import n4.y;
import u2.b1;
public final class l implements b1 {
    public final s f15266a;
    public long[] f15268c;
    public boolean d;
    public m2.g f15269e;
    public boolean f15270f;
    public int h;
    public final y f15267b = new y(27);
    public long f15271n = -9223372036854775807L;

    public l(m2.g gVar, s sVar, boolean z10) {
        this.f15266a = sVar;
        this.f15269e = gVar;
        this.f15268c = gVar.f15809b;
        a(gVar, z10);
    }

    public final void a(m2.g gVar, boolean z10) {
        long j3;
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        if (i10 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f15268c[i10 - 1];
        }
        this.d = z10;
        this.f15269e = gVar;
        long[] jArr = gVar.f15809b;
        this.f15268c = jArr;
        long j11 = this.f15271n;
        if (j11 != -9223372036854775807L) {
            int a2 = d0.a(jArr, j11, true);
            this.h = a2;
            if (this.d && a2 == this.f15268c.length) {
                j10 = j11;
            }
            this.f15271n = j10;
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
        if (i11 == this.f15268c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f15270f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] E = this.f15267b.E(this.f15269e.f15808a[i11]);
                hVar.b(E.length);
                hVar.f10876c.put(E);
            }
            hVar.f10877e = this.f15268c[i11];
            hVar.setFlags(1);
            return -4;
        } else {
            yVar.f16524c = this.f15266a;
            this.f15270f = true;
            return -5;
        }
    }

    @Override
    public final int m(long j3) {
        int max = Math.max(this.h, d0.a(this.f15268c, j3, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void b() {
    }
}
