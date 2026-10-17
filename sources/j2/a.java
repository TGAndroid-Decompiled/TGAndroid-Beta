package j2;

import b2.o1;
import j$.util.Objects;
import u2.g0;
public final class a {
    public final long f13922a;
    public final o1 f13923b;
    public final int f13924c;
    public final g0 d;
    public final long e;
    public final o1 f13925f;
    public final int f13926g;
    public final g0 h;
    public final long f13927i;
    public final long f13928j;

    public a(long j10, o1 o1Var, int i10, g0 g0Var, long j11, o1 o1Var2, int i11, g0 g0Var2, long j12, long j13) {
        this.f13922a = j10;
        this.f13923b = o1Var;
        this.f13924c = i10;
        this.d = g0Var;
        this.e = j11;
        this.f13925f = o1Var2;
        this.f13926g = i11;
        this.h = g0Var2;
        this.f13927i = j12;
        this.f13928j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13922a == aVar.f13922a && this.f13924c == aVar.f13924c && this.e == aVar.e && this.f13926g == aVar.f13926g && this.f13927i == aVar.f13927i && this.f13928j == aVar.f13928j && Objects.equals(this.f13923b, aVar.f13923b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f13925f, aVar.f13925f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13922a), this.f13923b, Integer.valueOf(this.f13924c), this.d, Long.valueOf(this.e), this.f13925f, Integer.valueOf(this.f13926g), this.h, Long.valueOf(this.f13927i), Long.valueOf(this.f13928j));
    }
}
