package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f13676a;
    public final k1 f13677b;
    public final int f13678c;
    public final f0 d;
    public final long f13679e;
    public final k1 f13680f;
    public final int f13681g;
    public final f0 h;
    public final long f13682i;
    public final long f13683j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f13676a = j3;
        this.f13677b = k1Var;
        this.f13678c = i10;
        this.d = f0Var;
        this.f13679e = j10;
        this.f13680f = k1Var2;
        this.f13681g = i11;
        this.h = f0Var2;
        this.f13682i = j11;
        this.f13683j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13676a == aVar.f13676a && this.f13678c == aVar.f13678c && this.f13679e == aVar.f13679e && this.f13681g == aVar.f13681g && this.f13682i == aVar.f13682i && this.f13683j == aVar.f13683j && Objects.equals(this.f13677b, aVar.f13677b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13680f, aVar.f13680f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13676a), this.f13677b, Integer.valueOf(this.f13678c), this.d, Long.valueOf(this.f13679e), this.f13680f, Integer.valueOf(this.f13681g), this.h, Long.valueOf(this.f13682i), Long.valueOf(this.f13683j));
    }
}
