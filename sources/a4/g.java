package a4;

import a8.ia;
import e2.t0;
import f3.p;
import h2.x;
import java.io.EOFException;
public final class g {
    public int f170a;
    public long f171b;
    public int f172c;
    public int d;
    public int f173e;
    public final int[] f174f = new int[255];
    public final x f175g = new x(255);

    public final boolean a(p pVar, boolean z9) {
        boolean z10;
        boolean z11;
        this.f170a = 0;
        this.f171b = 0L;
        this.f172c = 0;
        this.d = 0;
        this.f173e = 0;
        x xVar = this.f175g;
        xVar.K(27);
        try {
            z10 = pVar.k(xVar.f14162a, 0, 27, z9);
        } catch (EOFException e10) {
            if (z9) {
                z10 = false;
            } else {
                throw e10;
            }
        }
        if (z10 && xVar.C() == 1332176723) {
            if (xVar.A() != 0) {
                if (!z9) {
                    throw t0.c("unsupported bit stream revision");
                }
            } else {
                this.f170a = xVar.A();
                this.f171b = xVar.p();
                xVar.r();
                xVar.r();
                xVar.r();
                int A = xVar.A();
                this.f172c = A;
                this.d = A + 27;
                xVar.K(A);
                try {
                    z11 = pVar.k(xVar.f14162a, 0, this.f172c, z9);
                } catch (EOFException e11) {
                    if (z9) {
                        z11 = false;
                    } else {
                        throw e11;
                    }
                }
                if (z11) {
                    for (int i7 = 0; i7 < this.f172c; i7++) {
                        int A2 = xVar.A();
                        this.f174f[i7] = A2;
                        this.f173e += A2;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(p pVar, long j3) {
        boolean z9;
        int i7;
        boolean z10;
        if (pVar.getPosition() == pVar.l()) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        x xVar = this.f175g;
        xVar.K(4);
        while (true) {
            i7 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
            if (i7 != 0 && pVar.getPosition() + 4 >= j3) {
                break;
            }
            try {
                z10 = pVar.k(xVar.f14162a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            xVar.N(0);
            if (xVar.C() == 1332176723) {
                pVar.q();
                return true;
            }
            pVar.s(1);
        }
        do {
            if (i7 != 0 && pVar.getPosition() >= j3) {
                break;
            }
        } while (pVar.skip(1) != -1);
        return false;
    }
}
