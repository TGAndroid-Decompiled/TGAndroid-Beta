package j4;

import b2.r0;
import c3.h0;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.v f12685a;
    public final String f12687c;
    public final int d;
    public String f12688f;
    public h0 f12689g;
    public int f12690i;
    public int f12691j;
    public long f12692k;
    public b2.s f12693l;
    public int f12694m;
    public int f12695n;
    public int h = 0;
    public long f12698q = -9223372036854775807L;
    public final AtomicInteger f12686b = new AtomicInteger();
    public int f12696o = -1;
    public int f12697p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f12685a = new e2.v(new byte[i11]);
        this.f12687c = str;
        this.d = i10;
    }

    @Override
    public final void a(e2.v r40) {
        throw new UnsupportedOperationException("Method not decompiled: j4.g.a(e2.v):void");
    }

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f12690i);
        vVar.h(this.f12690i, min, bArr);
        int i11 = this.f12690i + min;
        this.f12690i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        this.h = 0;
        this.f12690i = 0;
        this.f12691j = 0;
        this.f12698q = -9223372036854775807L;
        this.f12686b.set(0);
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12688f = f0Var.e;
        f0Var.b();
        this.f12689g = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12698q = j3;
    }

    public final void g(c3.a aVar) {
        b2.r a2;
        int i10 = aVar.f3709b;
        String str = aVar.f3708a;
        int i11 = aVar.f3710c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.s sVar = this.f12693l;
            if (sVar == null || i11 != sVar.J || i10 != sVar.K || !str.equals(sVar.f3309r)) {
                b2.s sVar2 = this.f12693l;
                if (sVar2 == null) {
                    a2 = new b2.r();
                } else {
                    a2 = sVar2.a();
                }
                a2.f3240a = this.f12688f;
                a2.f3252p = r0.n(this.e);
                a2.f3253q = r0.n(str);
                a2.I = i11;
                a2.J = i10;
                a2.d = this.f12687c;
                a2.f3243f = this.d;
                b2.s sVar3 = new b2.s(a2);
                this.f12693l = sVar3;
                this.f12689g.b(sVar3);
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
