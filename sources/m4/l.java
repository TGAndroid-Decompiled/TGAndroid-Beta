package m4;

import d5.g0;
import h3.t0;
import h3.u0;
import j4.b1;

public final class l implements b1 {

    public final t0 f17708a;

    public long[] f17710c;
    public boolean d;

    public n4.g f17711e;

    public boolean f17712f;
    public int h;

    public final xe.b f17709b = new xe.b(7, (byte) 0);

    public long f17713n = -9223372036854775807L;

    public l(n4.g gVar, t0 t0Var, boolean z10) {
        this.f17708a = t0Var;
        this.f17711e = gVar;
        this.f17710c = gVar.f18242b;
        b(gVar, z10);
    }

    public final void b(n4.g gVar, boolean z10) {
        int i10 = this.h;
        long j10 = -9223372036854775807L;
        long j11 = i10 == 0 ? -9223372036854775807L : this.f17710c[i10 - 1];
        this.d = z10;
        this.f17711e = gVar;
        long[] jArr = gVar.f18242b;
        this.f17710c = jArr;
        long j12 = this.f17713n;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.h = g0.b(jArr, j11, false);
            }
        } else {
            int iB = g0.b(jArr, j12, true);
            this.h = iB;
            if (this.d && iB == this.f17710c.length) {
                j10 = j12;
            }
            this.f17713n = j10;
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int f(long j10) {
        int iMax = Math.max(this.h, g0.b(this.f17710c, j10, true));
        int i10 = iMax - this.h;
        this.h = iMax;
        return i10;
    }

    @Override
    public final int i(u0 u0Var, k3.i iVar, int i10) {
        int i11 = this.h;
        boolean z10 = i11 == this.f17710c.length;
        if (z10 && !this.d) {
            iVar.setFlags(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f17712f) {
            u0Var.f8207b = this.f17708a;
            this.f17712f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.h = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrA = this.f17709b.A(this.f17711e.f18241a[i11]);
            iVar.b(bArrA.length);
            iVar.f14429b.put(bArrA);
        }
        iVar.d = this.f17710c[i11];
        iVar.setFlags(1);
        return -4;
    }

    @Override
    public final void a() {
    }
}
