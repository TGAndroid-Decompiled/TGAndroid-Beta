package j2;

import b2.o1;
import j$.util.Objects;
import u2.f0;
public final class a {
    public final long f13929a;
    public final o1 f13930b;
    public final int f13931c;
    public final f0 d;
    public final long e;
    public final o1 f13932f;
    public final int f13933g;
    public final f0 h;
    public final long f13934i;
    public final long f13935j;

    public a(long j10, o1 o1Var, int i10, f0 f0Var, long j11, o1 o1Var2, int i11, f0 f0Var2, long j12, long j13) {
        this.f13929a = j10;
        this.f13930b = o1Var;
        this.f13931c = i10;
        this.d = f0Var;
        this.e = j11;
        this.f13932f = o1Var2;
        this.f13933g = i11;
        this.h = f0Var2;
        this.f13934i = j12;
        this.f13935j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13929a == aVar.f13929a && this.f13931c == aVar.f13931c && this.e == aVar.e && this.f13933g == aVar.f13933g && this.f13934i == aVar.f13934i && this.f13935j == aVar.f13935j && Objects.equals(this.f13930b, aVar.f13930b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13932f, aVar.f13932f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13929a), this.f13930b, Integer.valueOf(this.f13931c), this.d, Long.valueOf(this.e), this.f13932f, Integer.valueOf(this.f13933g), this.h, Long.valueOf(this.f13934i), Long.valueOf(this.f13935j));
    }
}
