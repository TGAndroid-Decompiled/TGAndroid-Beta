package j2;

import b2.k1;
import j$.util.Objects;
import u2.g0;
public final class a {
    public final long f11451a;
    public final k1 f11452b;
    public final int f11453c;
    public final g0 d;
    public final long e;
    public final k1 f11454f;
    public final int f11455g;
    public final g0 h;
    public final long f11456i;
    public final long f11457j;

    public a(long j3, k1 k1Var, int i10, g0 g0Var, long j10, k1 k1Var2, int i11, g0 g0Var2, long j11, long j12) {
        this.f11451a = j3;
        this.f11452b = k1Var;
        this.f11453c = i10;
        this.d = g0Var;
        this.e = j10;
        this.f11454f = k1Var2;
        this.f11455g = i11;
        this.h = g0Var2;
        this.f11456i = j11;
        this.f11457j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f11451a == aVar.f11451a && this.f11453c == aVar.f11453c && this.e == aVar.e && this.f11455g == aVar.f11455g && this.f11456i == aVar.f11456i && this.f11457j == aVar.f11457j && Objects.equals(this.f11452b, aVar.f11452b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f11454f, aVar.f11454f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11451a), this.f11452b, Integer.valueOf(this.f11453c), this.d, Long.valueOf(this.e), this.f11454f, Integer.valueOf(this.f11455g), this.h, Long.valueOf(this.f11456i), Long.valueOf(this.f11457j));
    }
}
