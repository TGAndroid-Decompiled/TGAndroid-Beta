package m2;

import e2.l1;
import j$.util.Objects;
import x2.g0;
public final class a {
    public final long f20504a;
    public final l1 f20505b;
    public final int f20506c;
    public final g0 d;
    public final long f20507e;
    public final l1 f20508f;
    public final int f20509g;
    public final g0 h;
    public final long f20510i;
    public final long f20511j;

    public a(long j3, l1 l1Var, int i7, g0 g0Var, long j10, l1 l1Var2, int i10, g0 g0Var2, long j11, long j12) {
        this.f20504a = j3;
        this.f20505b = l1Var;
        this.f20506c = i7;
        this.d = g0Var;
        this.f20507e = j10;
        this.f20508f = l1Var2;
        this.f20509g = i10;
        this.h = g0Var2;
        this.f20510i = j11;
        this.f20511j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f20504a == aVar.f20504a && this.f20506c == aVar.f20506c && this.f20507e == aVar.f20507e && this.f20509g == aVar.f20509g && this.f20510i == aVar.f20510i && this.f20511j == aVar.f20511j && Objects.equals(this.f20505b, aVar.f20505b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f20508f, aVar.f20508f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f20504a), this.f20505b, Integer.valueOf(this.f20506c), this.d, Long.valueOf(this.f20507e), this.f20508f, Integer.valueOf(this.f20509g), this.h, Long.valueOf(this.f20510i), Long.valueOf(this.f20511j));
    }
}
