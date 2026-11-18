package m2;

import e2.l1;
import j$.util.Objects;
import x2.g0;
public final class a {
    public final long f20476a;
    public final l1 f20477b;
    public final int f20478c;
    public final g0 d;
    public final long f20479e;
    public final l1 f20480f;
    public final int f20481g;
    public final g0 h;
    public final long f20482i;
    public final long f20483j;

    public a(long j3, l1 l1Var, int i7, g0 g0Var, long j10, l1 l1Var2, int i10, g0 g0Var2, long j11, long j12) {
        this.f20476a = j3;
        this.f20477b = l1Var;
        this.f20478c = i7;
        this.d = g0Var;
        this.f20479e = j10;
        this.f20480f = l1Var2;
        this.f20481g = i10;
        this.h = g0Var2;
        this.f20482i = j11;
        this.f20483j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f20476a == aVar.f20476a && this.f20478c == aVar.f20478c && this.f20479e == aVar.f20479e && this.f20481g == aVar.f20481g && this.f20482i == aVar.f20482i && this.f20483j == aVar.f20483j && Objects.equals(this.f20477b, aVar.f20477b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f20480f, aVar.f20480f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f20476a), this.f20477b, Integer.valueOf(this.f20478c), this.d, Long.valueOf(this.f20479e), this.f20480f, Integer.valueOf(this.f20481g), this.h, Long.valueOf(this.f20482i), Long.valueOf(this.f20483j));
    }
}
