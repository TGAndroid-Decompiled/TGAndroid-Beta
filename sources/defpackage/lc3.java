package defpackage;
public final class lc3 implements lr7 {
    public final kr7 a;
    public final long b;
    public final long c;
    public final ucb d;
    public byte e;
    public long f;
    public long h;
    public long n;
    public long r;
    public long s;
    public long w;
    public long x;

    public lc3(ucb ucbVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        yve.f(z2);
        this.d = ucbVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = (byte) 0;
        } else {
            this.f = j4;
            this.e = (byte) 4;
        }
        this.a = new kr7();
    }

    @Override
    public final zy9 C() {
        if (this.f != 0) {
            return new kc3(this);
        }
        return null;
    }

    @Override
    public final long p(defpackage.cb3 r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc3.p(cb3):long");
    }

    @Override
    public final void p0(long j) {
        this.n = gcc.j(j, 0L, this.f - 1);
        this.e = (byte) 2;
        this.r = this.b;
        this.s = this.c;
        this.w = 0L;
        this.x = this.f;
    }
}
