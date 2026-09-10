package ac;

import java.util.Arrays;
import n6.l;
import z7.ve;
public final class e {
    public final boolean f381a;
    public final boolean f382b;
    public final boolean f383c;

    public e(d dVar) {
        this.f381a = dVar.f378a;
        this.f382b = dVar.f379b;
        this.f383c = dVar.f380c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f3719a = bool;
        obj.f3720b = Boolean.valueOf(this.f381a);
        obj.f3721c = Boolean.valueOf(this.f382b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f383c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f381a == eVar.f381a && this.f382b == eVar.f382b && this.f383c == eVar.f383c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f381a);
        Boolean valueOf2 = Boolean.valueOf(this.f382b);
        Boolean valueOf3 = Boolean.valueOf(this.f383c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
