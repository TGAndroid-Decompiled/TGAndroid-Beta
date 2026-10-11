package ac;

import java.util.Arrays;
import n6.m;
import z7.we;
public final class e {
    public final boolean f412a;
    public final boolean f413b;
    public final boolean f414c;

    public e(d dVar) {
        this.f412a = dVar.f409a;
        this.f413b = dVar.f410b;
        this.f414c = dVar.f411c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f6064a = bool;
        obj.f6065b = Boolean.valueOf(this.f412a);
        obj.f6066c = Boolean.valueOf(this.f413b);
        obj.d = bool;
        obj.f6067e = Boolean.valueOf(this.f414c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f412a == eVar.f412a && this.f413b == eVar.f413b && this.f414c == eVar.f414c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f412a);
        Boolean valueOf2 = Boolean.valueOf(this.f413b);
        Boolean valueOf3 = Boolean.valueOf(this.f414c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
