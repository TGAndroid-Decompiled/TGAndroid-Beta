package ac;

import java.util.Arrays;
import n6.l;
import z7.ve;
public final class e {
    public final boolean f414a;
    public final boolean f415b;
    public final boolean f416c;

    public e(d dVar) {
        this.f414a = dVar.f411a;
        this.f415b = dVar.f412b;
        this.f416c = dVar.f413c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f4602a = bool;
        obj.f4603b = Boolean.valueOf(this.f414a);
        obj.f4604c = Boolean.valueOf(this.f415b);
        obj.d = bool;
        obj.f4605e = Boolean.valueOf(this.f416c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f414a == eVar.f414a && this.f415b == eVar.f415b && this.f416c == eVar.f416c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f414a);
        Boolean valueOf2 = Boolean.valueOf(this.f415b);
        Boolean valueOf3 = Boolean.valueOf(this.f416c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
