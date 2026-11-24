package defpackage;
public final class w54 implements jr9 {
    public final go4 a;
    public long[] c;
    public boolean d;
    public x54 e;
    public boolean f;
    public int h;
    public final hi2 b = new hi2((byte) 27);
    public long n = -9223372036854775807L;

    public w54(x54 x54Var, go4 go4Var, boolean z) {
        this.a = go4Var;
        this.e = x54Var;
        this.c = x54Var.b;
        b(x54Var, z);
    }

    @Override
    public final int a() {
        return 0;
    }

    public final void b(x54 x54Var, boolean z) {
        long j;
        int i = this.h;
        long j2 = -9223372036854775807L;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.c[i - 1];
        }
        this.d = z;
        this.e = x54Var;
        long[] jArr = x54Var.b;
        this.c = jArr;
        long j3 = this.n;
        if (j3 != -9223372036854775807L) {
            int b = hac.b(jArr, j3, true);
            this.h = b;
            if (this.d && b == this.c.length) {
                j2 = j3;
            }
            this.n = j2;
        } else if (j != -9223372036854775807L) {
            this.h = hac.b(jArr, j, false);
        }
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final int m(long j) {
        int max = Math.max(this.h, hac.b(this.c, j, true));
        int i = max - this.h;
        this.h = max;
        return i;
    }

    @Override
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        boolean z;
        int i2 = this.h;
        if (i2 == this.c.length) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.d) {
            la3Var.setFlags(4);
            return -4;
        } else if ((i & 2) == 0 && this.f) {
            if (z) {
                return -3;
            }
            if ((i & 1) == 0) {
                this.h = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] u = this.b.u(this.e.a[i2]);
                la3Var.c(u.length);
                la3Var.c.put(u);
            }
            la3Var.e = this.c[i2];
            la3Var.setFlags(1);
            return -4;
        } else {
            mj4Var.c = this.a;
            this.f = true;
            return -5;
        }
    }

    @Override
    public final void d() {
    }
}
