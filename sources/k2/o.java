package k2;

import j$.util.Objects;
public final class o {
    public final int f13963a;
    public final int f13964b;
    public final int f13965c;
    public final boolean d;
    public final boolean e;
    public final int f13966f;
    public final b2.f f13967g;
    public final int h;
    public final int f13968i;
    public final boolean f13969j;
    public final boolean f13970k;

    public o(n nVar) {
        this.f13963a = nVar.f13954a;
        this.f13964b = nVar.f13955b;
        this.f13965c = nVar.f13956c;
        this.d = nVar.d;
        this.e = nVar.e;
        this.f13966f = nVar.f13957f;
        this.f13967g = nVar.f13958g;
        this.h = nVar.h;
        this.f13968i = nVar.f13959i;
        this.f13969j = nVar.f13960j;
        this.f13970k = nVar.f13961k;
    }

    public final n a() {
        ?? obj = new Object();
        obj.f13954a = this.f13963a;
        obj.f13955b = this.f13964b;
        obj.f13956c = this.f13965c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f13957f = this.f13966f;
        obj.f13958g = this.f13967g;
        obj.h = this.h;
        obj.f13959i = this.f13968i;
        obj.f13960j = this.f13969j;
        obj.f13961k = this.f13970k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o.class == obj.getClass()) {
                o oVar = (o) obj;
                if (this.f13963a == oVar.f13963a && this.f13964b == oVar.f13964b && this.f13965c == oVar.f13965c && this.d == oVar.d && this.e == oVar.e && this.f13966f == oVar.f13966f && this.h == oVar.h && this.f13968i == oVar.f13968i && this.f13969j == oVar.f13969j && this.f13970k == oVar.f13970k && this.f13967g.equals(oVar.f13967g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13963a), Integer.valueOf(this.f13964b), Integer.valueOf(this.f13965c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f13966f), this.f13967g, Integer.valueOf(this.h), Integer.valueOf(this.f13968i), Boolean.valueOf(this.f13970k), Boolean.valueOf(this.f13969j));
    }
}
