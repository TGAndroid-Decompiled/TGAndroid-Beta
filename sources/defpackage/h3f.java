package defpackage;
public abstract class h3f {
    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!d(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !d(b3) && !d(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw fpe.c();
    }

    public static void b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!d(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !d(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw fpe.c();
    }

    public static void c(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !d(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw fpe.c();
    }

    public static boolean d(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
