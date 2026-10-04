package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f13772a;
    public final String f13774c;
    public final int d;
    public String f13776f;
    public h0 f13777g;
    public int f13778i;
    public int f13779j;
    public long f13780k;
    public b2.s f13781l;
    public int f13782m;
    public int f13783n;
    public int h = 0;
    public long f13786q = -9223372036854775807L;
    public final AtomicInteger f13773b = new AtomicInteger();
    public int f13784o = -1;
    public int f13785p = -1;
    public final String f13775e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f13772a = new e2.v(new byte[i11]);
        this.f13774c = str;
        this.d = i10;
    }

    @Override
    public final void a(e2.v r40) {
        throw new UnsupportedOperationException("Method not decompiled: j4.g.a(e2.v):void");
    }

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f13778i);
        vVar.h(this.f13778i, min, bArr);
        int i11 = this.f13778i + min;
        this.f13778i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        this.h = 0;
        this.f13778i = 0;
        this.f13779j = 0;
        this.f13786q = -9223372036854775807L;
        this.f13773b.set(0);
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13776f = f0Var.f13771e;
        f0Var.b();
        this.f13777g = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13786q = j3;
    }

    public final void g(c3.a aVar) {
        b2.r a2;
        int i10 = aVar.f4001b;
        String str = aVar.f4000a;
        int i11 = aVar.f4002c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f13781l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f3564r)) {
                b2.s sVar2 = this.f13781l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f3492a = this.f13776f;
                a2.f3505p = r0.n(this.f13775e);
                a2.f3506q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f13774c;
                a2.f3496f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f13781l = sVar3;
                this.f13777g.b(sVar3);
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
