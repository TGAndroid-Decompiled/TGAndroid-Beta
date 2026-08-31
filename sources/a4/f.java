package a4;

import h5.w;
import java.io.EOFException;
public final class f {
    public final g f68a = new g();
    public final w f69b = new w(new byte[65025], 0);
    public int f70c = -1;
    public int d;
    public boolean f71e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            g gVar = this.f68a;
            if (i14 >= gVar.f74c) {
                break;
            }
            int[] iArr = gVar.f76f;
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
        boolean z11 = this.f71e;
        w wVar = this.f69b;
        if (z11) {
            this.f71e = false;
            wVar.C(0);
        }
        while (!this.f71e) {
            int i11 = this.f70c;
            g gVar = this.f68a;
            if (i11 < 0) {
                if (gVar.b(lVar, -1L) && gVar.a(lVar, true)) {
                    int i12 = gVar.d;
                    if ((gVar.f72a & 1) == 1 && wVar.f7310c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        lVar.s(i12);
                        this.f70c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f70c);
            int i13 = this.f70c + this.d;
            if (a2 > 0) {
                wVar.b(wVar.f7310c + a2);
                try {
                    lVar.readFully(wVar.f7308a, wVar.f7310c, a2);
                    wVar.E(wVar.f7310c + a2);
                    if (gVar.f76f[i13 - 1] != 255) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f71e = z10;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == gVar.f74c) {
                i13 = -1;
            }
            this.f70c = i13;
        }
        return true;
    }
}
