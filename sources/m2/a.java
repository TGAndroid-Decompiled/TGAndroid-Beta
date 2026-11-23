package m2;

import e2.l1;
import j$.util.Objects;
import x2.g0;
public final class a {
    public final long f20473a;
    public final l1 f20474b;
    public final int f20475c;
    public final g0 d;
    public final long f20476e;
    public final l1 f20477f;
    public final int f20478g;
    public final g0 h;
    public final long f20479i;
    public final long f20480j;

    public a(long j3, l1 l1Var, int i7, g0 g0Var, long j10, l1 l1Var2, int i10, g0 g0Var2, long j11, long j12) {
        this.f20473a = j3;
        this.f20474b = l1Var;
        this.f20475c = i7;
        this.d = g0Var;
        this.f20476e = j10;
        this.f20477f = l1Var2;
        this.f20478g = i10;
        this.h = g0Var2;
        this.f20479i = j11;
        this.f20480j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f20473a == aVar.f20473a && this.f20475c == aVar.f20475c && this.f20476e == aVar.f20476e && this.f20478g == aVar.f20478g && this.f20479i == aVar.f20479i && this.f20480j == aVar.f20480j && Objects.equals(this.f20474b, aVar.f20474b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f20477f, aVar.f20477f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f20473a), this.f20474b, Integer.valueOf(this.f20475c), this.d, Long.valueOf(this.f20476e), this.f20477f, Integer.valueOf(this.f20478g), this.h, Long.valueOf(this.f20479i), Long.valueOf(this.f20480j));
    }
}
