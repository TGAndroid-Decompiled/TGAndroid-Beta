package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f13809a;
    public final String f13811c;
    public final int d;
    public String f13813f;
    public h0 f13814g;
    public int f13815i;
    public int f13816j;
    public long f13817k;
    public b2.s f13818l;
    public int f13819m;
    public int f13820n;
    public int h = 0;
    public long f13823q = -9223372036854775807L;
    public final AtomicInteger f13810b = new AtomicInteger();
    public int f13821o = -1;
    public int f13822p = -1;
    public final String f13812e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f13809a = new e2.v(new byte[i11]);
        this.f13811c = str;
        this.d = i10;
    }

    public final boolean a(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f13815i);
        vVar.h(this.f13815i, min, bArr);
        int i11 = this.f13815i + min;
        this.f13815i = i11;
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
        int i10 = aVar.f4051b;
        String str = aVar.f4050a;
        int i11 = aVar.f4052c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f13818l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f3643r)) {
                b2.s sVar2 = this.f13818l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f3571a = this.f13813f;
                a2.f3584p = r0.n(this.f13812e);
                a2.f3585q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f13811c;
                a2.f3575f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f13818l = sVar3;
                this.f13814g.b(sVar3);
            }
        }
    }

    @Override
    public final void d() {
        this.h = 0;
        this.f13815i = 0;
        this.f13816j = 0;
        this.f13823q = -9223372036854775807L;
        this.f13810b.set(0);
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13813f = (String) f0Var.f13808e;
        f0Var.c();
        this.f13814g = qVar.f2(f0Var.f13807c, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13823q = j3;
    }

    @Override
    public final void f(boolean z10) {
    }
}
