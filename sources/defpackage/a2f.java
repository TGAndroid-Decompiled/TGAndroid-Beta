package defpackage;
public abstract class a2f {
    public static byte a(long j) {
        boolean z;
        if ((j >> 8) == 0) {
            z = true;
        } else {
            z = false;
        }
        yve.d(j, "out of range: %s", z);
        return (byte) j;
    }
}
