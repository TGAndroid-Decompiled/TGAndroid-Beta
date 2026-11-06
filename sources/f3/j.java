package f3;

import h2.m0;
import java.util.Arrays;
public final class j implements c0 {
    public final int f11038a;
    public final int[] f11039b;
    public final long[] f11040c;
    public final long[] d;
    public final long[] f11041e;
    public final long f11042f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11039b = iArr;
        this.f11040c = jArr;
        this.d = jArr2;
        this.f11041e = jArr3;
        int length = iArr.length;
        this.f11038a = length;
        if (length > 0) {
            this.f11042f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f11042f = 0L;
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
        long[] jArr = this.f11041e;
        int f10 = m0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f11040c;
        d0 d0Var = new d0(j10, jArr2[f10]);
        if (j10 < j3 && f10 != this.f11038a - 1) {
            int i7 = f10 + 1;
            return new b0(d0Var, new d0(jArr[i7], jArr2[i7]));
        }
        return new b0(d0Var, d0Var);
    }

    @Override
    public final long h() {
        return this.f11042f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f11038a + ", sizes=" + Arrays.toString(this.f11039b) + ", offsets=" + Arrays.toString(this.f11040c) + ", timeUs=" + Arrays.toString(this.f11041e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
