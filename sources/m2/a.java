package m2;

import e2.l1;
import j$.util.Objects;
import x2.f0;
public final class a {
    public final long f19523a;
    public final l1 f19524b;
    public final int f19525c;
    public final f0 d;
    public final long f19526e;
    public final l1 f19527f;
    public final int f19528g;
    public final f0 h;
    public final long f19529i;
    public final long f19530j;

    public a(long j3, l1 l1Var, int i7, f0 f0Var, long j10, l1 l1Var2, int i10, f0 f0Var2, long j11, long j12) {
        this.f19523a = j3;
        this.f19524b = l1Var;
        this.f19525c = i7;
        this.d = f0Var;
        this.f19526e = j10;
        this.f19527f = l1Var2;
        this.f19528g = i10;
        this.h = f0Var2;
        this.f19529i = j11;
        this.f19530j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f19523a == aVar.f19523a && this.f19525c == aVar.f19525c && this.f19526e == aVar.f19526e && this.f19528g == aVar.f19528g && this.f19529i == aVar.f19529i && this.f19530j == aVar.f19530j && Objects.equals(this.f19524b, aVar.f19524b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f19527f, aVar.f19527f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19523a), this.f19524b, Integer.valueOf(this.f19525c), this.d, Long.valueOf(this.f19526e), this.f19527f, Integer.valueOf(this.f19528g), this.h, Long.valueOf(this.f19529i), Long.valueOf(this.f19530j));
    }
}
