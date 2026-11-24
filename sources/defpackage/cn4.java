package defpackage;

import java.util.List;
public final class cn4 implements s84 {
    public final yw7 a = new yw7(4);
    public final yw7 b = new yw7(9);
    public final yw7 c = new yw7(11);
    public final yw7 d = new yw7();
    public final ws9 e;
    public u84 f;
    public byte g;
    public boolean h;
    public long i;
    public int j;
    public short k;
    public int l;
    public long m;
    public boolean n;
    public z40 o;
    public kec p;

    public cn4() {
        ?? x23Var = new x23(new ip3());
        x23Var.b = -9223372036854775807L;
        x23Var.c = new long[0];
        x23Var.d = new long[0];
        this.e = x23Var;
        this.g = (byte) 1;
    }

    @Override
    public final int b(defpackage.t84 r34, defpackage.u21 r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn4.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        yw7 yw7Var = this.a;
        vb3 vb3Var = (vb3) t84Var;
        vb3Var.d(yw7Var.a, 0, 3, false);
        yw7Var.N(0);
        if (yw7Var.D() == 4607062) {
            vb3Var.d(yw7Var.a, 0, 2, false);
            yw7Var.N(0);
            if ((yw7Var.H() & 250) == 0) {
                vb3Var.d(yw7Var.a, 0, 4, false);
                yw7Var.N(0);
                int m = yw7Var.m();
                vb3Var.f = 0;
                vb3Var.a(m, false);
                vb3Var.d(yw7Var.a, 0, 4, false);
                yw7Var.N(0);
                if (yw7Var.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = (byte) 1;
            this.h = false;
        } else {
            this.g = (byte) 3;
        }
        this.j = 0;
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.f = u84Var;
    }

    public final yw7 g(vb3 vb3Var) {
        int i = this.l;
        yw7 yw7Var = this.d;
        byte[] bArr = yw7Var.a;
        if (i > bArr.length) {
            yw7Var.L(0, new byte[Math.max(bArr.length << 1, i)]);
        } else {
            yw7Var.N(0);
        }
        yw7Var.M(this.l);
        vb3Var.c(yw7Var.a, 0, this.l, false);
        return yw7Var;
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
