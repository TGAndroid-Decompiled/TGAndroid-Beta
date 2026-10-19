package c3;

import e2.m0;
import java.util.Arrays;
public final class j implements c0 {
    public final int f4630a;
    public final int[] f4631b;
    public final long[] f4632c;
    public final long[] d;
    public final long[] e;
    public final long f4633f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4631b = iArr;
        this.f4632c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f4630a = length;
        if (length > 0) {
            this.f4633f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4633f = 0L;
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
    public final b0 f(long j10) {
        long[] jArr = this.e;
        int f7 = m0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long[] jArr2 = this.f4632c;
        d0 d0Var = new d0(j11, jArr2[f7]);
        if (j11 < j10 && f7 != this.f4630a - 1) {
            int i10 = f7 + 1;
            return new b0(d0Var, new d0(jArr[i10], jArr2[i10]));
        }
        return new b0(d0Var, d0Var);
    }

    @Override
    public final long h() {
        return this.f4633f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f4630a + ", sizes=" + Arrays.toString(this.f4631b) + ", offsets=" + Arrays.toString(this.f4632c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
