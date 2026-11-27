package defpackage;

import java.io.EOFException;
public final class seb implements x1c {
    public final x1c a;
    public final peb b;
    public reb g;
    public ko4 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = gcc.b;
    public final ey7 c = new ey7();

    public seb(x1c x1cVar, peb pebVar) {
        this.a = x1cVar;
        this.b = pebVar;
    }

    @Override
    public final void a(long r6, int r8, int r9, int r10, defpackage.w1c r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.seb.a(long, int, int, int, w1c):void");
    }

    @Override
    public final void b(ey7 ey7Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(ey7Var, i, i2);
            return;
        }
        h(i);
        ey7Var.k(this.e, i, this.f);
        this.e += i;
    }

    @Override
    public final int c(z63 z63Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.c(z63Var, i, z);
        }
        h(i);
        int read = z63Var.read(this.f, this.e, i);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += read;
        return read;
    }

    @Override
    public final void e(int i, ey7 ey7Var) {
        xnb.b(this, ey7Var, i);
    }

    @Override
    public final int f(z63 z63Var, int i, boolean z) {
        return c(z63Var, i, z);
    }

    @Override
    public final void g(ko4 ko4Var) {
        boolean z;
        reb rebVar;
        ko4Var.t.getClass();
        String str = ko4Var.t;
        if (dg7.h(str) == 3) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        boolean equals = ko4Var.equals(this.h);
        peb pebVar = this.b;
        if (!equals) {
            this.h = ko4Var;
            if (pebVar.j(ko4Var)) {
                rebVar = pebVar.s(ko4Var);
            } else {
                rebVar = null;
            }
            this.g = rebVar;
        }
        reb rebVar2 = this.g;
        x1c x1cVar = this.a;
        if (rebVar2 == null) {
            x1cVar.g(ko4Var);
            return;
        }
        jo4 a = ko4Var.a();
        a.s = dg7.n("application/x-media3-cues");
        a.k = str;
        a.x = Long.MAX_VALUE;
        a.T = pebVar.y(ko4Var);
        xnb.v(a, x1cVar);
    }

    public final void h(int i) {
        byte[] bArr;
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int max = Math.max(i3 << 1, i + i3);
        byte[] bArr2 = this.f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr;
    }

    @Override
    public final void d(long j) {
    }
}
