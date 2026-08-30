package j7;
public abstract class j0 {
    public static boolean a(r3.l lVar) {
        h5.w wVar = new h5.w(8);
        int i10 = c4.e.b(lVar, wVar).f2072a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.c(0, 4, wVar.f7000a);
        wVar.F(0);
        int g10 = wVar.g();
        if (g10 != 1463899717) {
            h5.a.o("WavHeaderReader", "Unsupported form type: " + g10);
            return false;
        }
        return true;
    }

    public static c4.e b(int i10, r3.l lVar, h5.w wVar) {
        c4.e b10 = c4.e.b(lVar, wVar);
        while (true) {
            int i11 = b10.f2072a;
            if (i11 != i10) {
                e2.c.q(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j10 = b10.f2073b + 8;
                if (j10 <= 2147483647L) {
                    lVar.u((int) j10);
                    b10 = c4.e.b(lVar, wVar);
                } else {
                    throw j3.r1.c("Chunk is too large (~2GB+) to skip; id: " + i11);
                }
            } else {
                return b10;
            }
        }
    }
}
