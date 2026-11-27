package defpackage;

import java.util.ArrayList;
import java.util.List;
public final class meb implements e84 {
    public final reb a;
    public final ko4 b;
    public final ArrayList c;
    public x1c f;
    public g84 g;
    public lp5 h;
    public int i;
    public byte j;
    public long[] k;
    public long l;
    public byte[] e = gcc.b;
    public final ey7 d = new ey7();

    public meb(reb rebVar, ko4 ko4Var) {
        ko4 ko4Var2;
        this.a = rebVar;
        if (ko4Var != null) {
            jo4 a = ko4Var.a();
            a.s = dg7.n("application/x-media3-cues");
            a.k = ko4Var.t;
            a.T = rebVar.s();
            ko4Var2 = new ko4(a);
        } else {
            ko4Var2 = null;
        }
        this.b = ko4Var2;
        this.c = new ArrayList();
        this.j = (byte) 0;
        this.k = gcc.c;
        this.l = -9223372036854775807L;
    }

    @Override
    public final int b(defpackage.f84 r20, defpackage.v11 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.meb.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        return true;
    }

    @Override
    public final void d(long j, long j2) {
        boolean z;
        byte b = this.j;
        byte b2 = 1;
        if (b != 0 && b != 5) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        this.l = j2;
        byte b3 = this.j;
        if (b3 == 2) {
            this.j = (byte) 1;
        } else {
            b2 = b3;
        }
        if (b2 == 4) {
            this.j = (byte) 3;
        }
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        boolean z;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        this.g = g84Var;
        x1c e0 = g84Var.e0(0, 3);
        this.f = e0;
        ko4 ko4Var = this.b;
        if (ko4Var != null) {
            e0.g(ko4Var);
            g84Var.D();
            lp5 lp5Var = new lp5(-9223372036854775807L, new long[]{0}, new long[]{0});
            this.h = lp5Var;
            g84Var.m0(lp5Var);
        }
        this.j = (byte) 1;
    }

    public final void g(leb lebVar) {
        this.f.getClass();
        byte[] bArr = lebVar.b;
        int length = bArr.length;
        int length2 = bArr.length;
        ey7 ey7Var = this.d;
        ey7Var.L(length2, bArr);
        this.f.e(length, ey7Var);
        this.f.a(lebVar.a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.j == 5) {
            return;
        }
        this.a.reset();
        this.j = (byte) 5;
    }

    @Override
    public final e84 a() {
        return this;
    }
}
