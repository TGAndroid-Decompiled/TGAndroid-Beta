package j2;

import b2.o1;
import j$.util.Objects;
import u2.g0;
public final class a {
    public final long f9335a;
    public final o1 f9336b;
    public final int f9337c;
    public final g0 d;
    public final long e;
    public final o1 f9338f;
    public final int f9339g;
    public final g0 h;
    public final long f9340i;
    public final long f9341j;

    public a(long j10, o1 o1Var, int i10, g0 g0Var, long j11, o1 o1Var2, int i11, g0 g0Var2, long j12, long j13) {
        this.f9335a = j10;
        this.f9336b = o1Var;
        this.f9337c = i10;
        this.d = g0Var;
        this.e = j11;
        this.f9338f = o1Var2;
        this.f9339g = i11;
        this.h = g0Var2;
        this.f9340i = j12;
        this.f9341j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9335a == aVar.f9335a && this.f9337c == aVar.f9337c && this.e == aVar.e && this.f9339g == aVar.f9339g && this.f9340i == aVar.f9340i && this.f9341j == aVar.f9341j && Objects.equals(this.f9336b, aVar.f9336b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f9338f, aVar.f9338f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9335a), this.f9336b, Integer.valueOf(this.f9337c), this.d, Long.valueOf(this.e), this.f9338f, Integer.valueOf(this.f9339g), this.h, Long.valueOf(this.f9340i), Long.valueOf(this.f9341j));
    }
}
