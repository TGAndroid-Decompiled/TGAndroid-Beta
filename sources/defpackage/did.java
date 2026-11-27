package defpackage;
public abstract class did {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(cb3 cb3Var) {
        ey7 ey7Var = new ey7(8);
        int i = hwc.a(cb3Var, ey7Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        cb3Var.d(ey7Var.a, 0, 4, false);
        ey7Var.N(0);
        int m = ey7Var.m();
        if (m != 1463899717) {
            efd.c("WavHeaderReader", "Unsupported form type: " + m);
            return false;
        }
        return true;
    }

    public static hwc b(int i, cb3 cb3Var, ey7 ey7Var) {
        hwc a2 = hwc.a(cb3Var, ey7Var);
        while (true) {
            int i2 = a2.a;
            if (i2 != i) {
                c00.p(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j = a2.b;
                long j2 = 8 + j;
                if (j % 2 != 0) {
                    j2 = 9 + j;
                }
                if (j2 <= 2147483647L) {
                    cb3Var.l((int) j2, false);
                    a2 = hwc.a(cb3Var, ey7Var);
                } else {
                    throw hy7.d("Chunk is too large (~2GB+) to skip; id: " + i2);
                }
            } else {
                return a2;
            }
        }
    }
}
