package m2;

import e2.l1;
import j$.util.Objects;
import x2.g0;
public final class a {
    public final long f19518a;
    public final l1 f19519b;
    public final int f19520c;
    public final g0 d;
    public final long f19521e;
    public final l1 f19522f;
    public final int f19523g;
    public final g0 h;
    public final long f19524i;
    public final long f19525j;

    public a(long j3, l1 l1Var, int i7, g0 g0Var, long j10, l1 l1Var2, int i10, g0 g0Var2, long j11, long j12) {
        this.f19518a = j3;
        this.f19519b = l1Var;
        this.f19520c = i7;
        this.d = g0Var;
        this.f19521e = j10;
        this.f19522f = l1Var2;
        this.f19523g = i10;
        this.h = g0Var2;
        this.f19524i = j11;
        this.f19525j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f19518a == aVar.f19518a && this.f19520c == aVar.f19520c && this.f19521e == aVar.f19521e && this.f19523g == aVar.f19523g && this.f19524i == aVar.f19524i && this.f19525j == aVar.f19525j && Objects.equals(this.f19519b, aVar.f19519b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f19522f, aVar.f19522f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19518a), this.f19519b, Integer.valueOf(this.f19520c), this.d, Long.valueOf(this.f19521e), this.f19522f, Integer.valueOf(this.f19523g), this.h, Long.valueOf(this.f19524i), Long.valueOf(this.f19525j));
    }
}
