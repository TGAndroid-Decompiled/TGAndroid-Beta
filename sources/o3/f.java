package o3;

import f5.d0;
import java.util.Arrays;
public final class f implements t {
    public final int f19082a;
    public final int[] f19083b;
    public final long[] f19084c;
    public final long[] d;
    public final long[] f19085e;
    public final long f19086f;

    public f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f19083b = iArr;
        this.f19084c = jArr;
        this.d = jArr2;
        this.f19085e = jArr3;
        int length = iArr.length;
        this.f19082a = length;
        if (length > 0) {
            this.f19086f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f19086f = 0L;
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final s g(long j10) {
        long[] jArr = this.f19085e;
        int e10 = d0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long[] jArr2 = this.f19084c;
        u uVar = new u(j11, jArr2[e10]);
        if (j11 < j10 && e10 != this.f19082a - 1) {
            int i10 = e10 + 1;
            return new s(uVar, new u(jArr[i10], jArr2[i10]));
        }
        return new s(uVar, uVar);
    }

    @Override
    public final long h() {
        return this.f19086f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f19082a + ", sizes=" + Arrays.toString(this.f19083b) + ", offsets=" + Arrays.toString(this.f19084c) + ", timeUs=" + Arrays.toString(this.f19085e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
