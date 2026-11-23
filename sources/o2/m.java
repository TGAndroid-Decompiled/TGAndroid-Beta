package o2;

import e2.u;
import h2.l0;
import x2.d1;
public final class m implements d1 {
    public final u f21752a;
    public long[] f21754c;
    public boolean d;
    public p2.g f21755e;
    public boolean f21756f;
    public int h;
    public final jb.m f21753b = new jb.m(25);
    public long f21757n = -9223372036854775807L;

    public m(p2.g gVar, u uVar, boolean z10) {
        this.f21752a = uVar;
        this.f21755e = gVar;
        this.f21754c = gVar.f55236b;
        c(gVar, z10);
    }

    @Override
    public final int b(jb.m mVar, k2.h hVar, int i7) {
        boolean z10;
        int i10 = this.h;
        if (i10 == this.f21754c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i7 & 2) == 0 && this.f21756f) {
            if (z10) {
                return -3;
            }
            if ((i7 & 1) == 0) {
                this.h = i10 + 1;
            }
            if ((i7 & 4) == 0) {
                byte[] g02 = this.f21753b.g0(this.f21755e.f55235a[i10]);
                hVar.b(g02.length);
                hVar.f18223c.put(g02);
            }
            hVar.f18224e = this.f21754c[i10];
            hVar.setFlags(1);
            return -4;
        } else {
            mVar.f17465c = this.f21752a;
            this.f21756f = true;
            return -5;
        }
    }

    public final void c(p2.g gVar, boolean z10) {
        long j3;
        int i7 = this.h;
        long j10 = -9223372036854775807L;
        if (i7 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f21754c[i7 - 1];
        }
        this.d = z10;
        this.f21755e = gVar;
        long[] jArr = gVar.f55236b;
        this.f21754c = jArr;
        long j11 = this.f21757n;
        if (j11 != -9223372036854775807L) {
            int b10 = l0.b(jArr, j11, true);
            this.h = b10;
            if (this.d && b10 == this.f21754c.length) {
                j10 = j11;
            }
            this.f21757n = j10;
        } else if (j3 != -9223372036854775807L) {
            this.h = l0.b(jArr, j3, false);
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final int o(long j3) {
        int max = Math.max(this.h, l0.b(this.f21754c, j3, true));
        int i7 = max - this.h;
        this.h = max;
        return i7;
    }

    @Override
    public final void a() {
    }
}
