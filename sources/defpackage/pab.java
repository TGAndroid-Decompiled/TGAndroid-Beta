package defpackage;

import java.util.ArrayList;
import java.util.List;
public final class pab implements j74 {
    public final uab a;
    public final fm4 b;
    public final ArrayList c;
    public wxb f;
    public l74 g;
    public in5 h;
    public int i;
    public byte j;
    public long[] k;
    public long l;
    public byte[] e = g8c.b;
    public final xu7 d = new xu7();

    public pab(uab uabVar, fm4 fm4Var) {
        fm4 fm4Var2;
        this.a = uabVar;
        if (fm4Var != null) {
            em4 a = fm4Var.a();
            a.s = ud7.n("application/x-media3-cues");
            a.k = fm4Var.t;
            a.T = uabVar.o();
            fm4Var2 = new fm4(a);
        } else {
            fm4Var2 = null;
        }
        this.b = fm4Var2;
        this.c = new ArrayList();
        this.j = (byte) 0;
        this.k = g8c.c;
        this.l = -9223372036854775807L;
    }

    @Override
    public final int b(defpackage.k74 r20, defpackage.m11 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pab.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
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
        gre.p(z);
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
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        boolean z;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        this.g = l74Var;
        wxb T = l74Var.T(0, 3);
        this.f = T;
        fm4 fm4Var = this.b;
        if (fm4Var != null) {
            T.g(fm4Var);
            l74Var.B();
            in5 in5Var = new in5(-9223372036854775807L, new long[]{0}, new long[]{0});
            this.h = in5Var;
            l74Var.f0(in5Var);
        }
        this.j = (byte) 1;
    }

    public final void g(oab oabVar) {
        this.f.getClass();
        byte[] bArr = oabVar.b;
        int length = bArr.length;
        int length2 = bArr.length;
        xu7 xu7Var = this.d;
        xu7Var.L(length2, bArr);
        this.f.e(length, xu7Var);
        this.f.a(oabVar.a, 1, length, 0, null);
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
    public final j74 a() {
        return this;
    }
}
