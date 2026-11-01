package k4;

import c3.p;
import e2.x;
import v7.t6;
public final class d {
    public final int f10860a;
    public final long f10861b;

    public d(int i10, long j10, boolean z10) {
        this.f10860a = i10;
        this.f10861b = j10;
    }

    public static d b(p pVar, x xVar) {
        pVar.b(0, 8, xVar.f6207a);
        xVar.N(0);
        return new d(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i10 = this.f10860a;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public d(int i10, long j10) {
        t6.f(j10 >= 0);
        this.f10860a = i10;
        this.f10861b = j10;
    }
}
