package defpackage;

import java.util.Arrays;
public final class sh2 implements zy9 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public sh2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
            return;
        }
        this.f = 0L;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final yy9 e(long j) {
        long[] jArr = this.e;
        int f = gcc.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.c;
        bz9 bz9Var = new bz9(j2, jArr2[f]);
        if (j2 < j && f != this.a - 1) {
            int i = f + 1;
            return new yy9(bz9Var, new bz9(jArr[i], jArr2[i]));
        }
        return new yy9(bz9Var, bz9Var);
    }

    @Override
    public final long h() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
