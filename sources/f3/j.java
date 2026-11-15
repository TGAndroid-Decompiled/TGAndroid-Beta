package f3;

import h2.l0;
import java.util.Arrays;
public final class j implements b0 {
    public final int f10845a;
    public final int[] f10846b;
    public final long[] f10847c;
    public final long[] d;
    public final long[] f10848e;
    public final long f10849f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f10846b = iArr;
        this.f10847c = jArr;
        this.d = jArr2;
        this.f10848e = jArr3;
        int length = iArr.length;
        this.f10845a = length;
        if (length > 0) {
            this.f10849f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f10849f = 0L;
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
        long[] jArr = this.f10848e;
        int f10 = l0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f10847c;
        c0 c0Var = new c0(j10, jArr2[f10]);
        if (j10 < j3 && f10 != this.f10845a - 1) {
            int i7 = f10 + 1;
            return new a0(c0Var, new c0(jArr[i7], jArr2[i7]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f10849f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f10845a + ", sizes=" + Arrays.toString(this.f10846b) + ", offsets=" + Arrays.toString(this.f10847c) + ", timeUs=" + Arrays.toString(this.f10848e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
