package i7;
public abstract class m {
    public static int a(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: i7.m.a(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static int b(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i10];
        }
        return ((int[]) obj)[i10];
    }

    public static Object c(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            if (i10 <= 65536) {
                return new short[i10];
            }
            return new int[i10];
        }
        throw new IllegalArgumentException(j7.l1.k(i10, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void d(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
