package j2;

import b2.p1;
import j$.util.Objects;
import u2.g0;
public final class a {
    public final long f12513a;
    public final p1 f12514b;
    public final int f12515c;
    public final g0 d;
    public final long e;
    public final p1 f12516f;
    public final int f12517g;
    public final g0 h;
    public final long f12518i;
    public final long f12519j;

    public a(long j10, p1 p1Var, int i10, g0 g0Var, long j11, p1 p1Var2, int i11, g0 g0Var2, long j12, long j13) {
        this.f12513a = j10;
        this.f12514b = p1Var;
        this.f12515c = i10;
        this.d = g0Var;
        this.e = j11;
        this.f12516f = p1Var2;
        this.f12517g = i11;
        this.h = g0Var2;
        this.f12518i = j12;
        this.f12519j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12513a == aVar.f12513a && this.f12515c == aVar.f12515c && this.e == aVar.e && this.f12517g == aVar.f12517g && this.f12518i == aVar.f12518i && this.f12519j == aVar.f12519j && Objects.equals(this.f12514b, aVar.f12514b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f12516f, aVar.f12516f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12513a), this.f12514b, Integer.valueOf(this.f12515c), this.d, Long.valueOf(this.e), this.f12516f, Integer.valueOf(this.f12517g), this.h, Long.valueOf(this.f12518i), Long.valueOf(this.f12519j));
    }
}
