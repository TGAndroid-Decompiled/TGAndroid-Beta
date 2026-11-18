package m2;

import e2.l1;
import j$.util.Objects;
import x2.g0;
public final class a {
    public final long f20479a;
    public final l1 f20480b;
    public final int f20481c;
    public final g0 d;
    public final long f20482e;
    public final l1 f20483f;
    public final int f20484g;
    public final g0 h;
    public final long f20485i;
    public final long f20486j;

    public a(long j3, l1 l1Var, int i7, g0 g0Var, long j10, l1 l1Var2, int i10, g0 g0Var2, long j11, long j12) {
        this.f20479a = j3;
        this.f20480b = l1Var;
        this.f20481c = i7;
        this.d = g0Var;
        this.f20482e = j10;
        this.f20483f = l1Var2;
        this.f20484g = i10;
        this.h = g0Var2;
        this.f20485i = j11;
        this.f20486j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f20479a == aVar.f20479a && this.f20481c == aVar.f20481c && this.f20482e == aVar.f20482e && this.f20484g == aVar.f20484g && this.f20485i == aVar.f20485i && this.f20486j == aVar.f20486j && Objects.equals(this.f20480b, aVar.f20480b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f20483f, aVar.f20483f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f20479a), this.f20480b, Integer.valueOf(this.f20481c), this.d, Long.valueOf(this.f20482e), this.f20483f, Integer.valueOf(this.f20484g), this.h, Long.valueOf(this.f20485i), Long.valueOf(this.f20486j));
    }
}
