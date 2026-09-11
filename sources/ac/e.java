package ac;

import java.util.Arrays;
import n6.l;
import z7.ve;
public final class e {
    public final boolean f399a;
    public final boolean f400b;
    public final boolean f401c;

    public e(d dVar) {
        this.f399a = dVar.f396a;
        this.f400b = dVar.f397b;
        this.f401c = dVar.f398c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f4796a = bool;
        obj.f4797b = Boolean.valueOf(this.f399a);
        obj.f4798c = Boolean.valueOf(this.f400b);
        obj.d = bool;
        obj.f4799e = Boolean.valueOf(this.f401c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f399a == eVar.f399a && this.f400b == eVar.f400b && this.f401c == eVar.f401c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f399a);
        Boolean valueOf2 = Boolean.valueOf(this.f400b);
        Boolean valueOf3 = Boolean.valueOf(this.f401c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
