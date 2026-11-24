package defpackage;
public abstract class qbe {
    public static final int[] a;

    static {
        int[] iArr = new int[7];
        a = iArr;
        try {
            iArr[3] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[4] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[5] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[6] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[0] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[1] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
