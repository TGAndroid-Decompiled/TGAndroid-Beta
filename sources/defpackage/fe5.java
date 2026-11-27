package defpackage;
public final class fe5 implements av3 {
    public final oz9 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public x1c j;
    public ee5 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final yj7 d = new yj7(7);
    public final yj7 e = new yj7(8);
    public final yj7 f = new yj7(6);
    public long m = -9223372036854775807L;
    public final ey7 o = new ey7();

    public fe5(oz9 oz9Var, boolean z, boolean z2) {
        this.a = oz9Var;
        this.b = z;
        this.c = z2;
    }

    public final void a(int r26, int r27, long r28, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe5.a(int, int, long, long):void");
    }

    @Override
    public final void b(ey7 ey7Var) {
        int i;
        int i2;
        this.j.getClass();
        String str = gcc.a;
        int i3 = ey7Var.b;
        int i4 = ey7Var.c;
        byte[] bArr = ey7Var.a;
        this.g += ey7Var.a();
        this.j.e(ey7Var.a(), ey7Var);
        while (true) {
            int b = rfd.b(bArr, i3, i4, this.h);
            if (b == i4) {
                c(i3, i4, bArr);
                return;
            }
            int i5 = bArr[b + 3] & 31;
            if (b > 0 && bArr[b - 1] == 0) {
                b--;
                i = 4;
            } else {
                i = 3;
            }
            int i6 = b;
            int i7 = i;
            int i8 = i6 - i3;
            if (i8 > 0) {
                c(i3, i6, bArr);
            }
            int i9 = i4 - i6;
            long j = this.g - i9;
            if (i8 < 0) {
                i2 = -i8;
            } else {
                i2 = 0;
            }
            a(i9, i2, j, this.m);
            i(j, i5, this.m);
            i3 = i6 + i7;
        }
    }

    public final void c(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe5.c(int, int, byte[]):void");
    }

    @Override
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        rfd.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.d.d(0);
        ee5 ee5Var = this.k;
        if (ee5Var != null) {
            ee5Var.k = false;
            ee5Var.o = false;
            de5 de5Var = ee5Var.n;
            de5Var.b = false;
            de5Var.a = false;
        }
    }

    @Override
    public final void f() {
        this.j.getClass();
        String str = gcc.a;
        this.a.d.d(0);
        a(0, 0, this.g, this.m);
        i(this.g, 9, this.m);
        a(0, 0, this.g, this.m);
    }

    @Override
    public final void g(int i, long j) {
        boolean z;
        this.m = j;
        boolean z2 = this.n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.n = z2 | z;
    }

    @Override
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.i = l6cVar.e;
        l6cVar.b();
        x1c e0 = g84Var.e0(l6cVar.d, 2);
        this.j = e0;
        this.k = new ee5(e0, this.b, this.c);
        this.a.b(g84Var, l6cVar);
    }

    public final void i(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        ee5 ee5Var = this.k;
        boolean z = this.n;
        ee5Var.i = i;
        ee5Var.l = j2;
        ee5Var.j = j;
        ee5Var.s = z;
        if (!ee5Var.b || i != 1) {
            if (ee5Var.c) {
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        de5 de5Var = ee5Var.m;
        ee5Var.m = ee5Var.n;
        ee5Var.n = de5Var;
        de5Var.b = false;
        de5Var.a = false;
        ee5Var.h = 0;
        ee5Var.k = true;
    }

    @Override
    public final void e() {
    }
}
