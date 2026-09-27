package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f12677a;
    public final String f12679c;
    public final int d;
    public String f12680f;
    public h0 f12681g;
    public int f12682i;
    public int f12683j;
    public long f12684k;
    public b2.s f12685l;
    public int f12686m;
    public int f12687n;
    public int h = 0;
    public long f12690q = -9223372036854775807L;
    public final AtomicInteger f12678b = new AtomicInteger();
    public int f12688o = -1;
    public int f12689p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f12677a = new e2.v(new byte[i11]);
        this.f12679c = str;
        this.d = i10;
    }

    @Override
    public final void a(e2.v r40) {
        throw new UnsupportedOperationException("Method not decompiled: j4.g.a(e2.v):void");
    }

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f12682i);
        vVar.h(this.f12682i, min, bArr);
        int i11 = this.f12682i + min;
        this.f12682i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        this.h = 0;
        this.f12682i = 0;
        this.f12683j = 0;
        this.f12690q = -9223372036854775807L;
        this.f12678b.set(0);
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12680f = f0Var.e;
        f0Var.b();
        this.f12681g = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12690q = j3;
    }

    public final void g(c3.a aVar) {
        b2.r a2;
        int i10 = aVar.f3703b;
        String str = aVar.f3702a;
        int i11 = aVar.f3704c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f12685l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f3303r)) {
                b2.s sVar2 = this.f12685l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f3234a = this.f12680f;
                a2.f3246p = r0.n(this.e);
                a2.f3247q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f12679c;
                a2.f3237f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f12685l = sVar3;
                this.f12681g.b(sVar3);
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
