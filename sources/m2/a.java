package m2;

import e2.l1;
import j$.util.Objects;
import x2.g0;
public final class a {
    public final long f20569a;
    public final l1 f20570b;
    public final int f20571c;
    public final g0 d;
    public final long f20572e;
    public final l1 f20573f;
    public final int f20574g;
    public final g0 h;
    public final long f20575i;
    public final long f20576j;

    public a(long j3, l1 l1Var, int i7, g0 g0Var, long j10, l1 l1Var2, int i10, g0 g0Var2, long j11, long j12) {
        this.f20569a = j3;
        this.f20570b = l1Var;
        this.f20571c = i7;
        this.d = g0Var;
        this.f20572e = j10;
        this.f20573f = l1Var2;
        this.f20574g = i10;
        this.h = g0Var2;
        this.f20575i = j11;
        this.f20576j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f20569a == aVar.f20569a && this.f20571c == aVar.f20571c && this.f20572e == aVar.f20572e && this.f20574g == aVar.f20574g && this.f20575i == aVar.f20575i && this.f20576j == aVar.f20576j && Objects.equals(this.f20570b, aVar.f20570b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f20573f, aVar.f20573f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f20569a), this.f20570b, Integer.valueOf(this.f20571c), this.d, Long.valueOf(this.f20572e), this.f20573f, Integer.valueOf(this.f20574g), this.h, Long.valueOf(this.f20575i), Long.valueOf(this.f20576j));
    }
}
