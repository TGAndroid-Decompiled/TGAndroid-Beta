package c3;

import e2.m0;
import java.util.Arrays;
public final class j implements b0 {
    public final int f4256a;
    public final int[] f4257b;
    public final long[] f4258c;
    public final long[] d;
    public final long[] e;
    public final long f4259f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4257b = iArr;
        this.f4258c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f4256a = length;
        if (length > 0) {
            this.f4259f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4259f = 0L;
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
        int f7 = m0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long[] jArr2 = this.f4258c;
        c0 c0Var = new c0(j11, jArr2[f7]);
        if (j11 < j10 && f7 != this.f4256a - 1) {
            int i10 = f7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f4259f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f4256a + ", sizes=" + Arrays.toString(this.f4257b) + ", offsets=" + Arrays.toString(this.f4258c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
