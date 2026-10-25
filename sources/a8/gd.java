package a8;
public abstract class gd {
    public static byte a(long j10) {
        boolean z10;
        if ((j10 >> 8) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.c(j10, "out of range: %s", z10);
        return (byte) j10;
    }
}
