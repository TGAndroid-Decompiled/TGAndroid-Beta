package defpackage;
public abstract class ldd {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(ja3 ja3Var) {
        xu7 xu7Var = new xu7(8);
        int i = trc.a(ja3Var, xu7Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ja3Var.d(xu7Var.a, 0, 4, false);
        xu7Var.N(0);
        int m = xu7Var.m();
        if (m != 1463899717) {
            lad.c("WavHeaderReader", "Unsupported form type: " + m);
            return false;
        }
        return true;
    }

    public static trc b(int i, ja3 ja3Var, xu7 xu7Var) {
        trc a2 = trc.a(ja3Var, xu7Var);
        while (true) {
            int i2 = a2.a;
            if (i2 != i) {
                b00.o(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j = a2.b;
                long j2 = 8 + j;
                if (j % 2 != 0) {
                    j2 = 9 + j;
                }
                if (j2 <= 2147483647L) {
                    ja3Var.l((int) j2, false);
                    a2 = trc.a(ja3Var, xu7Var);
                } else {
                    throw av7.d("Chunk is too large (~2GB+) to skip; id: " + i2);
                }
            } else {
                return a2;
            }
        }
    }
}
