package a8;
public abstract class fd {
    public static long[] a(long[]... jArr) {
        boolean z10;
        long j10 = 0;
        for (long[] jArr2 : jArr) {
            j10 += jArr2.length;
        }
        int i10 = (int) j10;
        if (j10 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.c(j10, "the total number of elements (%s) in the arrays must fit in an int", z10);
        long[] jArr3 = new long[i10];
        int i11 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i11, jArr4.length);
            i11 += jArr4.length;
        }
        return jArr3;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
