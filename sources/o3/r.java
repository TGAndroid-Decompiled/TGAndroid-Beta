package o3;

import f5.d0;
public final class r implements t {
    public final long[] f19112a;
    public final long[] f19113b;
    public final long f19114c;
    public final boolean d;

    public r(long j10, long[] jArr, long[] jArr2) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.d = z11;
        if (z11 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f19112a = jArr3;
            long[] jArr4 = new long[i10];
            this.f19113b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f19112a = jArr;
            this.f19113b = jArr2;
        }
        this.f19114c = j10;
    }

    @Override
    public final boolean c() {
        return this.d;
    }

    @Override
    public final s g(long j10) {
        if (!this.d) {
            u uVar = u.f19117c;
            return new s(uVar, uVar);
        }
        long[] jArr = this.f19113b;
        int e10 = d0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long[] jArr2 = this.f19112a;
        u uVar2 = new u(j11, jArr2[e10]);
        if (j11 != j10 && e10 != jArr.length - 1) {
            int i10 = e10 + 1;
            return new s(uVar2, new u(jArr[i10], jArr2[i10]));
        }
        return new s(uVar2, uVar2);
    }

    @Override
    public final long h() {
        return this.f19114c;
    }
}
