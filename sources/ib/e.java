package ib;

import j7.ve;
import java.util.Arrays;
import x5.l;
public final class e {
    public final boolean f11086a;
    public final boolean f11087b;
    public final boolean f11088c;

    public e(d dVar) {
        this.f11086a = dVar.f11083a;
        this.f11087b = dVar.f11084b;
        this.f11088c = dVar.f11085c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f1413a = bool;
        obj.f1414b = Boolean.valueOf(this.f11086a);
        obj.f1415c = Boolean.valueOf(this.f11087b);
        obj.d = bool;
        obj.f1416e = Boolean.valueOf(this.f11088c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f11086a == eVar.f11086a && this.f11087b == eVar.f11087b && this.f11088c == eVar.f11088c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f11086a);
        Boolean valueOf2 = Boolean.valueOf(this.f11087b);
        Boolean valueOf3 = Boolean.valueOf(this.f11088c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
