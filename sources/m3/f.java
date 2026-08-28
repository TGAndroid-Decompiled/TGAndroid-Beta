package m3;

import d5.f0;
import java.util.Arrays;
public final class f implements t {
    public final int f17223a;
    public final int[] f17224b;
    public final long[] f17225c;
    public final long[] d;
    public final long[] f17226e;
    public final long f17227f;

    public f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f17224b = iArr;
        this.f17225c = jArr;
        this.d = jArr2;
        this.f17226e = jArr3;
        int length = iArr.length;
        this.f17223a = length;
        if (length > 0) {
            this.f17227f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f17227f = 0L;
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final s h(long j10) {
        long[] jArr = this.f17226e;
        int e10 = f0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long[] jArr2 = this.f17225c;
        u uVar = new u(j11, jArr2[e10]);
        if (j11 < j10 && e10 != this.f17223a - 1) {
            int i9 = e10 + 1;
            return new s(uVar, new u(jArr[i9], jArr2[i9]));
        }
        return new s(uVar, uVar);
    }

    @Override
    public final long i() {
        return this.f17227f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f17223a + ", sizes=" + Arrays.toString(this.f17224b) + ", offsets=" + Arrays.toString(this.f17225c) + ", timeUs=" + Arrays.toString(this.f17226e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
