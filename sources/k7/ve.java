package k7;

import java.util.Arrays;

public final class ve {

    public final Boolean f14997a;

    public final Boolean f14998b;

    public final Boolean f14999c;
    public final Boolean d;

    public final Boolean f15000e;

    public ve(af.h hVar) {
        this.f14997a = (Boolean) hVar.f274a;
        this.f14998b = (Boolean) hVar.f275b;
        this.f14999c = (Boolean) hVar.f276c;
        this.d = (Boolean) hVar.d;
        this.f15000e = (Boolean) hVar.f277e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return y5.l.l(this.f14997a, veVar.f14997a) && y5.l.l(this.f14998b, veVar.f14998b) && y5.l.l(this.f14999c, veVar.f14999c) && y5.l.l(this.d, veVar.d) && y5.l.l(this.f15000e, veVar.f15000e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14997a, this.f14998b, this.f14999c, this.d, this.f15000e});
    }
}
