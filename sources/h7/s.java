package h7;

import java.io.EOFException;
import java.util.Arrays;

public abstract class s {
    public static z3.c a(m3.l lVar, boolean z10) throws Throwable {
        a9.m mVar = z10 ? null : e4.i.f5207b;
        d5.z zVar = new d5.z(10);
        z3.c cVarC = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.b(0, 10, zVar.f4858a);
                zVar.C(0);
                if (zVar.t() != 4801587) {
                    break;
                }
                zVar.D(3);
                int iQ = zVar.q();
                int i11 = iQ + 10;
                if (cVarC == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(zVar.f4858a, 0, bArr, 0, 10);
                    lVar.b(10, iQ, bArr);
                    cVarC = new e4.i(mVar).c(i11, bArr);
                } else {
                    lVar.j(iQ);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.q();
        lVar.j(i10);
        if (cVarC == null || cVarC.f50188a.length == 0) {
            return null;
        }
        return cVarC;
    }

    public static m3.p b(d5.z zVar) {
        zVar.D(1);
        int iT = zVar.t();
        long j10 = ((long) zVar.f4859b) + ((long) iT);
        int i10 = iT / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jL = zVar.l();
            if (jL == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jL;
            jArrCopyOf2[i11] = zVar.l();
            zVar.D(2);
        }
        zVar.D((int) (j10 - ((long) zVar.f4859b)));
        return new m3.p(jArrCopyOf, jArrCopyOf2);
    }
}
