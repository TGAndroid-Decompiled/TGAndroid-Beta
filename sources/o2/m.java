package o2;

import e2.u;
import h2.l0;
import x2.d1;
public final class m implements d1 {
    public final u f21684a;
    public long[] f21686c;
    public boolean d;
    public p2.g f21687e;
    public boolean f21688f;
    public int h;
    public final k8.a f21685b = new k8.a(24);
    public long f21689n = -9223372036854775807L;

    public m(p2.g gVar, u uVar, boolean z10) {
        this.f21684a = uVar;
        this.f21687e = gVar;
        this.f21686c = gVar.f55151b;
        b(gVar, z10);
    }

    public final void b(p2.g gVar, boolean z10) {
        long j3;
        int i7 = this.h;
        long j10 = -9223372036854775807L;
        if (i7 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f21686c[i7 - 1];
        }
        this.d = z10;
        this.f21687e = gVar;
        long[] jArr = gVar.f55151b;
        this.f21686c = jArr;
        long j11 = this.f21689n;
        if (j11 != -9223372036854775807L) {
            int b10 = l0.b(jArr, j11, true);
            this.h = b10;
            if (this.d && b10 == this.f21686c.length) {
                j10 = j11;
            }
            this.f21689n = j10;
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
        int max = Math.max(this.h, l0.b(this.f21686c, j3, true));
        int i7 = max - this.h;
        this.h = max;
        return i7;
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        boolean z10;
        int i10 = this.h;
        if (i10 == this.f21686c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i7 & 2) == 0 && this.f21688f) {
            if (z10) {
                return -3;
            }
            if ((i7 & 1) == 0) {
                this.h = i10 + 1;
            }
            if ((i7 & 4) == 0) {
                byte[] v02 = this.f21685b.v0(this.f21687e.f55150a[i10]);
                hVar.b(v02.length);
                hVar.f18155c.put(v02);
            }
            hVar.f18156e = this.f21686c[i10];
            hVar.setFlags(1);
            return -4;
        } else {
            aVar.f18212c = this.f21684a;
            this.f21688f = true;
            return -5;
        }
    }

    @Override
    public final void a() {
    }
}
