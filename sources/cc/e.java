package cc;

import a8.ef;
import java.util.Arrays;
import o6.l;
public final class e {
    public final boolean f6192a;
    public final boolean f6193b;
    public final boolean f6194c;

    public e(d dVar) {
        this.f6192a = dVar.f6189a;
        this.f6193b = dVar.f6190b;
        this.f6194c = dVar.f6191c;
    }

    public final ef a() {
        ?? obj = new Object();
        Boolean bool = Boolean.FALSE;
        obj.f614a = bool;
        obj.f615b = Boolean.valueOf(this.f6192a);
        obj.f616c = Boolean.valueOf(this.f6193b);
        obj.d = bool;
        obj.e = Boolean.valueOf(this.f6194c);
        return new ef(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f6192a == eVar.f6192a && this.f6193b == eVar.f6193b && this.f6194c == eVar.f6194c && l.l(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f6192a);
        Boolean valueOf2 = Boolean.valueOf(this.f6193b);
        Boolean valueOf3 = Boolean.valueOf(this.f6194c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
