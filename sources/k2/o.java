package k2;

import j$.util.Objects;
public final class o {
    public final int f10718a;
    public final int f10719b;
    public final int f10720c;
    public final boolean d;
    public final boolean e;
    public final int f10721f;
    public final b2.f f10722g;
    public final int h;
    public final int f10723i;
    public final boolean f10724j;
    public final boolean f10725k;

    public o(n nVar) {
        this.f10718a = nVar.f10702a;
        this.f10719b = nVar.f10703b;
        this.f10720c = nVar.f10704c;
        this.d = nVar.d;
        this.e = nVar.e;
        this.f10721f = nVar.f10705f;
        this.f10722g = nVar.f10706g;
        this.h = nVar.h;
        this.f10723i = nVar.f10707i;
        this.f10724j = nVar.f10708j;
        this.f10725k = nVar.f10709k;
    }

    public final n a() {
        ?? obj = new Object();
        obj.f10702a = this.f10718a;
        obj.f10703b = this.f10719b;
        obj.f10704c = this.f10720c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f10705f = this.f10721f;
        obj.f10706g = this.f10722g;
        obj.h = this.h;
        obj.f10707i = this.f10723i;
        obj.f10708j = this.f10724j;
        obj.f10709k = this.f10725k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o.class == obj.getClass()) {
                o oVar = (o) obj;
                if (this.f10718a == oVar.f10718a && this.f10719b == oVar.f10719b && this.f10720c == oVar.f10720c && this.d == oVar.d && this.e == oVar.e && this.f10721f == oVar.f10721f && this.h == oVar.h && this.f10723i == oVar.f10723i && this.f10724j == oVar.f10724j && this.f10725k == oVar.f10725k && this.f10722g.equals(oVar.f10722g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10718a), Integer.valueOf(this.f10719b), Integer.valueOf(this.f10720c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f10721f), this.f10722g, Integer.valueOf(this.h), Integer.valueOf(this.f10723i), Boolean.valueOf(this.f10725k), Boolean.valueOf(this.f10724j));
    }
}
