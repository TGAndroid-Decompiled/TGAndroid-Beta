package defpackage;
public abstract class gxe {
    public static byte a(long j) {
        boolean z;
        if ((j >> 8) == 0) {
            z = true;
        } else {
            z = false;
        }
        gre.d(j, "out of range: %s", z);
        return (byte) j;
    }
}
