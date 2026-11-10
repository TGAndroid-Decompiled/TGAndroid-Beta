package f3;

import a8.ia;
import h2.m0;
public final class z implements c0 {
    public final f5.u f11107a;
    public final f5.u f11108b;
    public long f11109c;

    public z(long j3, long[] jArr, long[] jArr2) {
        boolean z9;
        if (jArr.length == jArr2.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i7 = length + 1;
            f5.u uVar = new f5.u(i7, 7);
            this.f11107a = uVar;
            f5.u uVar2 = new f5.u(i7, 7);
            this.f11108b = uVar2;
            uVar.c(0L);
            uVar2.c(0L);
        } else {
            this.f11107a = new f5.u(length, 7);
            this.f11108b = new f5.u(length, 7);
        }
        this.f11107a.d(jArr);
        this.f11108b.d(jArr2);
        this.f11109c = j3;
    }

    @Override
    public final boolean d() {
        if (this.f11108b.f11195b > 0) {
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
        f5.u uVar = this.f11108b;
        if (uVar.f11195b == 0) {
            d0 d0Var = d0.f11015c;
            return new b0(d0Var, d0Var);
        }
        int c10 = m0.c(uVar, j3);
        long m10 = uVar.m(c10);
        f5.u uVar2 = this.f11107a;
        d0 d0Var2 = new d0(m10, uVar2.m(c10));
        if (m10 != j3 && c10 != uVar.f11195b - 1) {
            int i7 = c10 + 1;
            return new b0(d0Var2, new d0(uVar.m(i7), uVar2.m(i7)));
        }
        return new b0(d0Var2, d0Var2);
    }

    @Override
    public final long h() {
        return this.f11109c;
    }
}
