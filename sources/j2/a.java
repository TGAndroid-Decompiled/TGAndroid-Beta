package j2;

import b2.o1;
import j$.util.Objects;
import u2.h0;
public final class a {
    public final long f13973a;
    public final o1 f13974b;
    public final int f13975c;
    public final h0 d;
    public final long e;
    public final o1 f13976f;
    public final int f13977g;
    public final h0 h;
    public final long f13978i;
    public final long f13979j;

    public a(long j10, o1 o1Var, int i10, h0 h0Var, long j11, o1 o1Var2, int i11, h0 h0Var2, long j12, long j13) {
        this.f13973a = j10;
        this.f13974b = o1Var;
        this.f13975c = i10;
        this.d = h0Var;
        this.e = j11;
        this.f13976f = o1Var2;
        this.f13977g = i11;
        this.h = h0Var2;
        this.f13978i = j12;
        this.f13979j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13973a == aVar.f13973a && this.f13975c == aVar.f13975c && this.e == aVar.e && this.f13977g == aVar.f13977g && this.f13978i == aVar.f13978i && this.f13979j == aVar.f13979j && Objects.equals(this.f13974b, aVar.f13974b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13976f, aVar.f13976f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13973a), this.f13974b, Integer.valueOf(this.f13975c), this.d, Long.valueOf(this.e), this.f13976f, Integer.valueOf(this.f13977g), this.h, Long.valueOf(this.f13978i), Long.valueOf(this.f13979j));
    }
}
