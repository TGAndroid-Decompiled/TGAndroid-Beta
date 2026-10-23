package c3;

import java.util.Arrays;
public final class j implements e0 {
    public final int f4631a;
    public final int[] f4632b;
    public final long[] f4633c;
    public final long[] d;
    public final long[] e;
    public final long f4634f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4632b = iArr;
        this.f4633c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f4631a = length;
        if (length > 0) {
            this.f4634f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4634f = 0L;
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
    public final d0 f(long j10) {
        long[] jArr = this.e;
        int f7 = e2.m0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long[] jArr2 = this.f4633c;
        f0 f0Var = new f0(j11, jArr2[f7]);
        if (j11 < j10 && f7 != this.f4631a - 1) {
            int i10 = f7 + 1;
            return new d0(f0Var, new f0(jArr[i10], jArr2[i10]));
        }
        return new d0(f0Var, f0Var);
    }

    @Override
    public final long h() {
        return this.f4634f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f4631a + ", sizes=" + Arrays.toString(this.f4632b) + ", offsets=" + Arrays.toString(this.f4633c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
