package bc;

import java.util.Arrays;
import n6.l;
import z7.ve;
public final class e {
    public final boolean f2640a;
    public final boolean f2641b;
    public final boolean f2642c;

    public e(d dVar) {
        this.f2640a = dVar.f2637a;
        this.f2641b = dVar.f2638b;
        this.f2642c = dVar.f2639c;
    }

    public final ve a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f5429b = bool;
        obj.f5430c = Boolean.valueOf(this.f2640a);
        obj.f5428a = Boolean.valueOf(this.f2641b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f2642c);
        return new ve(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f2640a == eVar.f2640a && this.f2641b == eVar.f2641b && this.f2642c == eVar.f2642c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f2640a);
        Boolean valueOf2 = Boolean.valueOf(this.f2641b);
        Boolean valueOf3 = Boolean.valueOf(this.f2642c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
