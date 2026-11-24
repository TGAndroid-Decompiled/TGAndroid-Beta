package defpackage;
public abstract class gze {
    public static int a(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int a = kze.a(obj);
        int i4 = a & i;
        int b = b(i4, obj3);
        if (b != 0) {
            int i5 = ~i;
            int i6 = a & i5;
            int i7 = -1;
            while (true) {
                i2 = b - 1;
                int i8 = iArr[i2];
                i3 = i8 & i;
                if ((i8 & i5) != i6 || !m1f.a(obj, objArr[i2]) || (objArr2 != null && !m1f.a(obj2, objArr2[i2]))) {
                    if (i3 == 0) {
                        break;
                    }
                    i7 = i2;
                    b = i3;
                }
            }
            if (i7 == -1) {
                d(i4, i3, obj3);
                return i2;
            }
            iArr[i7] = (iArr[i7] & i5) | (i3 & i);
            return i2;
        }
        return -1;
    }

    public static int b(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static Object c(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        w26.j(de9.k(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static void d(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
