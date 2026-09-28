package c3;

import java.util.Arrays;
public final class j implements b0 {
    public final int f3768a;
    public final int[] f3769b;
    public final long[] f3770c;
    public final long[] d;
    public final long[] e;
    public final long f3771f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f3769b = iArr;
        this.f3770c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f3768a = length;
        if (length > 0) {
            this.f3771f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f3771f = 0L;
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        long[] jArr = this.e;
        int e = e2.d0.e(jArr, j3, true);
        long j10 = jArr[e];
        long[] jArr2 = this.f3770c;
        c0 c0Var = new c0(j10, jArr2[e]);
        if (j10 < j3 && e != this.f3768a - 1) {
            int i10 = e + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f3771f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f3768a + ", sizes=" + Arrays.toString(this.f3769b) + ", offsets=" + Arrays.toString(this.f3770c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
