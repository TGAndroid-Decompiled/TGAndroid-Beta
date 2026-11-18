package c8;
public abstract class l1 {
    public static long[] a(long[]... jArr) {
        boolean z10;
        long j3 = 0;
        for (long[] jArr2 : jArr) {
            j3 += jArr2.length;
        }
        int i7 = (int) j3;
        if (j3 == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        a8.la.d(j3, "the total number of elements (%s) in the arrays must fit in an int", z10);
        long[] jArr3 = new long[i7];
        int i10 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i10, jArr4.length);
            i10 += jArr4.length;
        }
        return jArr3;
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
