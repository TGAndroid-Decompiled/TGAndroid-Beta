package f3;

import a8.ma;
import h2.l0;
public final class y implements b0 {
    public final b3.j f11222a;
    public final b3.j f11223b;
    public long f11224c;

    public y(long j3, long[] jArr, long[] jArr2) {
        boolean z10;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i7 = length + 1;
            b3.j jVar = new b3.j(i7, 6);
            this.f11222a = jVar;
            b3.j jVar2 = new b3.j(i7, 6);
            this.f11223b = jVar2;
            jVar.c(0L);
            jVar2.c(0L);
        } else {
            this.f11222a = new b3.j(length, 6);
            this.f11223b = new b3.j(length, 6);
        }
        this.f11222a.d(jArr);
        this.f11223b.d(jArr2);
        this.f11224c = j3;
    }

    @Override
    public final boolean d() {
        if (this.f11223b.f2872b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j3) {
        b3.j jVar = this.f11223b;
        if (jVar.f2872b == 0) {
            c0 c0Var = c0.f11121c;
            return new a0(c0Var, c0Var);
        }
        int c10 = l0.c(jVar, j3);
        long m10 = jVar.m(c10);
        b3.j jVar2 = this.f11222a;
        c0 c0Var2 = new c0(m10, jVar2.m(c10));
        if (m10 != j3 && c10 != jVar.f2872b - 1) {
            int i7 = c10 + 1;
            return new a0(c0Var2, new c0(jVar.m(i7), jVar2.m(i7)));
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long h() {
        return this.f11224c;
    }
}
