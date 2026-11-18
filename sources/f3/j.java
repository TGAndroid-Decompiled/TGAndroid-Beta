package f3;

import h2.l0;
import java.util.Arrays;
public final class j implements b0 {
    public final int f11164a;
    public final int[] f11165b;
    public final long[] f11166c;
    public final long[] d;
    public final long[] f11167e;
    public final long f11168f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11165b = iArr;
        this.f11166c = jArr;
        this.d = jArr2;
        this.f11167e = jArr3;
        int length = iArr.length;
        this.f11164a = length;
        if (length > 0) {
            this.f11168f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f11168f = 0L;
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
        long[] jArr = this.f11167e;
        int f10 = l0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f11166c;
        c0 c0Var = new c0(j10, jArr2[f10]);
        if (j10 < j3 && f10 != this.f11164a - 1) {
            int i7 = f10 + 1;
            return new a0(c0Var, new c0(jArr[i7], jArr2[i7]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f11168f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f11164a + ", sizes=" + Arrays.toString(this.f11165b) + ", offsets=" + Arrays.toString(this.f11166c) + ", timeUs=" + Arrays.toString(this.f11167e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
