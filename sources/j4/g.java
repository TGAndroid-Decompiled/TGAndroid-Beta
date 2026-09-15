package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f12682a;
    public final String f12684c;
    public final int d;
    public String f12685f;
    public h0 f12686g;
    public int f12687i;
    public int f12688j;
    public long f12689k;
    public b2.s f12690l;
    public int f12691m;
    public int f12692n;
    public int h = 0;
    public long f12695q = -9223372036854775807L;
    public final AtomicInteger f12683b = new AtomicInteger();
    public int f12693o = -1;
    public int f12694p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f12682a = new e2.v(new byte[i11]);
        this.f12684c = str;
        this.d = i10;
    }

    @Override
    public final void a(e2.v r40) {
        throw new UnsupportedOperationException("Method not decompiled: j4.g.a(e2.v):void");
    }

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f12687i);
        vVar.h(this.f12687i, min, bArr);
        int i11 = this.f12687i + min;
        this.f12687i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        this.h = 0;
        this.f12687i = 0;
        this.f12688j = 0;
        this.f12695q = -9223372036854775807L;
        this.f12683b.set(0);
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12685f = f0Var.e;
        f0Var.b();
        this.f12686g = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12695q = j3;
    }

    public final void g(c3.a aVar) {
        b2.r a2;
        int i10 = aVar.f3704b;
        String str = aVar.f3703a;
        int i11 = aVar.f3705c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f12690l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f3304r)) {
                b2.s sVar2 = this.f12690l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f3235a = this.f12685f;
                a2.f3247p = r0.n(this.e);
                a2.f3248q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f12684c;
                a2.f3238f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f12690l = sVar3;
                this.f12686g.b(sVar3);
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
