package defpackage;
public abstract class loe {
    public static final int[] a;
    public static final int[] b;

    static {
        int[] iArr = new int[sre.values().length];
        b = iArr;
        try {
            iArr[sre.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[sre.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            int[] iArr2 = b;
            sre sreVar = sre.VOID;
            iArr2[6] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr3 = new int[wi8.G(4).length];
        a = iArr3;
        try {
            iArr3[3] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
