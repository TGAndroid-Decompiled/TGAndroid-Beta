package defpackage;
public abstract class tse {
    public static long[] a(long[]... jArr) {
        boolean z;
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        int i = (int) j;
        if (j == i) {
            z = true;
        } else {
            z = false;
        }
        yve.d(j, "the total number of elements (%s) in the arrays must fit in an int", z);
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i2, jArr4.length);
            i2 += jArr4.length;
        }
        return jArr3;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
