package a4;

import h5.d0;
import r3.s;
public final class b implements h {
    public final g f47a;
    public final long f48b;
    public final long f49c;
    public final j d;
    public int e;
    public long f50f;
    public long h;
    public long f51n;
    public long f52r;
    public long f53s;
    public long v;
    public long f54w;

    public b(j jVar, long j10, long j11, long j12, long j13, boolean z4) {
        boolean z10;
        if (j10 >= 0 && j11 > j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.f(z10);
        this.d = jVar;
        this.f48b = j10;
        this.f49c = j11;
        if (j12 != j11 - j10 && !z4) {
            this.e = 0;
        } else {
            this.f50f = j13;
            this.e = 4;
        }
        this.f47a = new g();
    }

    @Override
    public final long c(r3.l r28) {
        throw new UnsupportedOperationException("Method not decompiled: a4.b.c(r3.l):long");
    }

    @Override
    public final s l() {
        if (this.f50f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void p(long j10) {
        this.f51n = d0.i(j10, 0L, this.f50f - 1);
        this.e = 2;
        this.f52r = this.f48b;
        this.f53s = this.f49c;
        this.v = 0L;
        this.f54w = this.f50f;
    }
}
