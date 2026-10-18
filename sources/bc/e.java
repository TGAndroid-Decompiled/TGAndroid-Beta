package bc;

import java.util.Arrays;
import n6.l;
import z7.we;
public final class e {
    public final boolean f4253a;
    public final boolean f4254b;
    public final boolean f4255c;

    public e(d dVar) {
        this.f4253a = dVar.f4250a;
        this.f4254b = dVar.f4251b;
        this.f4255c = dVar.f4252c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f6882b = bool;
        obj.f6883c = Boolean.valueOf(this.f4253a);
        obj.f6881a = Boolean.valueOf(this.f4254b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f4255c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f4253a == eVar.f4253a && this.f4254b == eVar.f4254b && this.f4255c == eVar.f4255c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f4253a);
        Boolean valueOf2 = Boolean.valueOf(this.f4254b);
        Boolean valueOf3 = Boolean.valueOf(this.f4255c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
