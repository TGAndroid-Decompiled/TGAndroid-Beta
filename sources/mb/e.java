package mb;

import b6.m;
import java.util.Arrays;
import n7.we;
public final class e {
    public final boolean f13625a;
    public final boolean f13626b;
    public final boolean f13627c;

    public e(d dVar) {
        this.f13625a = dVar.f13622a;
        this.f13626b = dVar.f13623b;
        this.f13627c = dVar.f13624c;
    }

    public final we a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f2315a = bool;
        obj.f2316b = Boolean.valueOf(this.f13625a);
        obj.f2317c = Boolean.valueOf(this.f13626b);
        obj.d = bool;
        obj.f2318e = Boolean.valueOf(this.f13627c);
        return new we(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f13625a == eVar.f13625a && this.f13626b == eVar.f13626b && this.f13627c == eVar.f13627c && m.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f13625a);
        Boolean valueOf2 = Boolean.valueOf(this.f13626b);
        Boolean valueOf3 = Boolean.valueOf(this.f13627c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
