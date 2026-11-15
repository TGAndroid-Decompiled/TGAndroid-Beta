package b3;

import a8.ja;
import h2.x;
public final class i {
    public final int f2907a;
    public final long f2908b;

    public i(int i7, long j3, boolean z10) {
        this.f2907a = i7;
        this.f2908b = j3;
    }

    public static i b(f3.p pVar, x xVar) {
        pVar.c(0, 8, xVar.f13521a);
        xVar.N(0);
        return new i(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i7 = this.f2907a;
        if (i7 == 0 || i7 == 1) {
            return true;
        }
        return false;
    }

    public i(int i7, long j3) {
        ja.f(j3 >= 0);
        this.f2907a = i7;
        this.f2908b = j3;
    }
}
