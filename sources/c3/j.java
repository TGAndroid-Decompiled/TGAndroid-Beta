package c3;

import java.util.Arrays;
public final class j implements b0 {
    public final int f4125a;
    public final int[] f4126b;
    public final long[] f4127c;
    public final long[] d;
    public final long[] f4128e;
    public final long f4129f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4126b = iArr;
        this.f4127c = jArr;
        this.d = jArr2;
        this.f4128e = jArr3;
        int length = iArr.length;
        this.f4125a = length;
        if (length > 0) {
            this.f4129f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4129f = 0L;
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        long[] jArr = this.f4128e;
        int e7 = e2.d0.e(jArr, j3, true);
        long j10 = jArr[e7];
        long[] jArr2 = this.f4127c;
        c0 c0Var = new c0(j10, jArr2[e7]);
        if (j10 < j3 && e7 != this.f4125a - 1) {
            int i10 = e7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f4129f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f4125a + ", sizes=" + Arrays.toString(this.f4126b) + ", offsets=" + Arrays.toString(this.f4127c) + ", timeUs=" + Arrays.toString(this.f4128e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
