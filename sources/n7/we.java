package n7;

import java.util.Arrays;
public final class we {
    public final Boolean f14766a;
    public final Boolean f14767b;
    public final Boolean f14768c;
    public final Boolean d;
    public final Boolean e;

    public we(c5.j jVar) {
        this.f14766a = (Boolean) jVar.f2152a;
        this.f14767b = (Boolean) jVar.f2153b;
        this.f14768c = (Boolean) jVar.f2154c;
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
        if (b6.m.l(this.f14766a, weVar.f14766a) && b6.m.l(this.f14767b, weVar.f14767b) && b6.m.l(this.f14768c, weVar.f14768c) && b6.m.l(this.d, weVar.d) && b6.m.l(this.e, weVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14766a, this.f14767b, this.f14768c, this.d, this.e});
    }
}
