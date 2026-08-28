package g7;
public abstract class c8 {
    public static boolean a(m3.l lVar) {
        d5.y yVar = new d5.y(8);
        int i9 = com.google.android.exoplayer2.upstream.k0.b(lVar, yVar).f2562a;
        if (i9 != 1380533830 && i9 != 1380333108) {
            return false;
        }
        lVar.c(0, 4, yVar.f4410a);
        yVar.C(0);
        int e10 = yVar.e();
        if (e10 != 1463899717) {
            d5.a.o("WavHeaderReader", "Unsupported form type: " + e10);
            return false;
        }
        return true;
    }

    public static com.google.android.exoplayer2.upstream.k0 b(int i9, m3.l lVar, d5.y yVar) {
        com.google.android.exoplayer2.upstream.k0 b10 = com.google.android.exoplayer2.upstream.k0.b(lVar, yVar);
        while (true) {
            int i10 = b10.f2562a;
            if (i10 != i9) {
                e2.c.t(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j10 = b10.f2563b + 8;
                if (j10 <= 2147483647L) {
                    lVar.u((int) j10);
                    b10 = com.google.android.exoplayer2.upstream.k0.b(lVar, yVar);
                } else {
                    throw h3.t1.c("Chunk is too large (~2GB+) to skip; id: " + i10);
                }
            } else {
                return b10;
            }
        }
    }
}
