package b0;

import kotlin.jvm.internal.i;
public abstract class a {
    public static final int[] f1940a = new int[0];
    public static final long[] f1941b = new long[0];
    public static final Object[] f1942c = new Object[0];

    public static final int a(int i10, int i11, int[] array) {
        i.e(array, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = array[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 > i11) {
                i12 = i14 - 1;
            } else {
                return i14;
            }
        }
        return ~i13;
    }

    public static final int b(long[] array, int i10, long j3) {
        i.e(array, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (array[i13] > j3 ? 1 : (array[i13] == j3 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 > 0) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }
}
