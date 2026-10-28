package j2;

import b2.p1;
import j$.util.Objects;
import u2.g0;
public final class a {
    public final long f15185a;
    public final p1 f15186b;
    public final int f15187c;
    public final g0 d;
    public final long e;
    public final p1 f15188f;
    public final int f15189g;
    public final g0 h;
    public final long f15190i;
    public final long f15191j;

    public a(long j10, p1 p1Var, int i10, g0 g0Var, long j11, p1 p1Var2, int i11, g0 g0Var2, long j12, long j13) {
        this.f15185a = j10;
        this.f15186b = p1Var;
        this.f15187c = i10;
        this.d = g0Var;
        this.e = j11;
        this.f15188f = p1Var2;
        this.f15189g = i11;
        this.h = g0Var2;
        this.f15190i = j12;
        this.f15191j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f15185a == aVar.f15185a && this.f15187c == aVar.f15187c && this.e == aVar.e && this.f15189g == aVar.f15189g && this.f15190i == aVar.f15190i && this.f15191j == aVar.f15191j && Objects.equals(this.f15186b, aVar.f15186b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f15188f, aVar.f15188f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f15185a), this.f15186b, Integer.valueOf(this.f15187c), this.d, Long.valueOf(this.e), this.f15188f, Integer.valueOf(this.f15189g), this.h, Long.valueOf(this.f15190i), Long.valueOf(this.f15191j));
    }
}
