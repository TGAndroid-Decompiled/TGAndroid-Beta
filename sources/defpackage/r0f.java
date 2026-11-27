package defpackage;
public abstract class r0f {
    public static long a(ey7 ey7Var, int i, int i2) {
        ey7Var.N(i);
        if (ey7Var.a() >= 5) {
            int m = ey7Var.m();
            if ((8388608 & m) == 0 && ((2096896 & m) >> 8) == i2 && (m & 32) != 0 && ey7Var.A() >= 7 && ey7Var.a() >= 7 && (ey7Var.A() & 16) == 16) {
                byte[] bArr = new byte[6];
                ey7Var.k(0, 6, bArr);
                return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((bArr[4] & 255) >> 7);
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }
}
