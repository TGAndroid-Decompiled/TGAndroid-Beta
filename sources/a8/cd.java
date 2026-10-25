package a8;
public abstract class cd {
    public static long a(e2.x xVar, int i10, int i11) {
        xVar.N(i10);
        if (xVar.a() < 5) {
            return -9223372036854775807L;
        }
        int m10 = xVar.m();
        if ((8388608 & m10) != 0 || ((2096896 & m10) >> 8) != i11 || (m10 & 32) == 0 || xVar.A() < 7 || xVar.a() < 7 || (xVar.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        xVar.k(0, 6, bArr);
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
