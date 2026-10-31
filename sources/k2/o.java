package k2;

import j$.util.Objects;
public final class o {
    public final int f10717a;
    public final int f10718b;
    public final int f10719c;
    public final boolean d;
    public final boolean e;
    public final int f10720f;
    public final b2.f f10721g;
    public final int h;
    public final int f10722i;
    public final boolean f10723j;
    public final boolean f10724k;

    public o(n nVar) {
        this.f10717a = nVar.f10701a;
        this.f10718b = nVar.f10702b;
        this.f10719c = nVar.f10703c;
        this.d = nVar.d;
        this.e = nVar.e;
        this.f10720f = nVar.f10704f;
        this.f10721g = nVar.f10705g;
        this.h = nVar.h;
        this.f10722i = nVar.f10706i;
        this.f10723j = nVar.f10707j;
        this.f10724k = nVar.f10708k;
    }

    public final n a() {
        ?? obj = new Object();
        obj.f10701a = this.f10717a;
        obj.f10702b = this.f10718b;
        obj.f10703c = this.f10719c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f10704f = this.f10720f;
        obj.f10705g = this.f10721g;
        obj.h = this.h;
        obj.f10706i = this.f10722i;
        obj.f10707j = this.f10723j;
        obj.f10708k = this.f10724k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o.class == obj.getClass()) {
                o oVar = (o) obj;
                if (this.f10717a == oVar.f10717a && this.f10718b == oVar.f10718b && this.f10719c == oVar.f10719c && this.d == oVar.d && this.e == oVar.e && this.f10720f == oVar.f10720f && this.h == oVar.h && this.f10722i == oVar.f10722i && this.f10723j == oVar.f10723j && this.f10724k == oVar.f10724k && this.f10721g.equals(oVar.f10721g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10717a), Integer.valueOf(this.f10718b), Integer.valueOf(this.f10719c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f10720f), this.f10721g, Integer.valueOf(this.h), Integer.valueOf(this.f10722i), Boolean.valueOf(this.f10724k), Boolean.valueOf(this.f10723j));
    }
}
