package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f13773a;
    public final String f13775c;
    public final int d;
    public String f13777f;
    public h0 f13778g;
    public int f13779i;
    public int f13780j;
    public long f13781k;
    public b2.s f13782l;
    public int f13783m;
    public int f13784n;
    public int h = 0;
    public long f13787q = -9223372036854775807L;
    public final AtomicInteger f13774b = new AtomicInteger();
    public int f13785o = -1;
    public int f13786p = -1;
    public final String f13776e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f13773a = new e2.v(new byte[i11]);
        this.f13775c = str;
        this.d = i10;
    }

    @Override
    public final void a(e2.v r40) {
        throw new UnsupportedOperationException("Method not decompiled: j4.g.a(e2.v):void");
    }

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f13779i);
        vVar.h(this.f13779i, min, bArr);
        int i11 = this.f13779i + min;
        this.f13779i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        this.h = 0;
        this.f13779i = 0;
        this.f13780j = 0;
        this.f13787q = -9223372036854775807L;
        this.f13774b.set(0);
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13777f = f0Var.f13772e;
        f0Var.b();
        this.f13778g = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13787q = j3;
    }

    public final void g(c3.a aVar) {
        b2.r a2;
        int i10 = aVar.f4002b;
        String str = aVar.f4001a;
        int i11 = aVar.f4003c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f13782l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f3564r)) {
                b2.s sVar2 = this.f13782l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f3492a = this.f13777f;
                a2.f3505p = r0.n(this.f13776e);
                a2.f3506q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f13775c;
                a2.f3496f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f13782l = sVar3;
                this.f13778g.b(sVar3);
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
