package c8;
public abstract class f1 {
    public static long[] a(long[]... jArr) {
        boolean z9;
        long j3 = 0;
        for (long[] jArr2 : jArr) {
            j3 += jArr2.length;
        }
        int i7 = (int) j3;
        if (j3 == i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        a8.ia.d(j3, "the total number of elements (%s) in the arrays must fit in an int", z9);
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
