package bc;

import java.util.Arrays;
import n6.l;
import z7.xe;
public final class e {
    public final boolean f4252a;
    public final boolean f4253b;
    public final boolean f4254c;

    public e(d dVar) {
        this.f4252a = dVar.f4249a;
        this.f4253b = dVar.f4250b;
        this.f4254c = dVar.f4251c;
    }

    public final xe a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f6883b = bool;
        obj.f6884c = Boolean.valueOf(this.f4252a);
        obj.f6882a = Boolean.valueOf(this.f4253b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f4254c);
        return new xe(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f4252a == eVar.f4252a && this.f4253b == eVar.f4253b && this.f4254c == eVar.f4254c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f4252a);
        Boolean valueOf2 = Boolean.valueOf(this.f4253b);
        Boolean valueOf3 = Boolean.valueOf(this.f4254c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
