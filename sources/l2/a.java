package l2;

import d2.n1;
import j$.util.Objects;
import w2.g0;
public final class a {
    public final long f17679a;
    public final n1 f17680b;
    public final int f17681c;
    public final g0 d;
    public final long f17682e;
    public final n1 f17683f;
    public final int f17684g;
    public final g0 h;
    public final long f17685i;
    public final long f17686j;

    public a(long j10, n1 n1Var, int i3, g0 g0Var, long j11, n1 n1Var2, int i10, g0 g0Var2, long j12, long j13) {
        this.f17679a = j10;
        this.f17680b = n1Var;
        this.f17681c = i3;
        this.d = g0Var;
        this.f17682e = j11;
        this.f17683f = n1Var2;
        this.f17684g = i10;
        this.h = g0Var2;
        this.f17685i = j12;
        this.f17686j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f17679a == aVar.f17679a && this.f17681c == aVar.f17681c && this.f17682e == aVar.f17682e && this.f17684g == aVar.f17684g && this.f17685i == aVar.f17685i && this.f17686j == aVar.f17686j && Objects.equals(this.f17680b, aVar.f17680b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f17683f, aVar.f17683f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f17679a), this.f17680b, Integer.valueOf(this.f17681c), this.d, Long.valueOf(this.f17682e), this.f17683f, Integer.valueOf(this.f17684g), this.h, Long.valueOf(this.f17685i), Long.valueOf(this.f17686j));
    }
}
