package b8;
public abstract class ud {
    public static long a(g2.y yVar, int i3, int i10) {
        yVar.N(i3);
        if (yVar.a() < 5) {
            return -9223372036854775807L;
        }
        int m10 = yVar.m();
        if ((8388608 & m10) != 0 || ((2096896 & m10) >> 8) != i10 || (m10 & 32) == 0 || yVar.A() < 7 || yVar.a() < 7 || (yVar.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        yVar.k(0, 6, bArr);
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
