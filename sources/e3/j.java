package e3;

import g2.n0;
import java.util.Arrays;
public final class j implements b0 {
    public final int f9474a;
    public final int[] f9475b;
    public final long[] f9476c;
    public final long[] d;
    public final long[] f9477e;
    public final long f9478f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f9475b = iArr;
        this.f9476c = jArr;
        this.d = jArr2;
        this.f9477e = jArr3;
        int length = iArr.length;
        this.f9474a = length;
        if (length > 0) {
            this.f9478f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f9478f = 0L;
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
        long[] jArr = this.f9477e;
        int f10 = n0.f(jArr, j10, true);
        long j11 = jArr[f10];
        long[] jArr2 = this.f9476c;
        c0 c0Var = new c0(j11, jArr2[f10]);
        if (j11 < j10 && f10 != this.f9474a - 1) {
            int i3 = f10 + 1;
            return new a0(c0Var, new c0(jArr[i3], jArr2[i3]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f9478f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f9474a + ", sizes=" + Arrays.toString(this.f9475b) + ", offsets=" + Arrays.toString(this.f9476c) + ", timeUs=" + Arrays.toString(this.f9477e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
