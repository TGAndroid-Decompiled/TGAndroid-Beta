package n2;

import j$.util.Objects;
public final class n {
    public final int f21210a;
    public final int f21211b;
    public final int f21212c;
    public final boolean d;
    public final boolean f21213e;
    public final int f21214f;
    public final e2.e f21215g;
    public final int h;
    public final int f21216i;
    public final boolean f21217j;
    public final boolean f21218k;

    public n(m mVar) {
        this.f21210a = mVar.f21200a;
        this.f21211b = mVar.f21201b;
        this.f21212c = mVar.f21202c;
        this.d = mVar.d;
        this.f21213e = mVar.f21203e;
        this.f21214f = mVar.f21204f;
        this.f21215g = mVar.f21205g;
        this.h = mVar.h;
        this.f21216i = mVar.f21206i;
        this.f21217j = mVar.f21207j;
        this.f21218k = mVar.f21208k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f21200a = this.f21210a;
        obj.f21201b = this.f21211b;
        obj.f21202c = this.f21212c;
        obj.d = this.d;
        obj.f21203e = this.f21213e;
        obj.f21204f = this.f21214f;
        obj.f21205g = this.f21215g;
        obj.h = this.h;
        obj.f21206i = this.f21216i;
        obj.f21207j = this.f21217j;
        obj.f21208k = this.f21218k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f21210a == nVar.f21210a && this.f21211b == nVar.f21211b && this.f21212c == nVar.f21212c && this.d == nVar.d && this.f21213e == nVar.f21213e && this.f21214f == nVar.f21214f && this.h == nVar.h && this.f21216i == nVar.f21216i && this.f21217j == nVar.f21217j && this.f21218k == nVar.f21218k && this.f21215g.equals(nVar.f21215g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f21210a), Integer.valueOf(this.f21211b), Integer.valueOf(this.f21212c), Boolean.valueOf(this.d), Boolean.valueOf(this.f21213e), Integer.valueOf(this.f21214f), this.f21215g, Integer.valueOf(this.h), Integer.valueOf(this.f21216i), Boolean.valueOf(this.f21218k), Boolean.valueOf(this.f21217j));
    }
}
