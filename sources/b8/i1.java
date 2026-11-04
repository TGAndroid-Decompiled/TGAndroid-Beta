package b8;
public abstract class i1 {
    public static int a(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: b8.i1.a(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static int b(int i3, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i3] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i3];
        }
        return ((int[]) obj)[i3];
    }

    public static Object c(int i3) {
        if (i3 >= 2 && i3 <= 1073741824 && Integer.highestOneBit(i3) == i3) {
            if (i3 <= 256) {
                return new byte[i3];
            }
            if (i3 <= 65536) {
                return new short[i3];
            }
            return new int[i3];
        }
        throw new IllegalArgumentException(k2.p1.i(i3, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void d(int i3, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i3] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i3] = (short) i10;
        } else {
            ((int[]) obj)[i3] = i10;
        }
    }
}
