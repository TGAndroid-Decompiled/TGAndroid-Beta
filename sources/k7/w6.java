package k7;

import java.io.EOFException;
import java.util.Arrays;
public abstract class w6 {
    public static e4.c a(r3.l lVar, boolean z4) {
        j3.q0 q0Var;
        if (z4) {
            q0Var = null;
        } else {
            q0Var = j4.i.f9527b;
        }
        h5.w wVar = new h5.w(10);
        e4.c cVar = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.b(0, 10, wVar.f7308a);
                wVar.F(0);
                if (wVar.w() != 4801587) {
                    break;
                }
                wVar.G(3);
                int t6 = wVar.t();
                int i11 = t6 + 10;
                if (cVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(wVar.f7308a, 0, bArr, 0, 10);
                    lVar.b(10, t6, bArr);
                    cVar = new j4.i(q0Var).c(i11, bArr);
                } else {
                    lVar.i(t6);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.r();
        lVar.i(i10);
        if (cVar == null || cVar.f4938a.length == 0) {
            return null;
        }
        return cVar;
    }

    public static q5.c0 b(h5.w wVar) {
        wVar.G(1);
        int w10 = wVar.w();
        long j10 = wVar.f7309b + w10;
        int i10 = w10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long o10 = wVar.o();
            if (o10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = o10;
            jArr2[i11] = wVar.o();
            wVar.G(2);
            i11++;
        }
        wVar.G((int) (j10 - wVar.f7309b));
        return new q5.c0(6, jArr, jArr2);
    }
}
