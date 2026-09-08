package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f13189a;
    public final k1 f13190b;
    public final int f13191c;
    public final f0 d;
    public final long f13192e;
    public final k1 f13193f;
    public final int f13194g;
    public final f0 h;
    public final long f13195i;
    public final long f13196j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f13189a = j3;
        this.f13190b = k1Var;
        this.f13191c = i10;
        this.d = f0Var;
        this.f13192e = j10;
        this.f13193f = k1Var2;
        this.f13194g = i11;
        this.h = f0Var2;
        this.f13195i = j11;
        this.f13196j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13189a == aVar.f13189a && this.f13191c == aVar.f13191c && this.f13192e == aVar.f13192e && this.f13194g == aVar.f13194g && this.f13195i == aVar.f13195i && this.f13196j == aVar.f13196j && Objects.equals(this.f13190b, aVar.f13190b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13193f, aVar.f13193f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13189a), this.f13190b, Integer.valueOf(this.f13191c), this.d, Long.valueOf(this.f13192e), this.f13193f, Integer.valueOf(this.f13194g), this.h, Long.valueOf(this.f13195i), Long.valueOf(this.f13196j));
    }
}
