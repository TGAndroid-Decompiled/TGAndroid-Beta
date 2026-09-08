package ac;

import java.util.Arrays;
import n6.l;
import z7.ve;
public final class e {
    public final boolean f411a;
    public final boolean f412b;
    public final boolean f413c;

    public e(d dVar) {
        this.f411a = dVar.f408a;
        this.f412b = dVar.f409b;
        this.f413c = dVar.f410c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f4823a = bool;
        obj.f4824b = Boolean.valueOf(this.f411a);
        obj.f4825c = Boolean.valueOf(this.f412b);
        obj.d = bool;
        obj.f4826e = Boolean.valueOf(this.f413c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f411a == eVar.f411a && this.f412b == eVar.f412b && this.f413c == eVar.f413c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f411a);
        Boolean valueOf2 = Boolean.valueOf(this.f412b);
        Boolean valueOf3 = Boolean.valueOf(this.f413c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
