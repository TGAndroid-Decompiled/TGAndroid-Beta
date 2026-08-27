package h7;

public abstract class z7 {
    public static long a(d5.z zVar, int i10, int i11) {
        zVar.C(i10);
        if (zVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iE = zVar.e();
        if ((8388608 & iE) != 0 || ((2096896 & iE) >> 8) != i11 || (iE & 32) == 0 || zVar.r() < 7 || zVar.a() < 7 || (zVar.r() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zVar.c(0, 6, bArr);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
