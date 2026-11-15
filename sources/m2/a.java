package m2;

import e2.l1;
import j$.util.Objects;
import x2.f0;
public final class a {
    public final long f20112a;
    public final l1 f20113b;
    public final int f20114c;
    public final f0 d;
    public final long f20115e;
    public final l1 f20116f;
    public final int f20117g;
    public final f0 h;
    public final long f20118i;
    public final long f20119j;

    public a(long j3, l1 l1Var, int i7, f0 f0Var, long j10, l1 l1Var2, int i10, f0 f0Var2, long j11, long j12) {
        this.f20112a = j3;
        this.f20113b = l1Var;
        this.f20114c = i7;
        this.d = f0Var;
        this.f20115e = j10;
        this.f20116f = l1Var2;
        this.f20117g = i10;
        this.h = f0Var2;
        this.f20118i = j11;
        this.f20119j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f20112a == aVar.f20112a && this.f20114c == aVar.f20114c && this.f20115e == aVar.f20115e && this.f20117g == aVar.f20117g && this.f20118i == aVar.f20118i && this.f20119j == aVar.f20119j && Objects.equals(this.f20113b, aVar.f20113b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f20116f, aVar.f20116f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f20112a), this.f20113b, Integer.valueOf(this.f20114c), this.d, Long.valueOf(this.f20115e), this.f20116f, Integer.valueOf(this.f20117g), this.h, Long.valueOf(this.f20118i), Long.valueOf(this.f20119j));
    }
}
