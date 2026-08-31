package a4;

import h5.w;
import j3.r1;
import java.io.EOFException;
public final class g {
    public int f72a;
    public long f73b;
    public int f74c;
    public int d;
    public int f75e;
    public final int[] f76f = new int[255];
    public final w f77g = new w(255);

    public final boolean a(r3.l lVar, boolean z4) {
        boolean z10;
        boolean z11;
        this.f72a = 0;
        this.f73b = 0L;
        this.f74c = 0;
        this.d = 0;
        this.f75e = 0;
        w wVar = this.f77g;
        wVar.C(27);
        try {
            z10 = lVar.f(wVar.f7308a, 0, 27, z4);
        } catch (EOFException e6) {
            if (z4) {
                z10 = false;
            } else {
                throw e6;
            }
        }
        if (z10 && wVar.v() == 1332176723) {
            if (wVar.u() != 0) {
                if (!z4) {
                    throw r1.c("unsupported bit stream revision");
                }
            } else {
                this.f72a = wVar.u();
                this.f73b = wVar.j();
                wVar.l();
                wVar.l();
                wVar.l();
                int u10 = wVar.u();
                this.f74c = u10;
                this.d = u10 + 27;
                wVar.C(u10);
                try {
                    z11 = lVar.f(wVar.f7308a, 0, this.f74c, z4);
                } catch (EOFException e10) {
                    if (z4) {
                        z11 = false;
                    } else {
                        throw e10;
                    }
                }
                if (z11) {
                    for (int i10 = 0; i10 < this.f74c; i10++) {
                        int u11 = wVar.u();
                        this.f76f[i10] = u11;
                        this.f75e += u11;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(r3.l lVar, long j10) {
        boolean z4;
        int i10;
        boolean z10;
        if (lVar.getPosition() == lVar.g()) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        w wVar = this.f77g;
        wVar.C(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if (i10 != 0 && lVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z10 = lVar.f(wVar.f7308a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            wVar.F(0);
            if (wVar.v() == 1332176723) {
                lVar.r();
                return true;
            }
            lVar.s(1);
        }
        do {
            if (i10 != 0 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.skip(1) != -1);
        return false;
    }
}
