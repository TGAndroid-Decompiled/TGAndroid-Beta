package a8;
public abstract class s0 {
    public static int a(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int a10 = t0.a(obj);
        int i12 = a10 & i7;
        int b10 = b(i12, obj3);
        if (b10 != 0) {
            int i13 = ~i7;
            int i14 = a10 & i13;
            int i15 = -1;
            while (true) {
                i10 = b10 - 1;
                i11 = iArr[i10];
                if ((i11 & i13) != i14 || !w0.a(obj, objArr[i10]) || (objArr2 != null && !w0.a(obj2, objArr2[i10]))) {
                    int i16 = i11 & i7;
                    if (i16 == 0) {
                        break;
                    }
                    i15 = i10;
                    b10 = i16;
                }
            }
            int i17 = i11 & i7;
            if (i15 == -1) {
                d(i12, i17, obj3);
                return i10;
            }
            iArr[i15] = (i17 & i7) | (iArr[i15] & i13);
            return i10;
        }
        return -1;
    }

    public static int b(int i7, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i7] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i7];
        }
        return ((int[]) obj)[i7];
    }

    public static Object c(int i7) {
        if (i7 >= 2 && i7 <= 1073741824 && Integer.highestOneBit(i7) == i7) {
            if (i7 <= 256) {
                return new byte[i7];
            }
            if (i7 <= 65536) {
                return new short[i7];
            }
            return new int[i7];
        }
        throw new IllegalArgumentException(jg.g.j(i7, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void d(int i7, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i10;
        } else {
            ((int[]) obj)[i7] = i10;
        }
    }
}
