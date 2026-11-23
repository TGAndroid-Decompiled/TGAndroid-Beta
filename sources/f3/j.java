package f3;

import java.util.Arrays;
public final class j implements c0 {
    public final int f11163a;
    public final int[] f11164b;
    public final long[] f11165c;
    public final long[] d;
    public final long[] f11166e;
    public final long f11167f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11164b = iArr;
        this.f11165c = jArr;
        this.d = jArr2;
        this.f11166e = jArr3;
        int length = iArr.length;
        this.f11163a = length;
        if (length > 0) {
            this.f11167f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f11167f = 0L;
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
    public final b0 f(long j3) {
        long[] jArr = this.f11166e;
        int f10 = h2.l0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f11165c;
        d0 d0Var = new d0(j10, jArr2[f10]);
        if (j10 < j3 && f10 != this.f11163a - 1) {
            int i7 = f10 + 1;
            return new b0(d0Var, new d0(jArr[i7], jArr2[i7]));
        }
        return new b0(d0Var, d0Var);
    }

    @Override
    public final long h() {
        return this.f11167f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f11163a + ", sizes=" + Arrays.toString(this.f11164b) + ", offsets=" + Arrays.toString(this.f11165c) + ", timeUs=" + Arrays.toString(this.f11166e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
