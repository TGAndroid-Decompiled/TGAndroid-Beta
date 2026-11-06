package a4;

import a8.ia;
import f3.c0;
import h2.m0;
public final class b implements h {
    public final g f148a;
    public final long f149b;
    public final long f150c;
    public final j d;
    public int f151e;
    public long f152f;
    public long h;
    public long f153n;
    public long f154r;
    public long f155s;
    public long f156w;
    public long f157x;

    public b(j jVar, long j3, long j10, long j11, long j12, boolean z9) {
        boolean z10;
        if (j3 >= 0 && j10 > j3) {
            z10 = true;
        } else {
            z10 = false;
        }
        ia.f(z10);
        this.d = jVar;
        this.f149b = j3;
        this.f150c = j10;
        if (j11 != j10 - j3 && !z9) {
            this.f151e = 0;
        } else {
            this.f152f = j12;
            this.f151e = 4;
        }
        this.f148a = new g();
    }

    @Override
    public final c0 M() {
        if (this.f152f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final long r0(f3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: a4.b.r0(f3.p):long");
    }

    @Override
    public final void v0(long j3) {
        this.f153n = m0.j(j3, 0L, this.f152f - 1);
        this.f151e = 2;
        this.f154r = this.f149b;
        this.f155s = this.f150c;
        this.f156w = 0L;
        this.f157x = this.f152f;
    }
}
