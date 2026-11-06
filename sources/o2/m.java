package o2;

import e2.u;
import h2.m0;
import m4.d0;
import x2.c1;
public final class m implements c1 {
    public final u f20771a;
    public long[] f20773c;
    public boolean d;
    public p2.g f20774e;
    public boolean f20775f;
    public int h;
    public final d0 f20772b = new d0(20);
    public long f20776n = -9223372036854775807L;

    public m(p2.g gVar, u uVar, boolean z9) {
        this.f20771a = uVar;
        this.f20774e = gVar;
        this.f20773c = gVar.f53032b;
        b(gVar, z9);
    }

    public final void b(p2.g gVar, boolean z9) {
        long j3;
        int i7 = this.h;
        long j10 = -9223372036854775807L;
        if (i7 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f20773c[i7 - 1];
        }
        this.d = z9;
        this.f20774e = gVar;
        long[] jArr = gVar.f53032b;
        this.f20773c = jArr;
        long j11 = this.f20776n;
        if (j11 != -9223372036854775807L) {
            int b10 = m0.b(jArr, j11, true);
            this.h = b10;
            if (this.d && b10 == this.f20773c.length) {
                j10 = j11;
            }
            this.f20776n = j10;
        } else if (j3 != -9223372036854775807L) {
            this.h = m0.b(jArr, j3, false);
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int l(long j3) {
        int max = Math.max(this.h, m0.b(this.f20773c, j3, true));
        int i7 = max - this.h;
        this.h = max;
        return i7;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        boolean z9;
        int i10 = this.h;
        if (i10 == this.f20773c.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i7 & 2) == 0 && this.f20775f) {
            if (z9) {
                return -3;
            }
            if ((i7 & 1) == 0) {
                this.h = i10 + 1;
            }
            if ((i7 & 4) == 0) {
                byte[] B = this.f20772b.B(this.f20774e.f53031a[i10]);
                hVar.b(B.length);
                hVar.f17172c.put(B);
            }
            hVar.f17173e = this.f20773c[i10];
            hVar.setFlags(1);
            return -4;
        } else {
            bVar.f57564c = this.f20771a;
            this.f20775f = true;
            return -5;
        }
    }

    @Override
    public final void a() {
    }
}
