package j2;

import b2.p1;
import j$.util.Objects;
import u2.g0;
public final class a {
    public final long f12517a;
    public final p1 f12518b;
    public final int f12519c;
    public final g0 d;
    public final long e;
    public final p1 f12520f;
    public final int f12521g;
    public final g0 h;
    public final long f12522i;
    public final long f12523j;

    public a(long j10, p1 p1Var, int i10, g0 g0Var, long j11, p1 p1Var2, int i11, g0 g0Var2, long j12, long j13) {
        this.f12517a = j10;
        this.f12518b = p1Var;
        this.f12519c = i10;
        this.d = g0Var;
        this.e = j11;
        this.f12520f = p1Var2;
        this.f12521g = i11;
        this.h = g0Var2;
        this.f12522i = j12;
        this.f12523j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12517a == aVar.f12517a && this.f12519c == aVar.f12519c && this.e == aVar.e && this.f12521g == aVar.f12521g && this.f12522i == aVar.f12522i && this.f12523j == aVar.f12523j && Objects.equals(this.f12518b, aVar.f12518b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f12520f, aVar.f12520f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12517a), this.f12518b, Integer.valueOf(this.f12519c), this.d, Long.valueOf(this.e), this.f12520f, Integer.valueOf(this.f12521g), this.h, Long.valueOf(this.f12522i), Long.valueOf(this.f12523j));
    }
}
