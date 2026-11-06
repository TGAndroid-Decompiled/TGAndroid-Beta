package n2;

import j$.util.Objects;
public final class n {
    public final int f20242a;
    public final int f20243b;
    public final int f20244c;
    public final boolean d;
    public final boolean f20245e;
    public final int f20246f;
    public final e2.e f20247g;
    public final int h;
    public final int f20248i;
    public final boolean f20249j;
    public final boolean f20250k;

    public n(m mVar) {
        this.f20242a = mVar.f20231a;
        this.f20243b = mVar.f20232b;
        this.f20244c = mVar.f20233c;
        this.d = mVar.d;
        this.f20245e = mVar.f20234e;
        this.f20246f = mVar.f20235f;
        this.f20247g = mVar.f20236g;
        this.h = mVar.h;
        this.f20248i = mVar.f20237i;
        this.f20249j = mVar.f20238j;
        this.f20250k = mVar.f20239k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f20231a = this.f20242a;
        obj.f20232b = this.f20243b;
        obj.f20233c = this.f20244c;
        obj.d = this.d;
        obj.f20234e = this.f20245e;
        obj.f20235f = this.f20246f;
        obj.f20236g = this.f20247g;
        obj.h = this.h;
        obj.f20237i = this.f20248i;
        obj.f20238j = this.f20249j;
        obj.f20239k = this.f20250k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f20242a == nVar.f20242a && this.f20243b == nVar.f20243b && this.f20244c == nVar.f20244c && this.d == nVar.d && this.f20245e == nVar.f20245e && this.f20246f == nVar.f20246f && this.h == nVar.h && this.f20248i == nVar.f20248i && this.f20249j == nVar.f20249j && this.f20250k == nVar.f20250k && this.f20247g.equals(nVar.f20247g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f20242a), Integer.valueOf(this.f20243b), Integer.valueOf(this.f20244c), Boolean.valueOf(this.d), Boolean.valueOf(this.f20245e), Integer.valueOf(this.f20246f), this.f20247g, Integer.valueOf(this.h), Integer.valueOf(this.f20248i), Boolean.valueOf(this.f20250k), Boolean.valueOf(this.f20249j));
    }
}
