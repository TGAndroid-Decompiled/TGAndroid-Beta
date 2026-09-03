package mb;

import b6.m;
import java.util.Arrays;
import n7.we;
public final class e {
    public final boolean f13627a;
    public final boolean f13628b;
    public final boolean f13629c;

    public e(d dVar) {
        this.f13627a = dVar.f13624a;
        this.f13628b = dVar.f13625b;
        this.f13629c = dVar.f13626c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f2315a = bool;
        obj.f2316b = Boolean.valueOf(this.f13627a);
        obj.f2317c = Boolean.valueOf(this.f13628b);
        obj.d = bool;
        obj.f2318e = Boolean.valueOf(this.f13629c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f13627a == eVar.f13627a && this.f13628b == eVar.f13628b && this.f13629c == eVar.f13629c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f13627a);
        Boolean valueOf2 = Boolean.valueOf(this.f13628b);
        Boolean valueOf3 = Boolean.valueOf(this.f13629c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
