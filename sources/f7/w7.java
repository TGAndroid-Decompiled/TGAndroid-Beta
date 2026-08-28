package f7;
public abstract class w7 {
    public static int a(Object obj, Object obj2, int i9, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int a2 = x7.a(obj);
        int i12 = a2 & i9;
        int b10 = b(i12, obj3);
        if (b10 != 0) {
            int i13 = ~i9;
            int i14 = a2 & i13;
            int i15 = -1;
            while (true) {
                i10 = b10 - 1;
                i11 = iArr[i10];
                if ((i11 & i13) != i14 || !a8.a(obj, objArr[i10]) || (objArr2 != null && !a8.a(obj2, objArr2[i10]))) {
                    int i16 = i11 & i9;
                    if (i16 == 0) {
                        break;
                    }
                    i15 = i10;
                    b10 = i16;
                }
            }
            int i17 = i11 & i9;
            if (i15 == -1) {
                d(i12, i17, obj3);
                return i10;
            }
            iArr[i15] = (i17 & i9) | (iArr[i15] & i13);
            return i10;
        }
        return -1;
    }

    public static int b(int i9, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i9] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i9];
        }
        return ((int[]) obj)[i9];
    }

    public static Object c(int i9) {
        if (i9 >= 2 && i9 <= 1073741824 && Integer.highestOneBit(i9) == i9) {
            if (i9 <= 256) {
                return new byte[i9];
            }
            if (i9 <= 65536) {
                return new short[i9];
            }
            return new int[i9];
        }
        throw new IllegalArgumentException(j3.r0.l(i9, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void d(int i9, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i9] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i9] = (short) i10;
        } else {
            ((int[]) obj)[i9] = i10;
        }
    }
}
