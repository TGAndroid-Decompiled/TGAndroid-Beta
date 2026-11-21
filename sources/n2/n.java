package n2;

import j$.util.Objects;
public final class n {
    public final int f21207a;
    public final int f21208b;
    public final int f21209c;
    public final boolean d;
    public final boolean f21210e;
    public final int f21211f;
    public final e2.e f21212g;
    public final int h;
    public final int f21213i;
    public final boolean f21214j;
    public final boolean f21215k;

    public n(m mVar) {
        this.f21207a = mVar.f21197a;
        this.f21208b = mVar.f21198b;
        this.f21209c = mVar.f21199c;
        this.d = mVar.d;
        this.f21210e = mVar.f21200e;
        this.f21211f = mVar.f21201f;
        this.f21212g = mVar.f21202g;
        this.h = mVar.h;
        this.f21213i = mVar.f21203i;
        this.f21214j = mVar.f21204j;
        this.f21215k = mVar.f21205k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f21197a = this.f21207a;
        obj.f21198b = this.f21208b;
        obj.f21199c = this.f21209c;
        obj.d = this.d;
        obj.f21200e = this.f21210e;
        obj.f21201f = this.f21211f;
        obj.f21202g = this.f21212g;
        obj.h = this.h;
        obj.f21203i = this.f21213i;
        obj.f21204j = this.f21214j;
        obj.f21205k = this.f21215k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f21207a == nVar.f21207a && this.f21208b == nVar.f21208b && this.f21209c == nVar.f21209c && this.d == nVar.d && this.f21210e == nVar.f21210e && this.f21211f == nVar.f21211f && this.h == nVar.h && this.f21213i == nVar.f21213i && this.f21214j == nVar.f21214j && this.f21215k == nVar.f21215k && this.f21212g.equals(nVar.f21212g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f21207a), Integer.valueOf(this.f21208b), Integer.valueOf(this.f21209c), Boolean.valueOf(this.d), Boolean.valueOf(this.f21210e), Integer.valueOf(this.f21211f), this.f21212g, Integer.valueOf(this.h), Integer.valueOf(this.f21213i), Boolean.valueOf(this.f21215k), Boolean.valueOf(this.f21214j));
    }
}
