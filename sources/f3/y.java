package f3;

import a8.ja;
import h2.l0;
public final class y implements b0 {
    public final f5.v f10908a;
    public final f5.v f10909b;
    public long f10910c;

    public y(long j3, long[] jArr, long[] jArr2) {
        boolean z10;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i7 = length + 1;
            f5.v vVar = new f5.v(i7, 7);
            this.f10908a = vVar;
            f5.v vVar2 = new f5.v(i7, 7);
            this.f10909b = vVar2;
            vVar.c(0L);
            vVar2.c(0L);
        } else {
            this.f10908a = new f5.v(length, 7);
            this.f10909b = new f5.v(length, 7);
        }
        this.f10908a.d(jArr);
        this.f10909b.d(jArr2);
        this.f10910c = j3;
    }

    @Override
    public final boolean d() {
        if (this.f10909b.f11018b > 0) {
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
        f5.v vVar = this.f10909b;
        if (vVar.f11018b == 0) {
            c0 c0Var = c0.f10807c;
            return new a0(c0Var, c0Var);
        }
        int c10 = l0.c(vVar, j3);
        long m10 = vVar.m(c10);
        f5.v vVar2 = this.f10908a;
        c0 c0Var2 = new c0(m10, vVar2.m(c10));
        if (m10 != j3 && c10 != vVar.f11018b - 1) {
            int i7 = c10 + 1;
            return new a0(c0Var2, new c0(vVar.m(i7), vVar2.m(i7)));
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long h() {
        return this.f10910c;
    }
}
