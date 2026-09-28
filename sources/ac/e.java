package ac;

import java.util.Arrays;
import n6.l;
import z7.ve;
public final class e {
    public final boolean f385a;
    public final boolean f386b;
    public final boolean f387c;

    public e(d dVar) {
        this.f385a = dVar.f382a;
        this.f386b = dVar.f383b;
        this.f387c = dVar.f384c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f4252a = bool;
        obj.f4253b = Boolean.valueOf(this.f385a);
        obj.f4254c = Boolean.valueOf(this.f386b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f387c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f385a == eVar.f385a && this.f386b == eVar.f386b && this.f387c == eVar.f387c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f385a);
        Boolean valueOf2 = Boolean.valueOf(this.f386b);
        Boolean valueOf3 = Boolean.valueOf(this.f387c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
