package defpackage;
public final class l44 implements ip9 {
    public final fm4 a;
    public long[] c;
    public boolean d;
    public m44 e;
    public boolean f;
    public int h;
    public final lv6 b = new lv6((byte) 25);
    public long n = -9223372036854775807L;

    public l44(m44 m44Var, fm4 fm4Var, boolean z) {
        this.a = fm4Var;
        this.e = m44Var;
        this.c = m44Var.b;
        c(m44Var, z);
    }

    @Override
    public final int a() {
        return 0;
    }

    public final void c(m44 m44Var, boolean z) {
        long j;
        int i = this.h;
        long j2 = -9223372036854775807L;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.c[i - 1];
        }
        this.d = z;
        this.e = m44Var;
        long[] jArr = m44Var.b;
        this.c = jArr;
        long j3 = this.n;
        if (j3 != -9223372036854775807L) {
            int b = g8c.b(jArr, j3, true);
            this.h = b;
            if (this.d && b == this.c.length) {
                j2 = j3;
            }
            this.n = j2;
        } else if (j != -9223372036854775807L) {
            this.h = g8c.b(jArr, j, false);
        }
    }

    @Override
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        boolean z;
        int i2 = this.h;
        if (i2 == this.c.length) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.d) {
            z83Var.setFlags(4);
            return -4;
        } else if ((i & 2) == 0 && this.f) {
            if (z) {
                return -3;
            }
            if ((i & 1) == 0) {
                this.h = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] r = this.b.r(this.e.a[i2]);
                z83Var.c(r.length);
                z83Var.c.put(r);
            }
            z83Var.e = this.c[i2];
            z83Var.setFlags(1);
            return -4;
        } else {
            sk4Var.c = this.a;
            this.f = true;
            return -5;
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final int n(long j) {
        int max = Math.max(this.h, g8c.b(this.c, j, true));
        int i = max - this.h;
        this.h = max;
        return i;
    }

    @Override
    public final void b() {
    }
}
