package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f12564a;
    public final k1 f12565b;
    public final int f12566c;
    public final f0 d;
    public final long e;
    public final k1 f12567f;
    public final int f12568g;
    public final f0 h;
    public final long f12569i;
    public final long f12570j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f12564a = j3;
        this.f12565b = k1Var;
        this.f12566c = i10;
        this.d = f0Var;
        this.e = j10;
        this.f12567f = k1Var2;
        this.f12568g = i11;
        this.h = f0Var2;
        this.f12569i = j11;
        this.f12570j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12564a == aVar.f12564a && this.f12566c == aVar.f12566c && this.e == aVar.e && this.f12568g == aVar.f12568g && this.f12569i == aVar.f12569i && this.f12570j == aVar.f12570j && Objects.equals(this.f12565b, aVar.f12565b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f12567f, aVar.f12567f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12564a), this.f12565b, Integer.valueOf(this.f12566c), this.d, Long.valueOf(this.e), this.f12567f, Integer.valueOf(this.f12568g), this.h, Long.valueOf(this.f12569i), Long.valueOf(this.f12570j));
    }
}
