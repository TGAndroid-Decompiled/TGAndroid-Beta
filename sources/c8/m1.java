package c8;
public abstract class m1 {
    public static byte a(long j3) {
        boolean z10;
        if ((j3 >> 8) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a8.la.d(j3, "out of range: %s", z10);
        return (byte) j3;
    }
}
