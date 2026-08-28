package f7;
public abstract class t8 {
    public static int a(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: f7.t8.a(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
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
