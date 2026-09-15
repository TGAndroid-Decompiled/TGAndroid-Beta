package ac;

import java.util.Arrays;
import n6.l;
import z7.ve;
public final class e {
    public final boolean f383a;
    public final boolean f384b;
    public final boolean f385c;

    public e(d dVar) {
        this.f383a = dVar.f380a;
        this.f384b = dVar.f381b;
        this.f385c = dVar.f382c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f4255a = bool;
        obj.f4256b = Boolean.valueOf(this.f383a);
        obj.f4257c = Boolean.valueOf(this.f384b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f385c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f383a == eVar.f383a && this.f384b == eVar.f384b && this.f385c == eVar.f385c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f383a);
        Boolean valueOf2 = Boolean.valueOf(this.f384b);
        Boolean valueOf3 = Boolean.valueOf(this.f385c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
