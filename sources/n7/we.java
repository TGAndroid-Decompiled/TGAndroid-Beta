package n7;

import java.util.Arrays;
public final class we {
    public final Boolean f14781a;
    public final Boolean f14782b;
    public final Boolean f14783c;
    public final Boolean d;
    public final Boolean e;

    public we(c5.j jVar) {
        this.f14781a = (Boolean) jVar.f2129a;
        this.f14782b = (Boolean) jVar.f2130b;
        this.f14783c = (Boolean) jVar.f2131c;
        this.d = (Boolean) jVar.d;
        this.e = (Boolean) jVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (b6.m.l(this.f14781a, weVar.f14781a) && b6.m.l(this.f14782b, weVar.f14782b) && b6.m.l(this.f14783c, weVar.f14783c) && b6.m.l(this.d, weVar.d) && b6.m.l(this.e, weVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14781a, this.f14782b, this.f14783c, this.d, this.e});
    }
}
