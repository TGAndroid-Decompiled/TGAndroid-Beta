package c3;

import java.util.Arrays;
public final class j implements b0 {
    public final int f4297a;
    public final int[] f4298b;
    public final long[] f4299c;
    public final long[] d;
    public final long[] f4300e;
    public final long f4301f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4298b = iArr;
        this.f4299c = jArr;
        this.d = jArr2;
        this.f4300e = jArr3;
        int length = iArr.length;
        this.f4297a = length;
        if (length > 0) {
            this.f4301f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4301f = 0L;
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        long[] jArr = this.f4300e;
        int e7 = e2.d0.e(jArr, j3, true);
        long j10 = jArr[e7];
        long[] jArr2 = this.f4299c;
        c0 c0Var = new c0(j10, jArr2[e7]);
        if (j10 < j3 && e7 != this.f4297a - 1) {
            int i10 = e7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f4301f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f4297a + ", sizes=" + Arrays.toString(this.f4298b) + ", offsets=" + Arrays.toString(this.f4299c) + ", timeUs=" + Arrays.toString(this.f4300e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
