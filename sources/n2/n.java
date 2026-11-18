package n2;

import j$.util.Objects;
public final class n {
    public final int f21182a;
    public final int f21183b;
    public final int f21184c;
    public final boolean d;
    public final boolean f21185e;
    public final int f21186f;
    public final e2.e f21187g;
    public final int h;
    public final int f21188i;
    public final boolean f21189j;
    public final boolean f21190k;

    public n(m mVar) {
        this.f21182a = mVar.f21172a;
        this.f21183b = mVar.f21173b;
        this.f21184c = mVar.f21174c;
        this.d = mVar.d;
        this.f21185e = mVar.f21175e;
        this.f21186f = mVar.f21176f;
        this.f21187g = mVar.f21177g;
        this.h = mVar.h;
        this.f21188i = mVar.f21178i;
        this.f21189j = mVar.f21179j;
        this.f21190k = mVar.f21180k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f21172a = this.f21182a;
        obj.f21173b = this.f21183b;
        obj.f21174c = this.f21184c;
        obj.d = this.d;
        obj.f21175e = this.f21185e;
        obj.f21176f = this.f21186f;
        obj.f21177g = this.f21187g;
        obj.h = this.h;
        obj.f21178i = this.f21188i;
        obj.f21179j = this.f21189j;
        obj.f21180k = this.f21190k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f21182a == nVar.f21182a && this.f21183b == nVar.f21183b && this.f21184c == nVar.f21184c && this.d == nVar.d && this.f21185e == nVar.f21185e && this.f21186f == nVar.f21186f && this.h == nVar.h && this.f21188i == nVar.f21188i && this.f21189j == nVar.f21189j && this.f21190k == nVar.f21190k && this.f21187g.equals(nVar.f21187g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f21182a), Integer.valueOf(this.f21183b), Integer.valueOf(this.f21184c), Boolean.valueOf(this.d), Boolean.valueOf(this.f21185e), Integer.valueOf(this.f21186f), this.f21187g, Integer.valueOf(this.h), Integer.valueOf(this.f21188i), Boolean.valueOf(this.f21190k), Boolean.valueOf(this.f21189j));
    }
}
