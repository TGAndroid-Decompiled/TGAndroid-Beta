package e3;

import b8.zb;
import g2.n0;
public final class y implements b0 {
    public final e5.u f9537a;
    public final e5.u f9538b;
    public long f9539c;

    public y(long j10, long[] jArr, long[] jArr2) {
        boolean z10;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i3 = length + 1;
            e5.u uVar = new e5.u(i3, 7);
            this.f9537a = uVar;
            e5.u uVar2 = new e5.u(i3, 7);
            this.f9538b = uVar2;
            uVar.c(0L);
            uVar2.c(0L);
        } else {
            this.f9537a = new e5.u(length, 7);
            this.f9538b = new e5.u(length, 7);
        }
        this.f9537a.d(jArr);
        this.f9538b.d(jArr2);
        this.f9539c = j10;
    }

    @Override
    public final boolean d() {
        if (this.f9538b.f9633b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j10) {
        e5.u uVar = this.f9538b;
        if (uVar.f9633b == 0) {
            c0 c0Var = c0.f9436c;
            return new a0(c0Var, c0Var);
        }
        int c2 = n0.c(uVar, j10);
        long j11 = uVar.j(c2);
        e5.u uVar2 = this.f9537a;
        c0 c0Var2 = new c0(j11, uVar2.j(c2));
        if (j11 != j10 && c2 != uVar.f9633b - 1) {
            int i3 = c2 + 1;
            return new a0(c0Var2, new c0(uVar.j(i3), uVar2.j(i3)));
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long h() {
        return this.f9539c;
    }
}
