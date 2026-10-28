package k2;

import j$.util.Objects;
public final class p {
    public final int f16248a;
    public final int f16249b;
    public final int f16250c;
    public final boolean d;
    public final boolean e;
    public final int f16251f;
    public final b2.f f16252g;
    public final int h;
    public final int f16253i;
    public final boolean f16254j;
    public final boolean f16255k;

    public p(o oVar) {
        this.f16248a = oVar.f16238a;
        this.f16249b = oVar.f16239b;
        this.f16250c = oVar.f16240c;
        this.d = oVar.d;
        this.e = oVar.e;
        this.f16251f = oVar.f16241f;
        this.f16252g = oVar.f16242g;
        this.h = oVar.h;
        this.f16253i = oVar.f16243i;
        this.f16254j = oVar.f16244j;
        this.f16255k = oVar.f16245k;
    }

    public final o a() {
        ?? obj = new Object();
        obj.f16238a = this.f16248a;
        obj.f16239b = this.f16249b;
        obj.f16240c = this.f16250c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f16241f = this.f16251f;
        obj.f16242g = this.f16252g;
        obj.h = this.h;
        obj.f16243i = this.f16253i;
        obj.f16244j = this.f16254j;
        obj.f16245k = this.f16255k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && p.class == obj.getClass()) {
                p pVar = (p) obj;
                if (this.f16248a == pVar.f16248a && this.f16249b == pVar.f16249b && this.f16250c == pVar.f16250c && this.d == pVar.d && this.e == pVar.e && this.f16251f == pVar.f16251f && this.h == pVar.h && this.f16253i == pVar.f16253i && this.f16254j == pVar.f16254j && this.f16255k == pVar.f16255k && this.f16252g.equals(pVar.f16252g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16248a), Integer.valueOf(this.f16249b), Integer.valueOf(this.f16250c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f16251f), this.f16252g, Integer.valueOf(this.h), Integer.valueOf(this.f16253i), Boolean.valueOf(this.f16255k), Boolean.valueOf(this.f16254j));
    }
}
