package m3;

import d5.f0;
public final class r implements t {
    public final long[] f17253a;
    public final long[] f17254b;
    public final long f17255c;
    public final boolean d;

    public r(long j10, long[] jArr, long[] jArr2) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.d = z11;
        if (z11 && jArr2[0] > 0) {
            int i9 = length + 1;
            long[] jArr3 = new long[i9];
            this.f17253a = jArr3;
            long[] jArr4 = new long[i9];
            this.f17254b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f17253a = jArr;
            this.f17254b = jArr2;
        }
        this.f17255c = j10;
    }

    @Override
    public final boolean e() {
        return this.d;
    }

    @Override
    public final s h(long j10) {
        if (!this.d) {
            u uVar = u.f17258c;
            return new s(uVar, uVar);
        }
        long[] jArr = this.f17254b;
        int e10 = f0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long[] jArr2 = this.f17253a;
        u uVar2 = new u(j11, jArr2[e10]);
        if (j11 != j10 && e10 != jArr.length - 1) {
            int i9 = e10 + 1;
            return new s(uVar2, new u(jArr[i9], jArr2[i9]));
        }
        return new s(uVar2, uVar2);
    }

    @Override
    public final long i() {
        return this.f17255c;
    }
}
