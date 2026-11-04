package m2;

import j$.util.Objects;
public final class n {
    public final int f18944a;
    public final int f18945b;
    public final int f18946c;
    public final boolean d;
    public final boolean f18947e;
    public final int f18948f;
    public final d2.f f18949g;
    public final int h;
    public final int f18950i;
    public final boolean f18951j;
    public final boolean f18952k;

    public n(m mVar) {
        this.f18944a = mVar.f18933a;
        this.f18945b = mVar.f18934b;
        this.f18946c = mVar.f18935c;
        this.d = mVar.d;
        this.f18947e = mVar.f18936e;
        this.f18948f = mVar.f18937f;
        this.f18949g = mVar.f18938g;
        this.h = mVar.h;
        this.f18950i = mVar.f18939i;
        this.f18951j = mVar.f18940j;
        this.f18952k = mVar.f18941k;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f18933a = this.f18944a;
        obj.f18934b = this.f18945b;
        obj.f18935c = this.f18946c;
        obj.d = this.d;
        obj.f18936e = this.f18947e;
        obj.f18937f = this.f18948f;
        obj.f18938g = this.f18949g;
        obj.h = this.h;
        obj.f18939i = this.f18950i;
        obj.f18940j = this.f18951j;
        obj.f18941k = this.f18952k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (this.f18944a == nVar.f18944a && this.f18945b == nVar.f18945b && this.f18946c == nVar.f18946c && this.d == nVar.d && this.f18947e == nVar.f18947e && this.f18948f == nVar.f18948f && this.h == nVar.h && this.f18950i == nVar.f18950i && this.f18951j == nVar.f18951j && this.f18952k == nVar.f18952k && this.f18949g.equals(nVar.f18949g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f18944a), Integer.valueOf(this.f18945b), Integer.valueOf(this.f18946c), Boolean.valueOf(this.d), Boolean.valueOf(this.f18947e), Integer.valueOf(this.f18948f), this.f18949g, Integer.valueOf(this.h), Integer.valueOf(this.f18950i), Boolean.valueOf(this.f18952k), Boolean.valueOf(this.f18951j));
    }
}
