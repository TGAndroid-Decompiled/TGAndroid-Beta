package j2;

import b2.p1;
import j$.util.Objects;
import u2.g0;
public final class a {
    public final long f15186a;
    public final p1 f15187b;
    public final int f15188c;
    public final g0 d;
    public final long e;
    public final p1 f15189f;
    public final int f15190g;
    public final g0 h;
    public final long f15191i;
    public final long f15192j;

    public a(long j10, p1 p1Var, int i10, g0 g0Var, long j11, p1 p1Var2, int i11, g0 g0Var2, long j12, long j13) {
        this.f15186a = j10;
        this.f15187b = p1Var;
        this.f15188c = i10;
        this.d = g0Var;
        this.e = j11;
        this.f15189f = p1Var2;
        this.f15190g = i11;
        this.h = g0Var2;
        this.f15191i = j12;
        this.f15192j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f15186a == aVar.f15186a && this.f15188c == aVar.f15188c && this.e == aVar.e && this.f15190g == aVar.f15190g && this.f15191i == aVar.f15191i && this.f15192j == aVar.f15192j && Objects.equals(this.f15187b, aVar.f15187b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f15189f, aVar.f15189f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f15186a), this.f15187b, Integer.valueOf(this.f15188c), this.d, Long.valueOf(this.e), this.f15189f, Integer.valueOf(this.f15190g), this.h, Long.valueOf(this.f15191i), Long.valueOf(this.f15192j));
    }
}
