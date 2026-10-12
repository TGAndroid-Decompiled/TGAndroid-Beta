package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f13674a;
    public final k1 f13675b;
    public final int f13676c;
    public final f0 d;
    public final long f13677e;
    public final k1 f13678f;
    public final int f13679g;
    public final f0 h;
    public final long f13680i;
    public final long f13681j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f13674a = j3;
        this.f13675b = k1Var;
        this.f13676c = i10;
        this.d = f0Var;
        this.f13677e = j10;
        this.f13678f = k1Var2;
        this.f13679g = i11;
        this.h = f0Var2;
        this.f13680i = j11;
        this.f13681j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13674a == aVar.f13674a && this.f13676c == aVar.f13676c && this.f13677e == aVar.f13677e && this.f13679g == aVar.f13679g && this.f13680i == aVar.f13680i && this.f13681j == aVar.f13681j && Objects.equals(this.f13675b, aVar.f13675b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13678f, aVar.f13678f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13674a), this.f13675b, Integer.valueOf(this.f13676c), this.d, Long.valueOf(this.f13677e), this.f13678f, Integer.valueOf(this.f13679g), this.h, Long.valueOf(this.f13680i), Long.valueOf(this.f13681j));
    }
}
