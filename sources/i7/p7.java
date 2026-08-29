package i7;

import java.util.Arrays;
import java.util.Collection;
public abstract class p7 {
    public static int a(long j10) {
        boolean z10;
        int i10 = (int) j10;
        if (i10 == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i10;
        }
        throw new IllegalArgumentException(q6.a("Out of range: %s", Long.valueOf(j10)));
    }

    public static int b(int i10, int i11) {
        boolean z10;
        if (i11 <= 1073741823) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.min(Math.max(i10, i11), 1073741823);
        }
        throw new IllegalArgumentException(q6.a("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i11), 1073741823));
    }

    public static int c(int i10, int i11, int i12, int[] iArr) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int d(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] e(Collection collection) {
        if (collection instanceof s8.a) {
            s8.a aVar = (s8.a) collection;
            return Arrays.copyOfRange(aVar.f47686a, aVar.f47687b, aVar.f47688c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
