package b0;

import kotlin.jvm.internal.j;
public abstract class a {
    public static final int[] f2888a = new int[0];
    public static final long[] f2889b = new long[0];
    public static final Object[] f2890c = new Object[0];

    public static final int a(int i7, int i10, int[] array) {
        j.e(array, "array");
        int i11 = i7 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = array[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static final int b(long[] array, int i7, long j3) {
        j.e(array, "array");
        int i10 = i7 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = (array[i12] > j3 ? 1 : (array[i12] == j3 ? 0 : -1));
            if (i13 < 0) {
                i11 = i12 + 1;
            } else if (i13 > 0) {
                i10 = i12 - 1;
            } else {
                return i12;
            }
        }
        return ~i11;
    }
}
