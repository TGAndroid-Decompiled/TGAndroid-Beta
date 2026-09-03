package mb;

import b6.m;
import java.util.Arrays;
import n7.we;
public final class e {
    public final boolean f13891a;
    public final boolean f13892b;
    public final boolean f13893c;

    public e(d dVar) {
        this.f13891a = dVar.f13888a;
        this.f13892b = dVar.f13889b;
        this.f13893c = dVar.f13890c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f2152a = bool;
        obj.f2153b = Boolean.valueOf(this.f13891a);
        obj.f2154c = Boolean.valueOf(this.f13892b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f13893c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f13891a == eVar.f13891a && this.f13892b == eVar.f13892b && this.f13893c == eVar.f13893c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f13891a);
        Boolean valueOf2 = Boolean.valueOf(this.f13892b);
        Boolean valueOf3 = Boolean.valueOf(this.f13893c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
