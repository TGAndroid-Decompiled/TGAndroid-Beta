package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f13639a;
    public final k1 f13640b;
    public final int f13641c;
    public final f0 d;
    public final long f13642e;
    public final k1 f13643f;
    public final int f13644g;
    public final f0 h;
    public final long f13645i;
    public final long f13646j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f13639a = j3;
        this.f13640b = k1Var;
        this.f13641c = i10;
        this.d = f0Var;
        this.f13642e = j10;
        this.f13643f = k1Var2;
        this.f13644g = i11;
        this.h = f0Var2;
        this.f13645i = j11;
        this.f13646j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13639a == aVar.f13639a && this.f13641c == aVar.f13641c && this.f13642e == aVar.f13642e && this.f13644g == aVar.f13644g && this.f13645i == aVar.f13645i && this.f13646j == aVar.f13646j && Objects.equals(this.f13640b, aVar.f13640b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13643f, aVar.f13643f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13639a), this.f13640b, Integer.valueOf(this.f13641c), this.d, Long.valueOf(this.f13642e), this.f13643f, Integer.valueOf(this.f13644g), this.h, Long.valueOf(this.f13645i), Long.valueOf(this.f13646j));
    }
}
