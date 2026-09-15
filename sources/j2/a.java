package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f12560a;
    public final k1 f12561b;
    public final int f12562c;
    public final f0 d;
    public final long e;
    public final k1 f12563f;
    public final int f12564g;
    public final f0 h;
    public final long f12565i;
    public final long f12566j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f12560a = j3;
        this.f12561b = k1Var;
        this.f12562c = i10;
        this.d = f0Var;
        this.e = j10;
        this.f12563f = k1Var2;
        this.f12564g = i11;
        this.h = f0Var2;
        this.f12565i = j11;
        this.f12566j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12560a == aVar.f12560a && this.f12562c == aVar.f12562c && this.e == aVar.e && this.f12564g == aVar.f12564g && this.f12565i == aVar.f12565i && this.f12566j == aVar.f12566j && Objects.equals(this.f12561b, aVar.f12561b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f12563f, aVar.f12563f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12560a), this.f12561b, Integer.valueOf(this.f12562c), this.d, Long.valueOf(this.e), this.f12563f, Integer.valueOf(this.f12564g), this.h, Long.valueOf(this.f12565i), Long.valueOf(this.f12566j));
    }
}
