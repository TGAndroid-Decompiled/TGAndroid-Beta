package bc;

import java.util.Arrays;
import n6.l;
import z7.ve;
public final class e {
    public final boolean f4256a;
    public final boolean f4257b;
    public final boolean f4258c;

    public e(d dVar) {
        this.f4256a = dVar.f4253a;
        this.f4257b = dVar.f4254b;
        this.f4258c = dVar.f4255c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f6893b = bool;
        obj.f6894c = Boolean.valueOf(this.f4256a);
        obj.f6892a = Boolean.valueOf(this.f4257b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f4258c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f4256a == eVar.f4256a && this.f4257b == eVar.f4257b && this.f4258c == eVar.f4258c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f4256a);
        Boolean valueOf2 = Boolean.valueOf(this.f4257b);
        Boolean valueOf3 = Boolean.valueOf(this.f4258c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
