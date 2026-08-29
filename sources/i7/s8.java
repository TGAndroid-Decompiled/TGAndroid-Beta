package i7;
public abstract class s8 {
    public static long a(f5.w wVar, int i10, int i11) {
        wVar.C(i10);
        if (wVar.a() < 5) {
            return -9223372036854775807L;
        }
        int e10 = wVar.e();
        if ((8388608 & e10) != 0 || ((2096896 & e10) >> 8) != i11 || (e10 & 32) == 0 || wVar.r() < 7 || wVar.a() < 7 || (wVar.r() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        wVar.c(0, 6, bArr);
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
