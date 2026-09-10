package k4;

import b2.s0;
import c3.p;
import com.google.android.gms.internal.vision.e2;
import e2.v;
public abstract class e {
    public static final byte[] f12280a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] f12281b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(p pVar) {
        v vVar = new v(8);
        int i10 = d.b(pVar, vVar).f12278a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        pVar.b(0, 4, vVar.f7234a);
        vVar.J(0);
        int j3 = vVar.j();
        if (j3 != 1463899717) {
            e2.a.e("WavHeaderReader", "Unsupported form type: " + j3);
            return false;
        }
        return true;
    }

    public static d b(int i10, p pVar, v vVar) {
        d b10 = d.b(pVar, vVar);
        while (true) {
            int i11 = b10.f12278a;
            if (i11 != i10) {
                e2.l(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j3 = b10.f12279b;
                long j10 = 8 + j3;
                if (j3 % 2 != 0) {
                    j10 = 9 + j3;
                }
                if (j10 <= 2147483647L) {
                    pVar.q((int) j10);
                    b10 = d.b(pVar, vVar);
                } else {
                    throw s0.c("Chunk is too large (~2GB+) to skip; id: " + i11);
                }
            } else {
                return b10;
            }
        }
    }
}
