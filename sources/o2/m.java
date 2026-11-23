package o2;

import e2.u;
import h2.l0;
import x2.d1;
public final class m implements d1 {
    public final u f21687a;
    public long[] f21689c;
    public boolean d;
    public p2.g f21690e;
    public boolean f21691f;
    public int h;
    public final k8.a f21688b = new k8.a(24);
    public long f21692n = -9223372036854775807L;

    public m(p2.g gVar, u uVar, boolean z10) {
        this.f21687a = uVar;
        this.f21690e = gVar;
        this.f21689c = gVar.f55155b;
        b(gVar, z10);
    }

    public final void b(p2.g gVar, boolean z10) {
        long j3;
        int i7 = this.h;
        long j10 = -9223372036854775807L;
        if (i7 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f21689c[i7 - 1];
        }
        this.d = z10;
        this.f21690e = gVar;
        long[] jArr = gVar.f55155b;
        this.f21689c = jArr;
        long j11 = this.f21692n;
        if (j11 != -9223372036854775807L) {
            int b10 = l0.b(jArr, j11, true);
            this.h = b10;
            if (this.d && b10 == this.f21689c.length) {
                j10 = j11;
            }
            this.f21692n = j10;
        } else if (j3 != -9223372036854775807L) {
            this.h = l0.b(jArr, j3, false);
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final int j(long j3) {
        int max = Math.max(this.h, l0.b(this.f21689c, j3, true));
        int i7 = max - this.h;
        this.h = max;
        return i7;
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        boolean z10;
        int i10 = this.h;
        if (i10 == this.f21689c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i7 & 2) == 0 && this.f21691f) {
            if (z10) {
                return -3;
            }
            if ((i7 & 1) == 0) {
                this.h = i10 + 1;
            }
            if ((i7 & 4) == 0) {
                byte[] v02 = this.f21688b.v0(this.f21690e.f55154a[i10]);
                hVar.b(v02.length);
                hVar.f18158c.put(v02);
            }
            hVar.f18159e = this.f21689c[i10];
            hVar.setFlags(1);
            return -4;
        } else {
            aVar.f18215c = this.f21687a;
            this.f21691f = true;
            return -5;
        }
    }

    @Override
    public final void a() {
    }
}
