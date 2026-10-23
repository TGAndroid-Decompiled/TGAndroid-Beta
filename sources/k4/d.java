package k4;

import c3.r;
import e2.x;
import v7.u6;
public final class d {
    public final int f14942a;
    public final long f14943b;

    public d(int i10, long j10, boolean z10) {
        this.f14942a = i10;
        this.f14943b = j10;
    }

    public static d b(r rVar, x xVar) {
        rVar.a(0, 8, xVar.f8298a);
        xVar.N(0);
        return new d(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i10 = this.f14942a;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public d(int i10, long j10) {
        u6.g(j10 >= 0);
        this.f14942a = i10;
        this.f14943b = j10;
    }
}
