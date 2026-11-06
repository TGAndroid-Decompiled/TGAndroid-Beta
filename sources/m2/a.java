package m2;

import e2.l1;
import j$.util.Objects;
import x2.g0;
public final class a {
    public final long f19515a;
    public final l1 f19516b;
    public final int f19517c;
    public final g0 d;
    public final long f19518e;
    public final l1 f19519f;
    public final int f19520g;
    public final g0 h;
    public final long f19521i;
    public final long f19522j;

    public a(long j3, l1 l1Var, int i7, g0 g0Var, long j10, l1 l1Var2, int i10, g0 g0Var2, long j11, long j12) {
        this.f19515a = j3;
        this.f19516b = l1Var;
        this.f19517c = i7;
        this.d = g0Var;
        this.f19518e = j10;
        this.f19519f = l1Var2;
        this.f19520g = i10;
        this.h = g0Var2;
        this.f19521i = j11;
        this.f19522j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f19515a == aVar.f19515a && this.f19517c == aVar.f19517c && this.f19518e == aVar.f19518e && this.f19520g == aVar.f19520g && this.f19521i == aVar.f19521i && this.f19522j == aVar.f19522j && Objects.equals(this.f19516b, aVar.f19516b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f19519f, aVar.f19519f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19515a), this.f19516b, Integer.valueOf(this.f19517c), this.d, Long.valueOf(this.f19518e), this.f19519f, Integer.valueOf(this.f19520g), this.h, Long.valueOf(this.f19521i), Long.valueOf(this.f19522j));
    }
}
