package i3;

import g7.c0;
import h3.r2;
import j4.d0;
import java.util.Arrays;
public final class a {
    public final long f10875a;
    public final r2 f10876b;
    public final int f10877c;
    public final d0 d;
    public final long f10878e;
    public final r2 f10879f;
    public final int f10880g;
    public final d0 h;
    public final long f10881i;
    public final long f10882j;

    public a(long j10, r2 r2Var, int i9, d0 d0Var, long j11, r2 r2Var2, int i10, d0 d0Var2, long j12, long j13) {
        this.f10875a = j10;
        this.f10876b = r2Var;
        this.f10877c = i9;
        this.d = d0Var;
        this.f10878e = j11;
        this.f10879f = r2Var2;
        this.f10880g = i10;
        this.h = d0Var2;
        this.f10881i = j12;
        this.f10882j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10875a == aVar.f10875a && this.f10877c == aVar.f10877c && this.f10878e == aVar.f10878e && this.f10880g == aVar.f10880g && this.f10881i == aVar.f10881i && this.f10882j == aVar.f10882j && c0.a(this.f10876b, aVar.f10876b) && c0.a(this.d, aVar.d) && c0.a(this.f10879f, aVar.f10879f) && c0.a(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10875a), this.f10876b, Integer.valueOf(this.f10877c), this.d, Long.valueOf(this.f10878e), this.f10879f, Integer.valueOf(this.f10880g), this.h, Long.valueOf(this.f10881i), Long.valueOf(this.f10882j)});
    }
}
