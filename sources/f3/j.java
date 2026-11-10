package f3;

import h2.m0;
import java.util.Arrays;
public final class j implements c0 {
    public final int f11043a;
    public final int[] f11044b;
    public final long[] f11045c;
    public final long[] d;
    public final long[] f11046e;
    public final long f11047f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11044b = iArr;
        this.f11045c = jArr;
        this.d = jArr2;
        this.f11046e = jArr3;
        int length = iArr.length;
        this.f11043a = length;
        if (length > 0) {
            this.f11047f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f11047f = 0L;
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
        long[] jArr = this.f11046e;
        int f10 = m0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f11045c;
        d0 d0Var = new d0(j10, jArr2[f10]);
        if (j10 < j3 && f10 != this.f11043a - 1) {
            int i7 = f10 + 1;
            return new b0(d0Var, new d0(jArr[i7], jArr2[i7]));
        }
        return new b0(d0Var, d0Var);
    }

    @Override
    public final long h() {
        return this.f11047f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f11043a + ", sizes=" + Arrays.toString(this.f11044b) + ", offsets=" + Arrays.toString(this.f11045c) + ", timeUs=" + Arrays.toString(this.f11046e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
