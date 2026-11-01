package j2;

import b2.o1;
import j$.util.Objects;
import u2.g0;
public final class a {
    public final long f9336a;
    public final o1 f9337b;
    public final int f9338c;
    public final g0 d;
    public final long e;
    public final o1 f9339f;
    public final int f9340g;
    public final g0 h;
    public final long f9341i;
    public final long f9342j;

    public a(long j10, o1 o1Var, int i10, g0 g0Var, long j11, o1 o1Var2, int i11, g0 g0Var2, long j12, long j13) {
        this.f9336a = j10;
        this.f9337b = o1Var;
        this.f9338c = i10;
        this.d = g0Var;
        this.e = j11;
        this.f9339f = o1Var2;
        this.f9340g = i11;
        this.h = g0Var2;
        this.f9341i = j12;
        this.f9342j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9336a == aVar.f9336a && this.f9338c == aVar.f9338c && this.e == aVar.e && this.f9340g == aVar.f9340g && this.f9341i == aVar.f9341i && this.f9342j == aVar.f9342j && Objects.equals(this.f9337b, aVar.f9337b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f9339f, aVar.f9339f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9336a), this.f9337b, Integer.valueOf(this.f9338c), this.d, Long.valueOf(this.e), this.f9339f, Integer.valueOf(this.f9340g), this.h, Long.valueOf(this.f9341i), Long.valueOf(this.f9342j));
    }
}
