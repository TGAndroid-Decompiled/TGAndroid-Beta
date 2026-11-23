package m2;

import e2.l1;
import j$.util.Objects;
import x2.g0;
public final class a {
    public final long f20507a;
    public final l1 f20508b;
    public final int f20509c;
    public final g0 d;
    public final long f20510e;
    public final l1 f20511f;
    public final int f20512g;
    public final g0 h;
    public final long f20513i;
    public final long f20514j;

    public a(long j3, l1 l1Var, int i7, g0 g0Var, long j10, l1 l1Var2, int i10, g0 g0Var2, long j11, long j12) {
        this.f20507a = j3;
        this.f20508b = l1Var;
        this.f20509c = i7;
        this.d = g0Var;
        this.f20510e = j10;
        this.f20511f = l1Var2;
        this.f20512g = i10;
        this.h = g0Var2;
        this.f20513i = j11;
        this.f20514j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f20507a == aVar.f20507a && this.f20509c == aVar.f20509c && this.f20510e == aVar.f20510e && this.f20512g == aVar.f20512g && this.f20513i == aVar.f20513i && this.f20514j == aVar.f20514j && Objects.equals(this.f20508b, aVar.f20508b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f20511f, aVar.f20511f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f20507a), this.f20508b, Integer.valueOf(this.f20509c), this.d, Long.valueOf(this.f20510e), this.f20511f, Integer.valueOf(this.f20512g), this.h, Long.valueOf(this.f20513i), Long.valueOf(this.f20514j));
    }
}
