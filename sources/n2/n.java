package n2;

import j$.util.Objects;
public final class n {
    public final int f20245a;
    public final int f20246b;
    public final int f20247c;
    public final boolean d;
    public final boolean f20248e;
    public final int f20249f;
    public final e2.e f20250g;
    public final int h;
    public final int f20251i;
    public final boolean f20252j;
    public final boolean f20253k;

    public n(m mVar) {
        this.f20245a = mVar.f20234a;
        this.f20246b = mVar.f20235b;
        this.f20247c = mVar.f20236c;
        this.d = mVar.d;
        this.f20248e = mVar.f20237e;
        this.f20249f = mVar.f20238f;
        this.f20250g = mVar.f20239g;
        this.h = mVar.h;
        this.f20251i = mVar.f20240i;
        this.f20252j = mVar.f20241j;
        this.f20253k = mVar.f20242k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f20234a = this.f20245a;
        obj.f20235b = this.f20246b;
        obj.f20236c = this.f20247c;
        obj.d = this.d;
        obj.f20237e = this.f20248e;
        obj.f20238f = this.f20249f;
        obj.f20239g = this.f20250g;
        obj.h = this.h;
        obj.f20240i = this.f20251i;
        obj.f20241j = this.f20252j;
        obj.f20242k = this.f20253k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f20245a == nVar.f20245a && this.f20246b == nVar.f20246b && this.f20247c == nVar.f20247c && this.d == nVar.d && this.f20248e == nVar.f20248e && this.f20249f == nVar.f20249f && this.h == nVar.h && this.f20251i == nVar.f20251i && this.f20252j == nVar.f20252j && this.f20253k == nVar.f20253k && this.f20250g.equals(nVar.f20250g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f20245a), Integer.valueOf(this.f20246b), Integer.valueOf(this.f20247c), Boolean.valueOf(this.d), Boolean.valueOf(this.f20248e), Integer.valueOf(this.f20249f), this.f20250g, Integer.valueOf(this.h), Integer.valueOf(this.f20251i), Boolean.valueOf(this.f20253k), Boolean.valueOf(this.f20252j));
    }
}
