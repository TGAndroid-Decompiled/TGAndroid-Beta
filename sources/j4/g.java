package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f13296a;
    public final String f13298c;
    public final int d;
    public String f13300f;
    public h0 f13301g;
    public int f13302i;
    public int f13303j;
    public long f13304k;
    public b2.s f13305l;
    public int f13306m;
    public int f13307n;
    public int h = 0;
    public long f13310q = -9223372036854775807L;
    public final AtomicInteger f13297b = new AtomicInteger();
    public int f13308o = -1;
    public int f13309p = -1;
    public final String f13299e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f13296a = new e2.v(new byte[i11]);
        this.f13298c = str;
        this.d = i10;
    }

    public final boolean a(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f13302i);
        vVar.h(this.f13302i, min, bArr);
        int i11 = this.f13302i + min;
        this.f13302i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(e2.v r40) {
        throw new UnsupportedOperationException("Method not decompiled: j4.g.b(e2.v):void");
    }

    public final void c(c3.a aVar) {
        b2.r a2;
        int i10 = aVar.f4196b;
        String str = aVar.f4195a;
        int i11 = aVar.f4197c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f13305l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f2370r)) {
                b2.s sVar2 = this.f13305l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f2298a = this.f13300f;
                a2.f2311p = r0.n(this.f13299e);
                a2.f2312q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f13298c;
                a2.f2302f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f13305l = sVar3;
                this.f13301g.b(sVar3);
            }
        }
    }

    @Override
    public final void d() {
        this.h = 0;
        this.f13302i = 0;
        this.f13303j = 0;
        this.f13310q = -9223372036854775807L;
        this.f13297b.set(0);
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13300f = f0Var.f13295e;
        f0Var.b();
        this.f13301g = qVar.R1(f0Var.d, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13310q = j3;
    }

    @Override
    public final void f(boolean z10) {
    }
}
