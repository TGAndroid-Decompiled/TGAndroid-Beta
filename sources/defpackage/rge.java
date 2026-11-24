package defpackage;
public abstract class rge {
    public static long a(double d) {
        jte.e("not a normal value", b(d));
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits << 1;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b(double d) {
        if (Math.getExponent(d) <= 1023) {
            return true;
        }
        return false;
    }
}
