package n2;

import j$.util.Objects;
public final class n {
    public final int f20250a;
    public final int f20251b;
    public final int f20252c;
    public final boolean d;
    public final boolean f20253e;
    public final int f20254f;
    public final e2.e f20255g;
    public final int h;
    public final int f20256i;
    public final boolean f20257j;
    public final boolean f20258k;

    public n(m mVar) {
        this.f20250a = mVar.f20239a;
        this.f20251b = mVar.f20240b;
        this.f20252c = mVar.f20241c;
        this.d = mVar.d;
        this.f20253e = mVar.f20242e;
        this.f20254f = mVar.f20243f;
        this.f20255g = mVar.f20244g;
        this.h = mVar.h;
        this.f20256i = mVar.f20245i;
        this.f20257j = mVar.f20246j;
        this.f20258k = mVar.f20247k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f20239a = this.f20250a;
        obj.f20240b = this.f20251b;
        obj.f20241c = this.f20252c;
        obj.d = this.d;
        obj.f20242e = this.f20253e;
        obj.f20243f = this.f20254f;
        obj.f20244g = this.f20255g;
        obj.h = this.h;
        obj.f20245i = this.f20256i;
        obj.f20246j = this.f20257j;
        obj.f20247k = this.f20258k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f20250a == nVar.f20250a && this.f20251b == nVar.f20251b && this.f20252c == nVar.f20252c && this.d == nVar.d && this.f20253e == nVar.f20253e && this.f20254f == nVar.f20254f && this.h == nVar.h && this.f20256i == nVar.f20256i && this.f20257j == nVar.f20257j && this.f20258k == nVar.f20258k && this.f20255g.equals(nVar.f20255g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f20250a), Integer.valueOf(this.f20251b), Integer.valueOf(this.f20252c), Boolean.valueOf(this.d), Boolean.valueOf(this.f20253e), Integer.valueOf(this.f20254f), this.f20255g, Integer.valueOf(this.h), Integer.valueOf(this.f20256i), Boolean.valueOf(this.f20258k), Boolean.valueOf(this.f20257j));
    }
}
