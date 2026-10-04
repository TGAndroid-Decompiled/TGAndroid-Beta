package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f13640a;
    public final k1 f13641b;
    public final int f13642c;
    public final f0 d;
    public final long f13643e;
    public final k1 f13644f;
    public final int f13645g;
    public final f0 h;
    public final long f13646i;
    public final long f13647j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f13640a = j3;
        this.f13641b = k1Var;
        this.f13642c = i10;
        this.d = f0Var;
        this.f13643e = j10;
        this.f13644f = k1Var2;
        this.f13645g = i11;
        this.h = f0Var2;
        this.f13646i = j11;
        this.f13647j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13640a == aVar.f13640a && this.f13642c == aVar.f13642c && this.f13643e == aVar.f13643e && this.f13645g == aVar.f13645g && this.f13646i == aVar.f13646i && this.f13647j == aVar.f13647j && Objects.equals(this.f13641b, aVar.f13641b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13644f, aVar.f13644f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13640a), this.f13641b, Integer.valueOf(this.f13642c), this.d, Long.valueOf(this.f13643e), this.f13644f, Integer.valueOf(this.f13645g), this.h, Long.valueOf(this.f13646i), Long.valueOf(this.f13647j));
    }
}
