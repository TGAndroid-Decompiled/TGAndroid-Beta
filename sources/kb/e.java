package kb;

import java.util.Arrays;
import l7.ve;
import z5.l;
public final class e {
    public final boolean f13609a;
    public final boolean f13610b;
    public final boolean f13611c;

    public e(d dVar) {
        this.f13609a = dVar.f13606a;
        this.f13610b = dVar.f13607b;
        this.f13611c = dVar.f13608c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f211a = bool;
        obj.f212b = Boolean.valueOf(this.f13609a);
        obj.f213c = Boolean.valueOf(this.f13610b);
        obj.d = bool;
        obj.f214e = Boolean.valueOf(this.f13611c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f13609a == eVar.f13609a && this.f13610b == eVar.f13610b && this.f13611c == eVar.f13611c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f13609a);
        Boolean valueOf2 = Boolean.valueOf(this.f13610b);
        Boolean valueOf3 = Boolean.valueOf(this.f13611c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
