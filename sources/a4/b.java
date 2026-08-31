package a4;

import h5.d0;
import r3.s;
public final class b implements h {
    public final g f51a;
    public final long f52b;
    public final long f53c;
    public final j d;
    public int f54e;
    public long f55f;
    public long h;
    public long f56n;
    public long f57r;
    public long f58s;
    public long v;
    public long f59w;

    public b(j jVar, long j10, long j11, long j12, long j13, boolean z4) {
        boolean z10;
        if (j10 >= 0 && j11 > j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.f(z10);
        this.d = jVar;
        this.f52b = j10;
        this.f53c = j11;
        if (j12 != j11 - j10 && !z4) {
            this.f54e = 0;
        } else {
            this.f55f = j13;
            this.f54e = 4;
        }
        this.f51a = new g();
    }

    @Override
    public final long c(r3.l r28) {
        throw new UnsupportedOperationException("Method not decompiled: a4.b.c(r3.l):long");
    }

    @Override
    public final s h() {
        if (this.f55f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void u(long j10) {
        this.f56n = d0.i(j10, 0L, this.f55f - 1);
        this.f54e = 2;
        this.f57r = this.f52b;
        this.f58s = this.f53c;
        this.v = 0L;
        this.f59w = this.f55f;
    }
}
