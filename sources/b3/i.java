package b3;

import a8.ia;
import h2.x;
public final class i {
    public final int f2950a;
    public final long f2951b;

    public i(int i7, long j3, boolean z9) {
        this.f2950a = i7;
        this.f2951b = j3;
    }

    public static i b(f3.p pVar, x xVar) {
        pVar.b(0, 8, xVar.f14162a);
        xVar.N(0);
        return new i(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i7 = this.f2950a;
        if (i7 == 0 || i7 == 1) {
            return true;
        }
        return false;
    }

    public i(int i7, long j3) {
        ia.f(j3 >= 0);
        this.f2950a = i7;
        this.f2951b = j3;
    }
}
