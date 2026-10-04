package k4;

import c3.p;
import e2.v;
public final class d {
    public final int f14589a;
    public final long f14590b;

    public d(int i10, long j3, boolean z10) {
        this.f14589a = i10;
        this.f14590b = j3;
    }

    public static d b(p pVar, v vVar) {
        pVar.b(0, 8, vVar.f8589a);
        vVar.J(0);
        return new d(vVar.j(), vVar.o(), false);
    }

    public boolean a() {
        int i10 = this.f14589a;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public d(int i10, long j3) {
        e2.d.b(j3 >= 0);
        this.f14589a = i10;
        this.f14590b = j3;
    }
}
