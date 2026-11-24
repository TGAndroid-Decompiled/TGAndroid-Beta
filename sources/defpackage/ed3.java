package defpackage;
public final class ed3 implements oq7 {
    public final nq7 a;
    public final long b;
    public final long c;
    public final yab d;
    public byte e;
    public long f;
    public long h;
    public long n;
    public long r;
    public long s;
    public long w;
    public long x;

    public ed3(yab yabVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        jte.f(z2);
        this.d = yabVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = (byte) 0;
        } else {
            this.f = j4;
            this.e = (byte) 4;
        }
        this.a = new nq7();
    }

    @Override
    public final ix9 D() {
        if (this.f != 0) {
            return new dd3(this);
        }
        return null;
    }

    @Override
    public final long p(defpackage.vb3 r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed3.p(vb3):long");
    }

    @Override
    public final void u0(long j) {
        this.n = hac.j(j, 0L, this.f - 1);
        this.e = (byte) 2;
        this.r = this.b;
        this.s = this.c;
        this.w = 0L;
        this.x = this.f;
    }
}
