package ac;

import java.util.Arrays;
import n6.m;
import z7.we;
public final class e {
    public final boolean f414a;
    public final boolean f415b;
    public final boolean f416c;

    public e(d dVar) {
        this.f414a = dVar.f411a;
        this.f415b = dVar.f412b;
        this.f416c = dVar.f413c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f6063a = bool;
        obj.f6064b = Boolean.valueOf(this.f414a);
        obj.f6065c = Boolean.valueOf(this.f415b);
        obj.d = bool;
        obj.f6066e = Boolean.valueOf(this.f416c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f414a == eVar.f414a && this.f415b == eVar.f415b && this.f416c == eVar.f416c && m.l(null, null)) {
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
