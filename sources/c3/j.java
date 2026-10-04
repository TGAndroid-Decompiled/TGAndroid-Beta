package c3;

import java.util.Arrays;
public final class j implements b0 {
    public final int f4076a;
    public final int[] f4077b;
    public final long[] f4078c;
    public final long[] d;
    public final long[] f4079e;
    public final long f4080f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4077b = iArr;
        this.f4078c = jArr;
        this.d = jArr2;
        this.f4079e = jArr3;
        int length = iArr.length;
        this.f4076a = length;
        if (length > 0) {
            this.f4080f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4080f = 0L;
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        long[] jArr = this.f4079e;
        int e7 = e2.d0.e(jArr, j3, true);
        long j10 = jArr[e7];
        long[] jArr2 = this.f4078c;
        c0 c0Var = new c0(j10, jArr2[e7]);
        if (j10 < j3 && e7 != this.f4076a - 1) {
            int i10 = e7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f4080f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f4076a + ", sizes=" + Arrays.toString(this.f4077b) + ", offsets=" + Arrays.toString(this.f4078c) + ", timeUs=" + Arrays.toString(this.f4079e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
