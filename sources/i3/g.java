package i3;

import h3.r2;
import h3.s2;
import j4.c0;

public final class g {

    public final String f10537a;

    public int f10538b;

    public long f10539c;
    public final c0 d;

    public boolean f10540e;

    public boolean f10541f;

    public final h f10542g;

    public g(h hVar, String str, int i10, c0 c0Var) {
        this.f10542g = hVar;
        this.f10537a = str;
        this.f10538b = i10;
        this.f10539c = c0Var == null ? -1L : c0Var.d;
        if (c0Var == null || !c0Var.a()) {
            return;
        }
        this.d = c0Var;
    }

    public final boolean a(a aVar) {
        c0 c0Var = aVar.d;
        s2 s2Var = aVar.f10517b;
        if (c0Var == null) {
            return this.f10538b != aVar.f10518c;
        }
        long j10 = this.f10539c;
        if (j10 == -1) {
            return false;
        }
        if (c0Var.d > j10) {
            return true;
        }
        c0 c0Var2 = this.d;
        if (c0Var2 == null) {
            return false;
        }
        int i10 = c0Var2.f12504b;
        int iB = s2Var.b(c0Var.f12503a);
        int iB2 = s2Var.b(c0Var2.f12503a);
        if (c0Var.d < c0Var2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!c0Var.a()) {
            int i11 = c0Var.f12506e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = c0Var.f12504b;
        int i13 = c0Var.f12505c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > c0Var2.f12505c;
        }
        return true;
    }

    public final boolean b(s2 s2Var, s2 s2Var2) {
        c0 c0Var;
        int i10 = this.f10538b;
        if (i10 < s2Var.o()) {
            h hVar = this.f10542g;
            r2 r2Var = hVar.f10544a;
            s2Var.n(i10, r2Var);
            int i11 = r2Var.A;
            while (true) {
                if (i11 > r2Var.B) {
                    i10 = -1;
                    break;
                }
                int iB = s2Var2.b(s2Var.l(i11));
                if (iB != -1) {
                    i10 = s2Var2.f(iB, hVar.f10545b, false).f8069c;
                    break;
                }
                i11++;
            }
        } else if (i10 >= s2Var2.o()) {
            i10 = -1;
            break;
        }
        this.f10538b = i10;
        return i10 != -1 && ((c0Var = this.d) == null || s2Var2.b(c0Var.f12503a) != -1);
    }
}
