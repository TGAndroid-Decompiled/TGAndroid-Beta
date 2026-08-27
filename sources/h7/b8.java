package h7;

public abstract class b8 {
    public static boolean a(m3.l lVar) {
        d5.z zVar = new d5.z(8);
        int i10 = com.google.android.exoplayer2.upstream.k0.b(lVar, zVar).f2999a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.b(0, 4, zVar.f4858a);
        zVar.C(0);
        int iE = zVar.e();
        if (iE == 1463899717) {
            return true;
        }
        d5.a.o("WavHeaderReader", "Unsupported form type: " + iE);
        return false;
    }

    public static com.google.android.exoplayer2.upstream.k0 b(int i10, m3.l lVar, d5.z zVar) throws h3.t1 {
        com.google.android.exoplayer2.upstream.k0 k0VarB = com.google.android.exoplayer2.upstream.k0.b(lVar, zVar);
        while (true) {
            int i11 = k0VarB.f2999a;
            if (i11 == i10) {
                return k0VarB;
            }
            com.google.android.recaptcha.internal.a.s(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = k0VarB.f3000b + 8;
            if (j10 > 2147483647L) {
                throw h3.t1.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            lVar.t((int) j10);
            k0VarB = com.google.android.exoplayer2.upstream.k0.b(lVar, zVar);
        }
    }
}
