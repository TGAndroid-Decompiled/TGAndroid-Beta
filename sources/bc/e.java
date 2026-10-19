package bc;

import java.util.Arrays;
import n6.l;
import z7.we;
public final class e {
    public final boolean f4251a;
    public final boolean f4252b;
    public final boolean f4253c;

    public e(d dVar) {
        this.f4251a = dVar.f4248a;
        this.f4252b = dVar.f4249b;
        this.f4253c = dVar.f4250c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f6883b = bool;
        obj.f6884c = Boolean.valueOf(this.f4251a);
        obj.f6882a = Boolean.valueOf(this.f4252b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f4253c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f4251a == eVar.f4251a && this.f4252b == eVar.f4252b && this.f4253c == eVar.f4253c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f4251a);
        Boolean valueOf2 = Boolean.valueOf(this.f4252b);
        Boolean valueOf3 = Boolean.valueOf(this.f4253c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
