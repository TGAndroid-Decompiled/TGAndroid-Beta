package k2;

import j$.util.Objects;
public final class o {
    public final int f14768a;
    public final int f14769b;
    public final int f14770c;
    public final boolean d;
    public final boolean e;
    public final int f14771f;
    public final b2.f f14772g;
    public final int h;
    public final int f14773i;
    public final boolean f14774j;
    public final boolean f14775k;

    public o(n nVar) {
        this.f14768a = nVar.f14758a;
        this.f14769b = nVar.f14759b;
        this.f14770c = nVar.f14760c;
        this.d = nVar.d;
        this.e = nVar.e;
        this.f14771f = nVar.f14761f;
        this.f14772g = nVar.f14762g;
        this.h = nVar.h;
        this.f14773i = nVar.f14763i;
        this.f14774j = nVar.f14764j;
        this.f14775k = nVar.f14765k;
    }

    public final n a() {
        ?? obj = new Object();
        obj.f14758a = this.f14768a;
        obj.f14759b = this.f14769b;
        obj.f14760c = this.f14770c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14761f = this.f14771f;
        obj.f14762g = this.f14772g;
        obj.h = this.h;
        obj.f14763i = this.f14773i;
        obj.f14764j = this.f14774j;
        obj.f14765k = this.f14775k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o.class == obj.getClass()) {
                o oVar = (o) obj;
                if (this.f14768a == oVar.f14768a && this.f14769b == oVar.f14769b && this.f14770c == oVar.f14770c && this.d == oVar.d && this.e == oVar.e && this.f14771f == oVar.f14771f && this.h == oVar.h && this.f14773i == oVar.f14773i && this.f14774j == oVar.f14774j && this.f14775k == oVar.f14775k && this.f14772g.equals(oVar.f14772g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14768a), Integer.valueOf(this.f14769b), Integer.valueOf(this.f14770c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f14771f), this.f14772g, Integer.valueOf(this.h), Integer.valueOf(this.f14773i), Boolean.valueOf(this.f14775k), Boolean.valueOf(this.f14774j));
    }
}
