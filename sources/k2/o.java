package k2;

import j$.util.Objects;
public final class o {
    public final int f14761a;
    public final int f14762b;
    public final int f14763c;
    public final boolean d;
    public final boolean e;
    public final int f14764f;
    public final b2.f f14765g;
    public final int h;
    public final int f14766i;
    public final boolean f14767j;
    public final boolean f14768k;

    public o(n nVar) {
        this.f14761a = nVar.f14751a;
        this.f14762b = nVar.f14752b;
        this.f14763c = nVar.f14753c;
        this.d = nVar.d;
        this.e = nVar.e;
        this.f14764f = nVar.f14754f;
        this.f14765g = nVar.f14755g;
        this.h = nVar.h;
        this.f14766i = nVar.f14756i;
        this.f14767j = nVar.f14757j;
        this.f14768k = nVar.f14758k;
    }

    public final n a() {
        ?? obj = new Object();
        obj.f14751a = this.f14761a;
        obj.f14752b = this.f14762b;
        obj.f14753c = this.f14763c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14754f = this.f14764f;
        obj.f14755g = this.f14765g;
        obj.h = this.h;
        obj.f14756i = this.f14766i;
        obj.f14757j = this.f14767j;
        obj.f14758k = this.f14768k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o.class == obj.getClass()) {
                o oVar = (o) obj;
                if (this.f14761a == oVar.f14761a && this.f14762b == oVar.f14762b && this.f14763c == oVar.f14763c && this.d == oVar.d && this.e == oVar.e && this.f14764f == oVar.f14764f && this.h == oVar.h && this.f14766i == oVar.f14766i && this.f14767j == oVar.f14767j && this.f14768k == oVar.f14768k && this.f14765g.equals(oVar.f14765g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14761a), Integer.valueOf(this.f14762b), Integer.valueOf(this.f14763c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f14764f), this.f14765g, Integer.valueOf(this.h), Integer.valueOf(this.f14766i), Boolean.valueOf(this.f14768k), Boolean.valueOf(this.f14767j));
    }
}
