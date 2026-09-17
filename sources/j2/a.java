package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f12563a;
    public final k1 f12564b;
    public final int f12565c;
    public final f0 d;
    public final long e;
    public final k1 f12566f;
    public final int f12567g;
    public final f0 h;
    public final long f12568i;
    public final long f12569j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f12563a = j3;
        this.f12564b = k1Var;
        this.f12565c = i10;
        this.d = f0Var;
        this.e = j10;
        this.f12566f = k1Var2;
        this.f12567g = i11;
        this.h = f0Var2;
        this.f12568i = j11;
        this.f12569j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12563a == aVar.f12563a && this.f12565c == aVar.f12565c && this.e == aVar.e && this.f12567g == aVar.f12567g && this.f12568i == aVar.f12568i && this.f12569j == aVar.f12569j && Objects.equals(this.f12564b, aVar.f12564b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f12566f, aVar.f12566f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12563a), this.f12564b, Integer.valueOf(this.f12565c), this.d, Long.valueOf(this.e), this.f12566f, Integer.valueOf(this.f12567g), this.h, Long.valueOf(this.f12568i), Long.valueOf(this.f12569j));
    }
}
