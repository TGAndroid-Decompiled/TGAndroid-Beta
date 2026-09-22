package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f12684a;
    public final String f12686c;
    public final int d;
    public String f12687f;
    public h0 f12688g;
    public int f12689i;
    public int f12690j;
    public long f12691k;
    public b2.s f12692l;
    public int f12693m;
    public int f12694n;
    public int h = 0;
    public long f12697q = -9223372036854775807L;
    public final AtomicInteger f12685b = new AtomicInteger();
    public int f12695o = -1;
    public int f12696p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f12684a = new e2.v(new byte[i11]);
        this.f12686c = str;
        this.d = i10;
    }

    @Override
    public final void a(e2.v r40) {
        throw new UnsupportedOperationException("Method not decompiled: j4.g.a(e2.v):void");
    }

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f12689i);
        vVar.h(this.f12689i, min, bArr);
        int i11 = this.f12689i + min;
        this.f12689i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        this.h = 0;
        this.f12689i = 0;
        this.f12690j = 0;
        this.f12697q = -9223372036854775807L;
        this.f12685b.set(0);
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12687f = f0Var.e;
        f0Var.b();
        this.f12688g = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12697q = j3;
    }

    public final void g(c3.a aVar) {
        b2.r a2;
        int i10 = aVar.f3706b;
        String str = aVar.f3705a;
        int i11 = aVar.f3707c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f12692l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f3306r)) {
                b2.s sVar2 = this.f12692l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f3237a = this.f12687f;
                a2.f3249p = r0.n(this.e);
                a2.f3250q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f12686c;
                a2.f3240f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f12692l = sVar3;
                this.f12688g.b(sVar3);
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
