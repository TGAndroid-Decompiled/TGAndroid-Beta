package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f12562a;
    public final k1 f12563b;
    public final int f12564c;
    public final f0 d;
    public final long e;
    public final k1 f12565f;
    public final int f12566g;
    public final f0 h;
    public final long f12567i;
    public final long f12568j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.f12562a = j3;
        this.f12563b = k1Var;
        this.f12564c = i10;
        this.d = f0Var;
        this.e = j10;
        this.f12565f = k1Var2;
        this.f12566g = i11;
        this.h = f0Var2;
        this.f12567i = j11;
        this.f12568j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12562a == aVar.f12562a && this.f12564c == aVar.f12564c && this.e == aVar.e && this.f12566g == aVar.f12566g && this.f12567i == aVar.f12567i && this.f12568j == aVar.f12568j && Objects.equals(this.f12563b, aVar.f12563b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f12565f, aVar.f12565f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12562a), this.f12563b, Integer.valueOf(this.f12564c), this.d, Long.valueOf(this.e), this.f12565f, Integer.valueOf(this.f12566g), this.h, Long.valueOf(this.f12567i), Long.valueOf(this.f12568j));
    }
}
