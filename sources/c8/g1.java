package c8;
public abstract class g1 {
    public static byte a(long j3) {
        boolean z9;
        if ((j3 >> 8) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        a8.ia.d(j3, "out of range: %s", z9);
        return (byte) j3;
    }
}
