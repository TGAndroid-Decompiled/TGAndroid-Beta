package defpackage;
public final class ec5 implements gu3 {
    public final uv9 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public wxb j;
    public dc5 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final oh7 d = new oh7(7);
    public final oh7 e = new oh7(8);
    public final oh7 f = new oh7(6);
    public long m = -9223372036854775807L;
    public final xu7 o = new xu7();

    public ec5(uv9 uv9Var, boolean z, boolean z2) {
        this.a = uv9Var;
        this.b = z;
        this.c = z2;
    }

    public final void a(int r26, int r27, long r28, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec5.a(int, int, long, long):void");
    }

    @Override
    public final void b(xu7 xu7Var) {
        int i;
        int i2;
        this.j.getClass();
        String str = g8c.a;
        int i3 = xu7Var.b;
        int i4 = xu7Var.c;
        byte[] bArr = xu7Var.a;
        this.g += xu7Var.a();
        this.j.e(xu7Var.a(), xu7Var);
        while (true) {
            int b = yad.b(bArr, i3, i4, this.h);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec5.c(int, int, byte[]):void");
    }

    @Override
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        yad.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.d.d(0);
        dc5 dc5Var = this.k;
        if (dc5Var != null) {
            dc5Var.k = false;
            dc5Var.o = false;
            cc5 cc5Var = dc5Var.n;
            cc5Var.b = false;
            cc5Var.a = false;
        }
    }

    @Override
    public final void f() {
        this.j.getClass();
        String str = g8c.a;
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
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.i = l2cVar.e;
        l2cVar.b();
        wxb S = l74Var.S(l2cVar.d, 2);
        this.j = S;
        this.k = new dc5(S, this.b, this.c);
        this.a.b(l74Var, l2cVar);
    }

    public final void i(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        dc5 dc5Var = this.k;
        boolean z = this.n;
        dc5Var.i = i;
        dc5Var.l = j2;
        dc5Var.j = j;
        dc5Var.s = z;
        if (!dc5Var.b || i != 1) {
            if (dc5Var.c) {
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        cc5 cc5Var = dc5Var.m;
        dc5Var.m = dc5Var.n;
        dc5Var.n = cc5Var;
        cc5Var.b = false;
        cc5Var.a = false;
        dc5Var.h = 0;
        dc5Var.k = true;
    }

    @Override
    public final void e() {
    }
}
