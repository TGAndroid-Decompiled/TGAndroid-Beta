package defpackage;
public abstract class nfd {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(vb3 vb3Var) {
        yw7 yw7Var = new yw7(8);
        int i = vtc.a(vb3Var, yw7Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        vb3Var.d(yw7Var.a, 0, 4, false);
        yw7Var.N(0);
        int m = yw7Var.m();
        if (m != 1463899717) {
            ncd.c("WavHeaderReader", "Unsupported form type: " + m);
            return false;
        }
        return true;
    }

    public static vtc b(int i, vb3 vb3Var, yw7 yw7Var) {
        vtc a2 = vtc.a(vb3Var, yw7Var);
        while (true) {
            int i2 = a2.a;
            if (i2 != i) {
                b10.o(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j = a2.b;
                long j2 = 8 + j;
                if (j % 2 != 0) {
                    j2 = 9 + j;
                }
                if (j2 <= 2147483647L) {
                    vb3Var.m((int) j2, false);
                    a2 = vtc.a(vb3Var, yw7Var);
                } else {
                    throw bx7.d("Chunk is too large (~2GB+) to skip; id: " + i2);
                }
            } else {
                return a2;
            }
        }
    }
}
