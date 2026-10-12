package c3;

import java.util.Arrays;
public final class j implements b0 {
    public final int f4124a;
    public final int[] f4125b;
    public final long[] f4126c;
    public final long[] d;
    public final long[] f4127e;
    public final long f4128f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4125b = iArr;
        this.f4126c = jArr;
        this.d = jArr2;
        this.f4127e = jArr3;
        int length = iArr.length;
        this.f4124a = length;
        if (length > 0) {
            this.f4128f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4128f = 0L;
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        long[] jArr = this.f4127e;
        int e7 = e2.d0.e(jArr, j3, true);
        long j10 = jArr[e7];
        long[] jArr2 = this.f4126c;
        c0 c0Var = new c0(j10, jArr2[e7]);
        if (j10 < j3 && e7 != this.f4124a - 1) {
            int i10 = e7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f4128f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f4124a + ", sizes=" + Arrays.toString(this.f4125b) + ", offsets=" + Arrays.toString(this.f4126c) + ", timeUs=" + Arrays.toString(this.f4127e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
