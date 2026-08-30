package mb;

import b6.m;
import java.util.Arrays;
import n7.we;
public final class e {
    public final boolean f13907a;
    public final boolean f13908b;
    public final boolean f13909c;

    public e(d dVar) {
        this.f13907a = dVar.f13904a;
        this.f13908b = dVar.f13905b;
        this.f13909c = dVar.f13906c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f2129a = bool;
        obj.f2130b = Boolean.valueOf(this.f13907a);
        obj.f2131c = Boolean.valueOf(this.f13908b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f13909c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f13907a == eVar.f13907a && this.f13908b == eVar.f13908b && this.f13909c == eVar.f13909c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f13907a);
        Boolean valueOf2 = Boolean.valueOf(this.f13908b);
        Boolean valueOf3 = Boolean.valueOf(this.f13909c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
