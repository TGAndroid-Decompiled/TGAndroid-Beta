package bc;

import java.util.Arrays;
import n6.l;
import z7.we;
public final class e {
    public final boolean f4249a;
    public final boolean f4250b;
    public final boolean f4251c;

    public e(d dVar) {
        this.f4249a = dVar.f4246a;
        this.f4250b = dVar.f4247b;
        this.f4251c = dVar.f4248c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f6881b = bool;
        obj.f6882c = Boolean.valueOf(this.f4249a);
        obj.f6880a = Boolean.valueOf(this.f4250b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f4251c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f4249a == eVar.f4249a && this.f4250b == eVar.f4250b && this.f4251c == eVar.f4251c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f4249a);
        Boolean valueOf2 = Boolean.valueOf(this.f4250b);
        Boolean valueOf3 = Boolean.valueOf(this.f4251c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
