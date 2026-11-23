package n2;

import j$.util.Objects;
public final class n {
    public final int f21176a;
    public final int f21177b;
    public final int f21178c;
    public final boolean d;
    public final boolean f21179e;
    public final int f21180f;
    public final e2.e f21181g;
    public final int h;
    public final int f21182i;
    public final boolean f21183j;
    public final boolean f21184k;

    public n(m mVar) {
        this.f21176a = mVar.f21166a;
        this.f21177b = mVar.f21167b;
        this.f21178c = mVar.f21168c;
        this.d = mVar.d;
        this.f21179e = mVar.f21169e;
        this.f21180f = mVar.f21170f;
        this.f21181g = mVar.f21171g;
        this.h = mVar.h;
        this.f21182i = mVar.f21172i;
        this.f21183j = mVar.f21173j;
        this.f21184k = mVar.f21174k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f21166a = this.f21176a;
        obj.f21167b = this.f21177b;
        obj.f21168c = this.f21178c;
        obj.d = this.d;
        obj.f21169e = this.f21179e;
        obj.f21170f = this.f21180f;
        obj.f21171g = this.f21181g;
        obj.h = this.h;
        obj.f21172i = this.f21182i;
        obj.f21173j = this.f21183j;
        obj.f21174k = this.f21184k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f21176a == nVar.f21176a && this.f21177b == nVar.f21177b && this.f21178c == nVar.f21178c && this.d == nVar.d && this.f21179e == nVar.f21179e && this.f21180f == nVar.f21180f && this.h == nVar.h && this.f21182i == nVar.f21182i && this.f21183j == nVar.f21183j && this.f21184k == nVar.f21184k && this.f21181g.equals(nVar.f21181g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f21176a), Integer.valueOf(this.f21177b), Integer.valueOf(this.f21178c), Boolean.valueOf(this.d), Boolean.valueOf(this.f21179e), Integer.valueOf(this.f21180f), this.f21181g, Integer.valueOf(this.h), Integer.valueOf(this.f21182i), Boolean.valueOf(this.f21184k), Boolean.valueOf(this.f21183j));
    }
}
