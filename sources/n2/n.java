package n2;

import j$.util.Objects;
public final class n {
    public final int f20818a;
    public final int f20819b;
    public final int f20820c;
    public final boolean d;
    public final boolean f20821e;
    public final int f20822f;
    public final e2.e f20823g;
    public final int h;
    public final int f20824i;
    public final boolean f20825j;
    public final boolean f20826k;

    public n(m mVar) {
        this.f20818a = mVar.f20808a;
        this.f20819b = mVar.f20809b;
        this.f20820c = mVar.f20810c;
        this.d = mVar.d;
        this.f20821e = mVar.f20811e;
        this.f20822f = mVar.f20812f;
        this.f20823g = mVar.f20813g;
        this.h = mVar.h;
        this.f20824i = mVar.f20814i;
        this.f20825j = mVar.f20815j;
        this.f20826k = mVar.f20816k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f20808a = this.f20818a;
        obj.f20809b = this.f20819b;
        obj.f20810c = this.f20820c;
        obj.d = this.d;
        obj.f20811e = this.f20821e;
        obj.f20812f = this.f20822f;
        obj.f20813g = this.f20823g;
        obj.h = this.h;
        obj.f20814i = this.f20824i;
        obj.f20815j = this.f20825j;
        obj.f20816k = this.f20826k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f20818a == nVar.f20818a && this.f20819b == nVar.f20819b && this.f20820c == nVar.f20820c && this.d == nVar.d && this.f20821e == nVar.f20821e && this.f20822f == nVar.f20822f && this.h == nVar.h && this.f20824i == nVar.f20824i && this.f20825j == nVar.f20825j && this.f20826k == nVar.f20826k && this.f20823g.equals(nVar.f20823g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f20818a), Integer.valueOf(this.f20819b), Integer.valueOf(this.f20820c), Boolean.valueOf(this.d), Boolean.valueOf(this.f20821e), Integer.valueOf(this.f20822f), this.f20823g, Integer.valueOf(this.h), Integer.valueOf(this.f20824i), Boolean.valueOf(this.f20826k), Boolean.valueOf(this.f20825j));
    }
}
