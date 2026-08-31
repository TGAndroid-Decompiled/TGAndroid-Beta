package j7;
public abstract class g9 {
    public static h7.r f9624a;

    public static synchronized c9 a(z8 z8Var) {
        c9 c9Var;
        synchronized (g9.class) {
            try {
                if (f9624a == null) {
                    f9624a = new h7.r(1);
                }
                c9Var = (c9) f9624a.F(z8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c9Var;
    }

    public static int b(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int a2 = k7.g.a(obj);
        int i13 = a2 & i10;
        int c3 = c(i13, obj3);
        if (c3 != 0) {
            int i14 = ~i10;
            int i15 = a2 & i14;
            int i16 = -1;
            while (true) {
                i11 = c3 - 1;
                i12 = iArr[i11];
                if ((i12 & i14) != i15 || !k7.j.a(obj, objArr[i11]) || (objArr2 != null && !k7.j.a(obj2, objArr2[i11]))) {
                    int i17 = i12 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i16 = i11;
                    c3 = i17;
                }
            }
            int i18 = i12 & i10;
            if (i16 == -1) {
                e(i13, i18, obj3);
                return i11;
            }
            iArr[i16] = (i18 & i10) | (iArr[i16] & i14);
            return i11;
        }
        return -1;
    }

    public static int c(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i10];
        }
        return ((int[]) obj)[i10];
    }

    public static Object d(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            if (i10 <= 65536) {
                return new short[i10];
            }
            return new int[i10];
        }
        throw new IllegalArgumentException(l.d.j(i10, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void e(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
