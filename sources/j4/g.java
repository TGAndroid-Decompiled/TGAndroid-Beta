package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f13807a;
    public final String f13809c;
    public final int d;
    public String f13811f;
    public h0 f13812g;
    public int f13813i;
    public int f13814j;
    public long f13815k;
    public b2.s f13816l;
    public int f13817m;
    public int f13818n;
    public int h = 0;
    public long f13821q = -9223372036854775807L;
    public final AtomicInteger f13808b = new AtomicInteger();
    public int f13819o = -1;
    public int f13820p = -1;
    public final String f13810e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f13807a = new e2.v(new byte[i11]);
        this.f13809c = str;
        this.d = i10;
    }

    public final boolean a(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f13813i);
        vVar.h(this.f13813i, min, bArr);
        int i11 = this.f13813i + min;
        this.f13813i = i11;
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
        int i10 = aVar.f4050b;
        String str = aVar.f4049a;
        int i11 = aVar.f4051c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f13816l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f3641r)) {
                b2.s sVar2 = this.f13816l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f3569a = this.f13811f;
                a2.f3582p = r0.n(this.f13810e);
                a2.f3583q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f13809c;
                a2.f3573f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f13816l = sVar3;
                this.f13812g.b(sVar3);
            }
        }
    }

    @Override
    public final void d() {
        this.h = 0;
        this.f13813i = 0;
        this.f13814j = 0;
        this.f13821q = -9223372036854775807L;
        this.f13808b.set(0);
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13811f = (String) f0Var.f13806e;
        f0Var.c();
        this.f13812g = qVar.f2(f0Var.f13805c, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13821q = j3;
    }

    @Override
    public final void f(boolean z10) {
    }
}
