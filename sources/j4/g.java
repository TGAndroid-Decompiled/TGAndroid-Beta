package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f13322a;
    public final String f13324c;
    public final int d;
    public String f13326f;
    public h0 f13327g;
    public int f13328i;
    public int f13329j;
    public long f13330k;
    public b2.s f13331l;
    public int f13332m;
    public int f13333n;
    public int h = 0;
    public long f13336q = -9223372036854775807L;
    public final AtomicInteger f13323b = new AtomicInteger();
    public int f13334o = -1;
    public int f13335p = -1;
    public final String f13325e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f13322a = new e2.v(new byte[i11]);
        this.f13324c = str;
        this.d = i10;
    }

    public final boolean a(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f13328i);
        vVar.h(this.f13328i, min, bArr);
        int i11 = this.f13328i + min;
        this.f13328i = i11;
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
        int i10 = aVar.f4223b;
        String str = aVar.f4222a;
        int i11 = aVar.f4224c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f13331l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f2397r)) {
                b2.s sVar2 = this.f13331l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f2325a = this.f13326f;
                a2.f2338p = r0.n(this.f13325e);
                a2.f2339q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f13324c;
                a2.f2329f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f13331l = sVar3;
                this.f13327g.b(sVar3);
            }
        }
    }

    @Override
    public final void d() {
        this.h = 0;
        this.f13328i = 0;
        this.f13329j = 0;
        this.f13336q = -9223372036854775807L;
        this.f13323b.set(0);
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13326f = f0Var.f13321e;
        f0Var.b();
        this.f13327g = qVar.R1(f0Var.d, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13336q = j3;
    }

    @Override
    public final void f(boolean z10) {
    }
}
