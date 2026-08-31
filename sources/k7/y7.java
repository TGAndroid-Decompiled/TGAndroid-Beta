package k7;

import java.util.Arrays;
import java.util.Collection;
public abstract class y7 {
    public static int a(long j10) {
        boolean z4;
        int i10 = (int) j10;
        if (i10 == j10) {
            z4 = true;
        } else {
            z4 = false;
        }
        c7.b(j10, "Out of range: %s", z4);
        return i10;
    }

    public static int b(int i10, int i11, int i12, int[] iArr) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int c(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] d(Collection collection) {
        if (collection instanceof u8.a) {
            u8.a aVar = (u8.a) collection;
            return Arrays.copyOfRange(aVar.f48455a, aVar.f48456b, aVar.f48457c);
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
