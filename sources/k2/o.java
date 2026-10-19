package k2;

import j$.util.Objects;
public final class o {
    public final int f14766a;
    public final int f14767b;
    public final int f14768c;
    public final boolean d;
    public final boolean e;
    public final int f14769f;
    public final b2.f f14770g;
    public final int h;
    public final int f14771i;
    public final boolean f14772j;
    public final boolean f14773k;

    public o(n nVar) {
        this.f14766a = nVar.f14756a;
        this.f14767b = nVar.f14757b;
        this.f14768c = nVar.f14758c;
        this.d = nVar.d;
        this.e = nVar.e;
        this.f14769f = nVar.f14759f;
        this.f14770g = nVar.f14760g;
        this.h = nVar.h;
        this.f14771i = nVar.f14761i;
        this.f14772j = nVar.f14762j;
        this.f14773k = nVar.f14763k;
    }

    public final n a() {
        ?? obj = new Object();
        obj.f14756a = this.f14766a;
        obj.f14757b = this.f14767b;
        obj.f14758c = this.f14768c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14759f = this.f14769f;
        obj.f14760g = this.f14770g;
        obj.h = this.h;
        obj.f14761i = this.f14771i;
        obj.f14762j = this.f14772j;
        obj.f14763k = this.f14773k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o.class == obj.getClass()) {
                o oVar = (o) obj;
                if (this.f14766a == oVar.f14766a && this.f14767b == oVar.f14767b && this.f14768c == oVar.f14768c && this.d == oVar.d && this.e == oVar.e && this.f14769f == oVar.f14769f && this.h == oVar.h && this.f14771i == oVar.f14771i && this.f14772j == oVar.f14772j && this.f14773k == oVar.f14773k && this.f14770g.equals(oVar.f14770g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14766a), Integer.valueOf(this.f14767b), Integer.valueOf(this.f14768c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f14769f), this.f14770g, Integer.valueOf(this.h), Integer.valueOf(this.f14771i), Boolean.valueOf(this.f14773k), Boolean.valueOf(this.f14772j));
    }
}
