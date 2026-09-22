package ac;

import java.util.Arrays;
import n6.l;
import z7.ve;
public final class e {
    public final boolean f382a;
    public final boolean f383b;
    public final boolean f384c;

    public e(d dVar) {
        this.f382a = dVar.f379a;
        this.f383b = dVar.f380b;
        this.f384c = dVar.f381c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f4259a = bool;
        obj.f4260b = Boolean.valueOf(this.f382a);
        obj.f4261c = Boolean.valueOf(this.f383b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f384c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f382a == eVar.f382a && this.f383b == eVar.f383b && this.f384c == eVar.f384c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f382a);
        Boolean valueOf2 = Boolean.valueOf(this.f383b);
        Boolean valueOf3 = Boolean.valueOf(this.f384c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
