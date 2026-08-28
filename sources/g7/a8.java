package g7;
public abstract class a8 {
    public static long a(d5.y yVar, int i9, int i10) {
        yVar.C(i9);
        if (yVar.a() < 5) {
            return -9223372036854775807L;
        }
        int e10 = yVar.e();
        if ((8388608 & e10) != 0 || ((2096896 & e10) >> 8) != i10 || (e10 & 32) == 0 || yVar.r() < 7 || yVar.a() < 7 || (yVar.r() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        yVar.c(0, 6, bArr);
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
