package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f12555a;
    public final k1 f12556b;
    public final int f12557c;
    public final f0 d;
    public final long e;
    public final k1 f12558f;
    public final int f12559g;
    public final f0 h;
    public final long f12560i;
    public final long f12561j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f12555a = j3;
        this.f12556b = k1Var;
        this.f12557c = i10;
        this.d = f0Var;
        this.e = j10;
        this.f12558f = k1Var2;
        this.f12559g = i11;
        this.h = f0Var2;
        this.f12560i = j11;
        this.f12561j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12555a == aVar.f12555a && this.f12557c == aVar.f12557c && this.e == aVar.e && this.f12559g == aVar.f12559g && this.f12560i == aVar.f12560i && this.f12561j == aVar.f12561j && Objects.equals(this.f12556b, aVar.f12556b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f12558f, aVar.f12558f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12555a), this.f12556b, Integer.valueOf(this.f12557c), this.d, Long.valueOf(this.e), this.f12558f, Integer.valueOf(this.f12559g), this.h, Long.valueOf(this.f12560i), Long.valueOf(this.f12561j));
    }
}
