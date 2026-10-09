package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f13677a;
    public final k1 f13678b;
    public final int f13679c;
    public final f0 d;
    public final long f13680e;
    public final k1 f13681f;
    public final int f13682g;
    public final f0 h;
    public final long f13683i;
    public final long f13684j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f13677a = j3;
        this.f13678b = k1Var;
        this.f13679c = i10;
        this.d = f0Var;
        this.f13680e = j10;
        this.f13681f = k1Var2;
        this.f13682g = i11;
        this.h = f0Var2;
        this.f13683i = j11;
        this.f13684j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13677a == aVar.f13677a && this.f13679c == aVar.f13679c && this.f13680e == aVar.f13680e && this.f13682g == aVar.f13682g && this.f13683i == aVar.f13683i && this.f13684j == aVar.f13684j && Objects.equals(this.f13678b, aVar.f13678b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13681f, aVar.f13681f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13677a), this.f13678b, Integer.valueOf(this.f13679c), this.d, Long.valueOf(this.f13680e), this.f13681f, Integer.valueOf(this.f13682g), this.h, Long.valueOf(this.f13683i), Long.valueOf(this.f13684j));
    }
}
