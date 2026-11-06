package a8;
public abstract class v7 {
    public static int a(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: a8.v7.a(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
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
