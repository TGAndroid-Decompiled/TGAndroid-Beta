package i7;

import java.io.EOFException;
import java.util.Arrays;
public abstract class j0 {
    public static b4.c a(o3.l lVar, boolean z10) {
        eg.c cVar;
        if (z10) {
            cVar = null;
        } else {
            cVar = g4.i.f7004b;
        }
        f5.w wVar = new f5.w(10);
        b4.c cVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.a(0, 10, wVar.f6640a);
                wVar.C(0);
                if (wVar.t() != 4801587) {
                    break;
                }
                wVar.D(3);
                int q6 = wVar.q();
                int i11 = q6 + 10;
                if (cVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(wVar.f6640a, 0, bArr, 0, 10);
                    lVar.a(10, q6, bArr);
                    cVar2 = new g4.i(cVar).c(i11, bArr);
                } else {
                    lVar.i(q6);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.s();
        lVar.i(i10);
        if (cVar2 == null || cVar2.f1919a.length == 0) {
            return null;
        }
        return cVar2;
    }

    public static o3.p b(f5.w wVar) {
        wVar.D(1);
        int t10 = wVar.t();
        long j10 = wVar.f6641b + t10;
        int i10 = t10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long l10 = wVar.l();
            if (l10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = l10;
            jArr2[i11] = wVar.l();
            wVar.D(2);
            i11++;
        }
        wVar.D((int) (j10 - wVar.f6641b));
        return new o3.p(jArr, jArr2);
    }
}
