package defpackage;
public final class sb3 implements lo7 {
    public final ko7 a;
    public final long b;
    public final long c;
    public final w8b d;
    public byte e;
    public long f;
    public long h;
    public long n;
    public long r;
    public long s;
    public long w;
    public long x;

    public sb3(w8b w8bVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        gre.f(z2);
        this.d = w8bVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = (byte) 0;
        } else {
            this.f = j4;
            this.e = (byte) 4;
        }
        this.a = new ko7();
    }

    @Override
    public final long h(defpackage.ja3 r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb3.h(ja3):long");
    }

    @Override
    public final void j0(long j) {
        this.n = g8c.j(j, 0L, this.f - 1);
        this.e = (byte) 2;
        this.r = this.b;
        this.s = this.c;
        this.w = 0L;
        this.x = this.f;
    }

    @Override
    public final fv9 k() {
        if (this.f != 0) {
            return new rb3(this);
        }
        return null;
    }
}
