package a3;

import b8.zb;
import g2.y;
public final class i {
    public final int f92a;
    public final long f93b;

    public i(int i3, long j10, boolean z10) {
        this.f92a = i3;
        this.f93b = j10;
    }

    public static i b(e3.p pVar, y yVar) {
        pVar.c(0, 8, yVar.f11923a);
        yVar.N(0);
        return new i(yVar.m(), yVar.r(), false);
    }

    public boolean a() {
        int i3 = this.f92a;
        if (i3 == 0 || i3 == 1) {
            return true;
        }
        return false;
    }

    public i(int i3, long j10) {
        zb.f(j10 >= 0);
        this.f92a = i3;
        this.f93b = j10;
    }
}
