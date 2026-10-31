package c3;

import java.util.Arrays;
public final class j implements b0 {
    public final int f3657a;
    public final int[] f3658b;
    public final long[] f3659c;
    public final long[] d;
    public final long[] e;
    public final long f3660f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f3658b = iArr;
        this.f3659c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f3657a = length;
        if (length > 0) {
            this.f3660f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f3660f = 0L;
        }
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j10) {
        long[] jArr = this.e;
        int f7 = e2.l0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long[] jArr2 = this.f3659c;
        c0 c0Var = new c0(j11, jArr2[f7]);
        if (j11 < j10 && f7 != this.f3657a - 1) {
            int i10 = f7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f3660f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f3657a + ", sizes=" + Arrays.toString(this.f3658b) + ", offsets=" + Arrays.toString(this.f3659c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
