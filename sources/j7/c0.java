package j7;
public abstract class c0 {
    public static long a(h5.w wVar, int i10, int i11) {
        wVar.F(i10);
        if (wVar.a() < 5) {
            return -9223372036854775807L;
        }
        int g10 = wVar.g();
        if ((8388608 & g10) != 0 || ((2096896 & g10) >> 8) != i11 || (g10 & 32) == 0 || wVar.u() < 7 || wVar.a() < 7 || (wVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        wVar.e(0, 6, bArr);
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
