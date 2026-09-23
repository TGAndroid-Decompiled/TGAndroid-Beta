package k4;

import c3.p;
import e2.v;
public final class d {
    public final int f13422a;
    public final long f13423b;

    public d(int i10, long j3, boolean z10) {
        this.f13422a = i10;
        this.f13423b = j3;
    }

    public static d b(p pVar, v vVar) {
        pVar.a(0, 8, vVar.f7917a);
        vVar.J(0);
        return new d(vVar.j(), vVar.o(), false);
    }

    public boolean a() {
        int i10 = this.f13422a;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public d(int i10, long j3) {
        e2.d.b(j3 >= 0);
        this.f13422a = i10;
        this.f13423b = j3;
    }
}
