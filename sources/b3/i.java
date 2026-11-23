package b3;

import a8.ma;
import h2.x;
public final class i {
    public final int f2869a;
    public final long f2870b;

    public i(int i7, long j3, boolean z10) {
        this.f2869a = i7;
        this.f2870b = j3;
    }

    public static i b(f3.p pVar, x xVar) {
        pVar.b(0, 8, xVar.f13828a);
        xVar.N(0);
        return new i(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i7 = this.f2869a;
        if (i7 == 0 || i7 == 1) {
            return true;
        }
        return false;
    }

    public i(int i7, long j3) {
        ma.f(j3 >= 0);
        this.f2869a = i7;
        this.f2870b = j3;
    }
}
