package defpackage;
public final class ce5 implements rv3 {
    public final xx9 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public yzb j;
    public be5 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final rj7 d = new rj7(7);
    public final rj7 e = new rj7(8);
    public final rj7 f = new rj7(6);
    public long m = -9223372036854775807L;
    public final yw7 o = new yw7();

    public ce5(xx9 xx9Var, boolean z, boolean z2) {
        this.a = xx9Var;
        this.b = z;
        this.c = z2;
    }

    public final void a(int r26, int r27, long r28, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce5.a(int, int, long, long):void");
    }

    @Override
    public final void b(yw7 yw7Var) {
        int i;
        int i2;
        this.j.getClass();
        String str = hac.a;
        int i3 = yw7Var.b;
        int i4 = yw7Var.c;
        byte[] bArr = yw7Var.a;
        this.g += yw7Var.a();
        this.j.e(yw7Var.a(), yw7Var);
        while (true) {
            int b = add.b(bArr, i3, i4, this.h);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce5.c(int, int, byte[]):void");
    }

    @Override
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        add.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.d.d(0);
        be5 be5Var = this.k;
        if (be5Var != null) {
            be5Var.k = false;
            be5Var.o = false;
            ae5 ae5Var = be5Var.n;
            ae5Var.b = false;
            ae5Var.a = false;
        }
    }

    @Override
    public final void f() {
        this.j.getClass();
        String str = hac.a;
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
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.i = l4cVar.e;
        l4cVar.b();
        yzb c0 = u84Var.c0(l4cVar.d, 2);
        this.j = c0;
        this.k = new be5(c0, this.b, this.c);
        this.a.b(u84Var, l4cVar);
    }

    public final void i(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        be5 be5Var = this.k;
        boolean z = this.n;
        be5Var.i = i;
        be5Var.l = j2;
        be5Var.j = j;
        be5Var.s = z;
        if (!be5Var.b || i != 1) {
            if (be5Var.c) {
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        ae5 ae5Var = be5Var.m;
        be5Var.m = be5Var.n;
        be5Var.n = ae5Var;
        ae5Var.b = false;
        ae5Var.a = false;
        be5Var.h = 0;
        be5Var.k = true;
    }

    @Override
    public final void e() {
    }
}
