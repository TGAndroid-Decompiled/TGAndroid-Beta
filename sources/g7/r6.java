package g7;

import java.util.Arrays;
import java.util.Collection;
public abstract class r6 {
    public static int a(long j10) {
        boolean z10;
        int i9 = (int) j10;
        if (i9 == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i9;
        }
        throw new IllegalArgumentException(e0.a("Out of range: %s", Long.valueOf(j10)));
    }

    public static int b(int i9, int i10) {
        boolean z10;
        if (i10 <= 1073741823) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.min(Math.max(i9, i10), 1073741823);
        }
        throw new IllegalArgumentException(e0.a("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i10), 1073741823));
    }

    public static int c(int i9, int i10, int i11, int[] iArr) {
        while (i10 < i11) {
            if (iArr[i10] == i9) {
                return i10;
            }
            i10++;
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
        if (collection instanceof q8.a) {
            q8.a aVar = (q8.a) collection;
            return Arrays.copyOfRange(aVar.f46115a, aVar.f46116b, aVar.f46117c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            Object obj = array[i9];
            obj.getClass();
            iArr[i9] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
