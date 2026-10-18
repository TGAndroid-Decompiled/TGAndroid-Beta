package c3;

import e2.m0;
import java.util.Arrays;
public final class j implements c0 {
    public final int f4632a;
    public final int[] f4633b;
    public final long[] f4634c;
    public final long[] d;
    public final long[] e;
    public final long f4635f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4633b = iArr;
        this.f4634c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f4632a = length;
        if (length > 0) {
            this.f4635f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4635f = 0L;
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
        long[] jArr2 = this.f4634c;
        d0 d0Var = new d0(j11, jArr2[f7]);
        if (j11 < j10 && f7 != this.f4632a - 1) {
            int i10 = f7 + 1;
            return new b0(d0Var, new d0(jArr[i10], jArr2[i10]));
        }
        return new b0(d0Var, d0Var);
    }

    @Override
    public final long h() {
        return this.f4635f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f4632a + ", sizes=" + Arrays.toString(this.f4633b) + ", offsets=" + Arrays.toString(this.f4634c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
