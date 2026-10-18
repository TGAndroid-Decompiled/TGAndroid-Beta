package j2;

import b2.o1;
import j$.util.Objects;
import u2.g0;
public final class a {
    public final long f13927a;
    public final o1 f13928b;
    public final int f13929c;
    public final g0 d;
    public final long e;
    public final o1 f13930f;
    public final int f13931g;
    public final g0 h;
    public final long f13932i;
    public final long f13933j;

    public a(long j10, o1 o1Var, int i10, g0 g0Var, long j11, o1 o1Var2, int i11, g0 g0Var2, long j12, long j13) {
        this.f13927a = j10;
        this.f13928b = o1Var;
        this.f13929c = i10;
        this.d = g0Var;
        this.e = j11;
        this.f13930f = o1Var2;
        this.f13931g = i11;
        this.h = g0Var2;
        this.f13932i = j12;
        this.f13933j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13927a == aVar.f13927a && this.f13929c == aVar.f13929c && this.e == aVar.e && this.f13931g == aVar.f13931g && this.f13932i == aVar.f13932i && this.f13933j == aVar.f13933j && Objects.equals(this.f13928b, aVar.f13928b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13930f, aVar.f13930f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13927a), this.f13928b, Integer.valueOf(this.f13929c), this.d, Long.valueOf(this.e), this.f13930f, Integer.valueOf(this.f13931g), this.h, Long.valueOf(this.f13932i), Long.valueOf(this.f13933j));
    }
}
