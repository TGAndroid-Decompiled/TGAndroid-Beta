package g7;

import java.io.EOFException;
import java.util.Arrays;
public abstract class s {
    public static z3.c a(m3.l lVar, boolean z10) {
        a9.b bVar;
        if (z10) {
            bVar = null;
        } else {
            bVar = e4.i.f4848b;
        }
        d5.y yVar = new d5.y(10);
        z3.c cVar = null;
        int i9 = 0;
        while (true) {
            try {
                lVar.c(0, 10, yVar.f4410a);
                yVar.C(0);
                if (yVar.t() != 4801587) {
                    break;
                }
                yVar.D(3);
                int q10 = yVar.q();
                int i10 = q10 + 10;
                if (cVar == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(yVar.f4410a, 0, bArr, 0, 10);
                    lVar.c(10, q10, bArr);
                    cVar = new e4.i(bVar).c(i10, bArr);
                } else {
                    lVar.n(q10);
                }
                i9 += i10;
            } catch (EOFException unused) {
            }
        }
        lVar.t();
        lVar.n(i9);
        if (cVar == null || cVar.f50288a.length == 0) {
            return null;
        }
        return cVar;
    }

    public static m3.p b(d5.y yVar) {
        yVar.D(1);
        int t10 = yVar.t();
        long j10 = yVar.f4411b + t10;
        int i9 = t10 / 18;
        long[] jArr = new long[i9];
        long[] jArr2 = new long[i9];
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            long l10 = yVar.l();
            if (l10 == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = l10;
            jArr2[i10] = yVar.l();
            yVar.D(2);
            i10++;
        }
        yVar.D((int) (j10 - yVar.f4411b));
        return new m3.p(jArr, jArr2);
    }
}
