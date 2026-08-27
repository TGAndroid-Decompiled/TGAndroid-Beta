package jb;

import af.h;
import java.util.Arrays;
import k7.ve;
import y5.l;

public final class e {

    public final boolean f12888a;

    public final boolean f12889b;

    public final boolean f12890c;

    public e(d dVar) {
        this.f12888a = dVar.f12885a;
        this.f12889b = dVar.f12886b;
        this.f12890c = dVar.f12887c;
    }

    public final ve a() {
        h hVar = new h();
        Boolean bool = Boolean.FALSE;
        hVar.f274a = bool;
        hVar.f275b = Boolean.valueOf(this.f12888a);
        hVar.f276c = Boolean.valueOf(this.f12889b);
        hVar.d = bool;
        hVar.f277e = Boolean.valueOf(this.f12890c);
        return new ve(hVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f12888a == eVar.f12888a && this.f12889b == eVar.f12889b && this.f12890c == eVar.f12890c && l.l(null, null);
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f12888a);
        Boolean boolValueOf2 = Boolean.valueOf(this.f12889b);
        Boolean boolValueOf3 = Boolean.valueOf(this.f12890c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, boolValueOf, boolValueOf2, bool, boolValueOf3, null});
    }
}
