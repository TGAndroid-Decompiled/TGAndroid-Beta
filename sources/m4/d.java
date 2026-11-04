package m4;

import a3.i;
import d2.v0;
import e3.p;
import g2.y;
public abstract class d {
    public static final byte[] f19084a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] f19085b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(p pVar) {
        y yVar = new y(8);
        int i3 = i.b(pVar, yVar).f92a;
        if (i3 != 1380533830 && i3 != 1380333108) {
            return false;
        }
        pVar.c(0, 4, yVar.f11923a);
        yVar.N(0);
        int m10 = yVar.m();
        if (m10 != 1463899717) {
            g2.a.c("WavHeaderReader", "Unsupported form type: " + m10);
            return false;
        }
        return true;
    }

    public static i b(int i3, p pVar, y yVar) {
        i b10 = i.b(pVar, yVar);
        while (true) {
            int i10 = b10.f92a;
            if (i10 != i3) {
                com.google.android.recaptcha.internal.a.o(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j10 = b10.f93b;
                long j11 = 8 + j10;
                if (j10 % 2 != 0) {
                    j11 = 9 + j10;
                }
                if (j11 <= 2147483647L) {
                    pVar.u((int) j11);
                    b10 = i.b(pVar, yVar);
                } else {
                    throw v0.c("Chunk is too large (~2GB+) to skip; id: " + i10);
                }
            } else {
                return b10;
            }
        }
    }
}
