package m3;

import d5.g0;
import java.util.Arrays;

public final class f implements t {

    public final int f17599a;

    public final int[] f17600b;

    public final long[] f17601c;
    public final long[] d;

    public final long[] f17602e;

    public final long f17603f;

    public f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f17600b = iArr;
        this.f17601c = jArr;
        this.d = jArr2;
        this.f17602e = jArr3;
        int length = iArr.length;
        this.f17599a = length;
        if (length > 0) {
            this.f17603f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f17603f = 0L;
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final s h(long j10) {
        long[] jArr = this.f17602e;
        int iE = g0.e(jArr, j10, true);
        long j11 = jArr[iE];
        long[] jArr2 = this.f17601c;
        u uVar = new u(j11, jArr2[iE]);
        if (j11 >= j10 || iE == this.f17599a - 1) {
            return new s(uVar, uVar);
        }
        int i10 = iE + 1;
        return new s(uVar, new u(jArr[i10], jArr2[i10]));
    }

    @Override
    public final long i() {
        return this.f17603f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f17599a + ", sizes=" + Arrays.toString(this.f17600b) + ", offsets=" + Arrays.toString(this.f17601c) + ", timeUs=" + Arrays.toString(this.f17602e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
