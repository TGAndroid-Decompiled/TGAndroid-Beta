package n2;

import j$.util.Objects;
public final class n {
    public final int f21275a;
    public final int f21276b;
    public final int f21277c;
    public final boolean d;
    public final boolean f21278e;
    public final int f21279f;
    public final e2.e f21280g;
    public final int h;
    public final int f21281i;
    public final boolean f21282j;
    public final boolean f21283k;

    public n(m mVar) {
        this.f21275a = mVar.f21264a;
        this.f21276b = mVar.f21265b;
        this.f21277c = mVar.f21266c;
        this.d = mVar.d;
        this.f21278e = mVar.f21267e;
        this.f21279f = mVar.f21268f;
        this.f21280g = mVar.f21269g;
        this.h = mVar.h;
        this.f21281i = mVar.f21270i;
        this.f21282j = mVar.f21271j;
        this.f21283k = mVar.f21272k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f21264a = this.f21275a;
        obj.f21265b = this.f21276b;
        obj.f21266c = this.f21277c;
        obj.d = this.d;
        obj.f21267e = this.f21278e;
        obj.f21268f = this.f21279f;
        obj.f21269g = this.f21280g;
        obj.h = this.h;
        obj.f21270i = this.f21281i;
        obj.f21271j = this.f21282j;
        obj.f21272k = this.f21283k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f21275a == nVar.f21275a && this.f21276b == nVar.f21276b && this.f21277c == nVar.f21277c && this.d == nVar.d && this.f21278e == nVar.f21278e && this.f21279f == nVar.f21279f && this.h == nVar.h && this.f21281i == nVar.f21281i && this.f21282j == nVar.f21282j && this.f21283k == nVar.f21283k && this.f21280g.equals(nVar.f21280g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f21275a), Integer.valueOf(this.f21276b), Integer.valueOf(this.f21277c), Boolean.valueOf(this.d), Boolean.valueOf(this.f21278e), Integer.valueOf(this.f21279f), this.f21280g, Integer.valueOf(this.h), Integer.valueOf(this.f21281i), Boolean.valueOf(this.f21283k), Boolean.valueOf(this.f21282j));
    }
}
