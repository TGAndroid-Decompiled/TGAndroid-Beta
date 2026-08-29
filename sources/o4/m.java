package o4;

import f5.d0;
import j3.t0;
import j3.u0;
import l4.c1;
public final class m implements c1 {
    public final t0 f19193a;
    public long[] f19195c;
    public boolean d;
    public p4.g f19196e;
    public boolean f19197f;
    public int h;
    public final ze.b f19194b = new ze.b(19, false);
    public long f19198n = -9223372036854775807L;

    public m(p4.g gVar, t0 t0Var, boolean z10) {
        this.f19193a = t0Var;
        this.f19196e = gVar;
        this.f19195c = gVar.f45564b;
        b(gVar, z10);
    }

    public final void b(p4.g gVar, boolean z10) {
        long j10;
        int i10 = this.h;
        long j11 = -9223372036854775807L;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f19195c[i10 - 1];
        }
        this.d = z10;
        this.f19196e = gVar;
        long[] jArr = gVar.f45564b;
        this.f19195c = jArr;
        long j12 = this.f19198n;
        if (j12 != -9223372036854775807L) {
            int b10 = d0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.f19195c.length) {
                j11 = j12;
            }
            this.f19198n = j11;
        } else if (j10 != -9223372036854775807L) {
            this.h = d0.b(jArr, j10, false);
        }
    }

    @Override
    public final int d(u0 u0Var, m3.i iVar, int i10) {
        boolean z10;
        int i11 = this.h;
        if (i11 == this.f19195c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            iVar.setFlags(4);
            return -4;
        } else if ((i10 & 2) == 0 && this.f19197f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.h = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] E = this.f19194b.E(this.f19196e.f45563a[i11]);
                iVar.b(E.length);
                iVar.f16828b.put(E);
            }
            iVar.d = this.f19195c[i11];
            iVar.setFlags(1);
            return -4;
        } else {
            u0Var.f10815b = this.f19193a;
            this.f19197f = true;
            return -5;
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int i(long j10) {
        int max = Math.max(this.h, d0.b(this.f19195c, j10, true));
        int i10 = max - this.h;
        this.h = max;
        return i10;
    }

    @Override
    public final void a() {
    }
}
