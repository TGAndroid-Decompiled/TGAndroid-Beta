package a4;

import h5.w;
import java.io.EOFException;
public final class f {
    public final g f64a = new g();
    public final w f65b = new w(new byte[65025], 0);
    public int f66c = -1;
    public int d;
    public boolean e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            g gVar = this.f64a;
            if (i14 >= gVar.f69c) {
                break;
            }
            int[] iArr = gVar.f70f;
            this.d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean b(r3.l lVar) {
        boolean z4;
        boolean z10;
        int i10;
        if (lVar != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        boolean z11 = this.e;
        w wVar = this.f65b;
        if (z11) {
            this.e = false;
            wVar.C(0);
        }
        while (!this.e) {
            int i11 = this.f66c;
            g gVar = this.f64a;
            if (i11 < 0) {
                if (gVar.b(lVar, -1L) && gVar.a(lVar, true)) {
                    int i12 = gVar.d;
                    if ((gVar.f67a & 1) == 1 && wVar.f7002c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        lVar.u(i12);
                        this.f66c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f66c);
            int i13 = this.f66c + this.d;
            if (a2 > 0) {
                wVar.b(wVar.f7002c + a2);
                try {
                    lVar.readFully(wVar.f7000a, wVar.f7002c, a2);
                    wVar.E(wVar.f7002c + a2);
                    if (gVar.f70f[i13 - 1] != 255) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.e = z10;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == gVar.f69c) {
                i13 = -1;
            }
            this.f66c = i13;
        }
        return true;
    }
}
