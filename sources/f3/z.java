package f3;

import a8.ma;
public final class z implements c0 {
    public final b3.j f11227a;
    public final b3.j f11228b;
    public long f11229c;

    public z(long j3, long[] jArr, long[] jArr2) {
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
            this.f11227a = jVar;
            b3.j jVar2 = new b3.j(i7, 6);
            this.f11228b = jVar2;
            jVar.c(0L);
            jVar2.c(0L);
        } else {
            this.f11227a = new b3.j(length, 6);
            this.f11228b = new b3.j(length, 6);
        }
        this.f11227a.d(jArr);
        this.f11228b.d(jArr2);
        this.f11229c = j3;
    }

    @Override
    public final boolean d() {
        if (this.f11228b.f2873b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final b0 f(long j3) {
        b3.j jVar = this.f11228b;
        if (jVar.f2873b == 0) {
            d0 d0Var = d0.f11135c;
            return new b0(d0Var, d0Var);
        }
        int c10 = h2.l0.c(jVar, j3);
        long m10 = jVar.m(c10);
        b3.j jVar2 = this.f11227a;
        d0 d0Var2 = new d0(m10, jVar2.m(c10));
        if (m10 != j3 && c10 != jVar.f2873b - 1) {
            int i7 = c10 + 1;
            return new b0(d0Var2, new d0(jVar.m(i7), jVar2.m(i7)));
        }
        return new b0(d0Var2, d0Var2);
    }

    @Override
    public final long h() {
        return this.f11229c;
    }
}
