package k4;

import a8.yb;
import c3.p;
import e2.x;
public final class d {
    public final int f16376a;
    public final long f16377b;

    public d(int i10, long j10, boolean z10) {
        this.f16376a = i10;
        this.f16377b = j10;
    }

    public static d b(p pVar, x xVar) {
        pVar.b(0, 8, xVar.f9731a);
        xVar.N(0);
        return new d(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i10 = this.f16376a;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public d(int i10, long j10) {
        yb.g(j10 >= 0);
        this.f16376a = i10;
        this.f16377b = j10;
    }
}
