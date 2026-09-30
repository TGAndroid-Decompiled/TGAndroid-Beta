package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f12552a;
    public final k1 f12553b;
    public final int f12554c;
    public final f0 d;
    public final long e;
    public final k1 f12555f;
    public final int f12556g;
    public final f0 h;
    public final long f12557i;
    public final long f12558j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f12552a = j3;
        this.f12553b = k1Var;
        this.f12554c = i10;
        this.d = f0Var;
        this.e = j10;
        this.f12555f = k1Var2;
        this.f12556g = i11;
        this.h = f0Var2;
        this.f12557i = j11;
        this.f12558j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12552a == aVar.f12552a && this.f12554c == aVar.f12554c && this.e == aVar.e && this.f12556g == aVar.f12556g && this.f12557i == aVar.f12557i && this.f12558j == aVar.f12558j && Objects.equals(this.f12553b, aVar.f12553b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f12555f, aVar.f12555f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12552a), this.f12553b, Integer.valueOf(this.f12554c), this.d, Long.valueOf(this.e), this.f12555f, Integer.valueOf(this.f12556g), this.h, Long.valueOf(this.f12557i), Long.valueOf(this.f12558j));
    }
}
