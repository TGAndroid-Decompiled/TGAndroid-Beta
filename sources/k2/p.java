package k2;

import j$.util.Objects;
public final class p {
    public final int f14813a;
    public final int f14814b;
    public final int f14815c;
    public final boolean d;
    public final boolean e;
    public final int f14816f;
    public final b2.f f14817g;
    public final int h;
    public final int f14818i;
    public final boolean f14819j;
    public final boolean f14820k;

    public p(o oVar) {
        this.f14813a = oVar.f14804a;
        this.f14814b = oVar.f14805b;
        this.f14815c = oVar.f14806c;
        this.d = oVar.d;
        this.e = oVar.e;
        this.f14816f = oVar.f14807f;
        this.f14817g = oVar.f14808g;
        this.h = oVar.h;
        this.f14818i = oVar.f14809i;
        this.f14819j = oVar.f14810j;
        this.f14820k = oVar.f14811k;
    }

    public final o a() {
        ?? obj = new Object();
        obj.f14804a = this.f14813a;
        obj.f14805b = this.f14814b;
        obj.f14806c = this.f14815c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14807f = this.f14816f;
        obj.f14808g = this.f14817g;
        obj.h = this.h;
        obj.f14809i = this.f14818i;
        obj.f14810j = this.f14819j;
        obj.f14811k = this.f14820k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && p.class == obj.getClass()) {
                p pVar = (p) obj;
                if (this.f14813a == pVar.f14813a && this.f14814b == pVar.f14814b && this.f14815c == pVar.f14815c && this.d == pVar.d && this.e == pVar.e && this.f14816f == pVar.f14816f && this.h == pVar.h && this.f14818i == pVar.f14818i && this.f14819j == pVar.f14819j && this.f14820k == pVar.f14820k && this.f14817g.equals(pVar.f14817g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14813a), Integer.valueOf(this.f14814b), Integer.valueOf(this.f14815c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f14816f), this.f14817g, Integer.valueOf(this.h), Integer.valueOf(this.f14818i), Boolean.valueOf(this.f14820k), Boolean.valueOf(this.f14819j));
    }
}
