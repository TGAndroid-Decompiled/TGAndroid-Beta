package k2;

import j$.util.Objects;
public final class p {
    public final int f16249a;
    public final int f16250b;
    public final int f16251c;
    public final boolean d;
    public final boolean e;
    public final int f16252f;
    public final b2.f f16253g;
    public final int h;
    public final int f16254i;
    public final boolean f16255j;
    public final boolean f16256k;

    public p(o oVar) {
        this.f16249a = oVar.f16239a;
        this.f16250b = oVar.f16240b;
        this.f16251c = oVar.f16241c;
        this.d = oVar.d;
        this.e = oVar.e;
        this.f16252f = oVar.f16242f;
        this.f16253g = oVar.f16243g;
        this.h = oVar.h;
        this.f16254i = oVar.f16244i;
        this.f16255j = oVar.f16245j;
        this.f16256k = oVar.f16246k;
    }

    public final o a() {
        ?? obj = new Object();
        obj.f16239a = this.f16249a;
        obj.f16240b = this.f16250b;
        obj.f16241c = this.f16251c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f16242f = this.f16252f;
        obj.f16243g = this.f16253g;
        obj.h = this.h;
        obj.f16244i = this.f16254i;
        obj.f16245j = this.f16255j;
        obj.f16246k = this.f16256k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && p.class == obj.getClass()) {
                p pVar = (p) obj;
                if (this.f16249a == pVar.f16249a && this.f16250b == pVar.f16250b && this.f16251c == pVar.f16251c && this.d == pVar.d && this.e == pVar.e && this.f16252f == pVar.f16252f && this.h == pVar.h && this.f16254i == pVar.f16254i && this.f16255j == pVar.f16255j && this.f16256k == pVar.f16256k && this.f16253g.equals(pVar.f16253g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16249a), Integer.valueOf(this.f16250b), Integer.valueOf(this.f16251c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f16252f), this.f16253g, Integer.valueOf(this.h), Integer.valueOf(this.f16254i), Boolean.valueOf(this.f16256k), Boolean.valueOf(this.f16255j));
    }
}
