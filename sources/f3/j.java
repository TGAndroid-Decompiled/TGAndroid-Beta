package f3;

import h2.l0;
import java.util.Arrays;
public final class j implements b0 {
    public final int f11196a;
    public final int[] f11197b;
    public final long[] f11198c;
    public final long[] d;
    public final long[] f11199e;
    public final long f11200f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11197b = iArr;
        this.f11198c = jArr;
        this.d = jArr2;
        this.f11199e = jArr3;
        int length = iArr.length;
        this.f11196a = length;
        if (length > 0) {
            this.f11200f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f11200f = 0L;
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
    public final a0 f(long j3) {
        long[] jArr = this.f11199e;
        int f10 = l0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f11198c;
        c0 c0Var = new c0(j10, jArr2[f10]);
        if (j10 < j3 && f10 != this.f11196a - 1) {
            int i7 = f10 + 1;
            return new a0(c0Var, new c0(jArr[i7], jArr2[i7]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f11200f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f11196a + ", sizes=" + Arrays.toString(this.f11197b) + ", offsets=" + Arrays.toString(this.f11198c) + ", timeUs=" + Arrays.toString(this.f11199e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
