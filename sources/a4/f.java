package a4;

import a8.ia;
import f3.p;
import h2.x;
import java.io.EOFException;
public final class f {
    public final g f166a = new g();
    public final x f167b = new x(new byte[65025], 0);
    public int f168c = -1;
    public int d;
    public boolean f169e;

    public final int a(int i7) {
        int i10;
        int i11 = 0;
        this.d = 0;
        do {
            int i12 = this.d;
            int i13 = i7 + i12;
            g gVar = this.f166a;
            if (i13 >= gVar.f172c) {
                break;
            }
            int[] iArr = gVar.f174f;
            this.d = i12 + 1;
            i10 = iArr[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public final boolean b(p pVar) {
        boolean z9;
        boolean z10;
        int i7;
        if (pVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        boolean z11 = this.f169e;
        x xVar = this.f167b;
        if (z11) {
            this.f169e = false;
            xVar.K(0);
        }
        while (!this.f169e) {
            int i10 = this.f168c;
            g gVar = this.f166a;
            if (i10 < 0) {
                if (gVar.b(pVar, -1L) && gVar.a(pVar, true)) {
                    int i11 = gVar.d;
                    if ((gVar.f170a & 1) == 1 && xVar.f14164c == 0) {
                        i11 += a(0);
                        i7 = this.d;
                    } else {
                        i7 = 0;
                    }
                    try {
                        pVar.s(i11);
                        this.f168c = i7;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a10 = a(this.f168c);
            int i12 = this.f168c + this.d;
            if (a10 > 0) {
                xVar.c(xVar.f14164c + a10);
                try {
                    pVar.readFully(xVar.f14162a, xVar.f14164c, a10);
                    xVar.M(xVar.f14164c + a10);
                    if (gVar.f174f[i12 - 1] != 255) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f169e = z10;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == gVar.f172c) {
                i12 = -1;
            }
            this.f168c = i12;
        }
        return true;
    }
}
