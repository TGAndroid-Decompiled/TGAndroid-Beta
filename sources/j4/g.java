package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f12674a;
    public final String f12676c;
    public final int d;
    public String f12677f;
    public h0 f12678g;
    public int f12679i;
    public int f12680j;
    public long f12681k;
    public b2.s f12682l;
    public int f12683m;
    public int f12684n;
    public int h = 0;
    public long f12687q = -9223372036854775807L;
    public final AtomicInteger f12675b = new AtomicInteger();
    public int f12685o = -1;
    public int f12686p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f12674a = new e2.v(new byte[i11]);
        this.f12676c = str;
        this.d = i10;
    }

    @Override
    public final void a(e2.v r40) {
        throw new UnsupportedOperationException("Method not decompiled: j4.g.a(e2.v):void");
    }

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f12679i);
        vVar.h(this.f12679i, min, bArr);
        int i11 = this.f12679i + min;
        this.f12679i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        this.h = 0;
        this.f12679i = 0;
        this.f12680j = 0;
        this.f12687q = -9223372036854775807L;
        this.f12675b.set(0);
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12677f = f0Var.e;
        f0Var.b();
        this.f12678g = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12687q = j3;
    }

    public final void g(c3.a aVar) {
        b2.r a2;
        int i10 = aVar.f3701b;
        String str = aVar.f3700a;
        int i11 = aVar.f3702c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f12682l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f3301r)) {
                b2.s sVar2 = this.f12682l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f3232a = this.f12677f;
                a2.f3244p = r0.n(this.e);
                a2.f3245q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f12676c;
                a2.f3235f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f12682l = sVar3;
                this.f12678g.b(sVar3);
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
