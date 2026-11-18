package n2;

import j$.util.Objects;
public final class n {
    public final int f21179a;
    public final int f21180b;
    public final int f21181c;
    public final boolean d;
    public final boolean f21182e;
    public final int f21183f;
    public final e2.e f21184g;
    public final int h;
    public final int f21185i;
    public final boolean f21186j;
    public final boolean f21187k;

    public n(m mVar) {
        this.f21179a = mVar.f21169a;
        this.f21180b = mVar.f21170b;
        this.f21181c = mVar.f21171c;
        this.d = mVar.d;
        this.f21182e = mVar.f21172e;
        this.f21183f = mVar.f21173f;
        this.f21184g = mVar.f21174g;
        this.h = mVar.h;
        this.f21185i = mVar.f21175i;
        this.f21186j = mVar.f21176j;
        this.f21187k = mVar.f21177k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f21169a = this.f21179a;
        obj.f21170b = this.f21180b;
        obj.f21171c = this.f21181c;
        obj.d = this.d;
        obj.f21172e = this.f21182e;
        obj.f21173f = this.f21183f;
        obj.f21174g = this.f21184g;
        obj.h = this.h;
        obj.f21175i = this.f21185i;
        obj.f21176j = this.f21186j;
        obj.f21177k = this.f21187k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f21179a == nVar.f21179a && this.f21180b == nVar.f21180b && this.f21181c == nVar.f21181c && this.d == nVar.d && this.f21182e == nVar.f21182e && this.f21183f == nVar.f21183f && this.h == nVar.h && this.f21185i == nVar.f21185i && this.f21186j == nVar.f21186j && this.f21187k == nVar.f21187k && this.f21184g.equals(nVar.f21184g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f21179a), Integer.valueOf(this.f21180b), Integer.valueOf(this.f21181c), Boolean.valueOf(this.d), Boolean.valueOf(this.f21182e), Integer.valueOf(this.f21183f), this.f21184g, Integer.valueOf(this.h), Integer.valueOf(this.f21185i), Boolean.valueOf(this.f21187k), Boolean.valueOf(this.f21186j));
    }
}
