package c4;

import h5.w;
import r3.l;
public final class e {
    public final int f2072a;
    public final long f2073b;

    public e(int i10, long j10, boolean z4) {
        this.f2072a = i10;
        this.f2073b = j10;
    }

    public static e b(l lVar, w wVar) {
        lVar.c(0, 8, wVar.f7000a);
        wVar.F(0);
        return new e(wVar.g(), wVar.l(), false);
    }

    public boolean a() {
        int i10 = this.f2072a;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public e(int i10, long j10) {
        h5.a.f(j10 >= 0);
        this.f2072a = i10;
        this.f2073b = j10;
    }
}
