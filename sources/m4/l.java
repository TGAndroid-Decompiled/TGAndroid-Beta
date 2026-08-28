package m4;

import d5.f0;
import h3.t0;
import h3.u0;
import j4.b1;
public final class l implements b1 {
    public final t0 f17332a;
    public long[] f17334c;
    public boolean d;
    public n4.g f17335e;
    public boolean f17336f;
    public int h;
    public final we.b f17333b = new we.b(6, (byte) 0);
    public long f17337n = -9223372036854775807L;

    public l(n4.g gVar, t0 t0Var, boolean z10) {
        this.f17332a = t0Var;
        this.f17335e = gVar;
        this.f17334c = gVar.f18415b;
        b(gVar, z10);
    }

    public final void b(n4.g gVar, boolean z10) {
        long j10;
        int i9 = this.h;
        long j11 = -9223372036854775807L;
        if (i9 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f17334c[i9 - 1];
        }
        this.d = z10;
        this.f17335e = gVar;
        long[] jArr = gVar.f18415b;
        this.f17334c = jArr;
        long j12 = this.f17337n;
        if (j12 != -9223372036854775807L) {
            int b10 = f0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.f17334c.length) {
                j11 = j12;
            }
            this.f17337n = j11;
        } else if (j10 != -9223372036854775807L) {
            this.h = f0.b(jArr, j10, false);
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int j(long j10) {
        int max = Math.max(this.h, f0.b(this.f17334c, j10, true));
        int i9 = max - this.h;
        this.h = max;
        return i9;
    }

    @Override
    public final int l(u0 u0Var, k3.i iVar, int i9) {
        boolean z10;
        int i10 = this.h;
        if (i10 == this.f17334c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            iVar.setFlags(4);
            return -4;
        } else if ((i9 & 2) == 0 && this.f17336f) {
            if (z10) {
                return -3;
            }
            if ((i9 & 1) == 0) {
                this.h = i10 + 1;
            }
            if ((i9 & 4) == 0) {
                byte[] A = this.f17333b.A(this.f17335e.f18414a[i10]);
                iVar.c(A.length);
                iVar.f14608b.put(A);
            }
            iVar.d = this.f17334c[i10];
            iVar.setFlags(1);
            return -4;
        } else {
            u0Var.f9778b = this.f17332a;
            this.f17336f = true;
            return -5;
        }
    }

    @Override
    public final void a() {
    }
}
