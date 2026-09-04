package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f13163a;
    public final k1 f13164b;
    public final int f13165c;
    public final f0 d;
    public final long f13166e;
    public final k1 f13167f;
    public final int f13168g;
    public final f0 h;
    public final long f13169i;
    public final long f13170j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f13163a = j3;
        this.f13164b = k1Var;
        this.f13165c = i10;
        this.d = f0Var;
        this.f13166e = j10;
        this.f13167f = k1Var2;
        this.f13168g = i11;
        this.h = f0Var2;
        this.f13169i = j11;
        this.f13170j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13163a == aVar.f13163a && this.f13165c == aVar.f13165c && this.f13166e == aVar.f13166e && this.f13168g == aVar.f13168g && this.f13169i == aVar.f13169i && this.f13170j == aVar.f13170j && Objects.equals(this.f13164b, aVar.f13164b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13167f, aVar.f13167f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13163a), this.f13164b, Integer.valueOf(this.f13165c), this.d, Long.valueOf(this.f13166e), this.f13167f, Integer.valueOf(this.f13168g), this.h, Long.valueOf(this.f13169i), Long.valueOf(this.f13170j));
    }
}
