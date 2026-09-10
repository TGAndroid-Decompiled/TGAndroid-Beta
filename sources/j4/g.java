package j4;

import b2.r0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f11578a;
    public final String f11580c;
    public final int d;
    public String f11581f;
    public c3.h0 f11582g;
    public int f11583i;
    public int f11584j;
    public long f11585k;
    public b2.s f11586l;
    public int f11587m;
    public int f11588n;
    public int h = 0;
    public long f11591q = -9223372036854775807L;
    public final AtomicInteger f11579b = new AtomicInteger();
    public int f11589o = -1;
    public int f11590p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f11578a = new e2.v(new byte[i11]);
        this.f11580c = str;
        this.d = i10;
    }

    @Override
    public final void a(e2.v r40) {
        throw new UnsupportedOperationException("Method not decompiled: j4.g.a(e2.v):void");
    }

    @Override
    public final void b() {
        this.h = 0;
        this.f11583i = 0;
        this.f11584j = 0;
        this.f11591q = -9223372036854775807L;
        this.f11579b.set(0);
    }

    @Override
    public final void c(c3.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f11581f = g0Var.e;
        g0Var.b();
        this.f11582g = qVar.I(g0Var.d, 1);
    }

    @Override
    public final void e(int i10, long j3) {
        this.f11591q = j3;
    }

    public final boolean f(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f11583i);
        vVar.h(this.f11583i, min, bArr);
        int i11 = this.f11583i + min;
        this.f11583i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public final void g(c3.a aVar) {
        b2.r a2;
        int i10 = aVar.f4123b;
        String str = aVar.f4122a;
        int i11 = aVar.f4124c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f11586l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f2002r)) {
                b2.s sVar2 = this.f11586l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f1933a = this.f11581f;
                a2.f1945p = r0.n(this.e);
                a2.f1946q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f11580c;
                a2.f1936f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f11586l = sVar3;
                this.f11582g.b(sVar3);
            }
        }
    }

    @Override
    public final void d(boolean z10) {
    }
}
