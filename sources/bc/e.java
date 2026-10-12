package bc;

import java.util.Arrays;
import n6.l;
import z7.ve;
public final class e {
    public final boolean f2636a;
    public final boolean f2637b;
    public final boolean f2638c;

    public e(d dVar) {
        this.f2636a = dVar.f2633a;
        this.f2637b = dVar.f2634b;
        this.f2638c = dVar.f2635c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f5426b = bool;
        obj.f5427c = Boolean.valueOf(this.f2636a);
        obj.f5425a = Boolean.valueOf(this.f2637b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f2638c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f2636a == eVar.f2636a && this.f2637b == eVar.f2637b && this.f2638c == eVar.f2638c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f2636a);
        Boolean valueOf2 = Boolean.valueOf(this.f2637b);
        Boolean valueOf3 = Boolean.valueOf(this.f2638c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
