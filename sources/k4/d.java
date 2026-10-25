package k4;

import a8.yb;
import c3.p;
import e2.x;
public final class d {
    public final int f16377a;
    public final long f16378b;

    public d(int i10, long j10, boolean z10) {
        this.f16377a = i10;
        this.f16378b = j10;
    }

    public static d b(p pVar, x xVar) {
        pVar.b(0, 8, xVar.f9732a);
        xVar.N(0);
        return new d(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i10 = this.f16377a;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public d(int i10, long j10) {
        yb.g(j10 >= 0);
        this.f16377a = i10;
        this.f16378b = j10;
    }
}
