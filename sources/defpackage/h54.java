package defpackage;
public final class h54 implements at9 {
    public final ko4 a;
    public long[] c;
    public boolean d;
    public i54 e;
    public boolean f;
    public int h;
    public final qx6 b = new qx6((byte) 25);
    public long n = -9223372036854775807L;

    public h54(i54 i54Var, ko4 ko4Var, boolean z) {
        this.a = ko4Var;
        this.e = i54Var;
        this.c = i54Var.b;
        b(i54Var, z);
    }

    @Override
    public final int a() {
        return 0;
    }

    public final void b(i54 i54Var, boolean z) {
        long j;
        int i = this.h;
        long j2 = -9223372036854775807L;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.c[i - 1];
        }
        this.d = z;
        this.e = i54Var;
        long[] jArr = i54Var.b;
        this.c = jArr;
        long j3 = this.n;
        if (j3 != -9223372036854775807L) {
            int b = gcc.b(jArr, j3, true);
            this.h = b;
            if (this.d && b == this.c.length) {
                j2 = j3;
            }
            this.n = j2;
        } else if (j != -9223372036854775807L) {
            this.h = gcc.b(jArr, j, false);
        }
    }

    @Override
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        boolean z;
        int i2 = this.h;
        if (i2 == this.c.length) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.d) {
            s93Var.setFlags(4);
            return -4;
        } else if ((i & 2) == 0 && this.f) {
            if (z) {
                return -3;
            }
            if ((i & 1) == 0) {
                this.h = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] t = this.b.t(this.e.a[i2]);
                s93Var.c(t.length);
                s93Var.c.put(t);
            }
            s93Var.e = this.c[i2];
            s93Var.setFlags(1);
            return -4;
        } else {
            ym4Var.c = this.a;
            this.f = true;
            return -5;
        }
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final int o(long j) {
        int max = Math.max(this.h, gcc.b(this.c, j, true));
        int i = max - this.h;
        this.h = max;
        return i;
    }

    @Override
    public final void g() {
    }
}
