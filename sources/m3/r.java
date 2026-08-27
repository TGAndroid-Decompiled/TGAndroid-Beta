package m3;

import d5.g0;

public final class r implements t {

    public final long[] f17629a;

    public final long[] f17630b;

    public final long f17631c;
    public final boolean d;

    public r(long j10, long[] jArr, long[] jArr2) {
        d5.a.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f17629a = jArr;
            this.f17630b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f17629a = jArr3;
            long[] jArr4 = new long[i10];
            this.f17630b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f17631c = j10;
    }

    @Override
    public final boolean e() {
        return this.d;
    }

    @Override
    public final s h(long j10) {
        if (!this.d) {
            u uVar = u.f17634c;
            return new s(uVar, uVar);
        }
        long[] jArr = this.f17630b;
        int iE = g0.e(jArr, j10, true);
        long j11 = jArr[iE];
        long[] jArr2 = this.f17629a;
        u uVar2 = new u(j11, jArr2[iE]);
        if (j11 == j10 || iE == jArr.length - 1) {
            return new s(uVar2, uVar2);
        }
        int i10 = iE + 1;
        return new s(uVar2, new u(jArr[i10], jArr2[i10]));
    }

    @Override
    public final long i() {
        return this.f17631c;
    }
}
