package k7;

import java.util.Map;
import java.util.Set;

public abstract class kg implements k {

    public transient ed f14862a;

    public transient i7.wa f14863b;

    public final Map a() {
        i7.wa waVar = this.f14863b;
        if (waVar != null) {
            return waVar;
        }
        lg lgVar = (lg) this;
        i7.wa waVar2 = new i7.wa(lgVar, lgVar.f14872c, 1);
        this.f14863b = waVar2;
        return waVar2;
    }

    public final Set b() {
        ed edVar = this.f14862a;
        if (edVar != null) {
            return edVar;
        }
        lg lgVar = (lg) this;
        ed edVar2 = new ed(lgVar, lgVar.f14872c);
        this.f14862a = edVar2;
        return edVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return a().equals(((kg) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((i7.wa) a()).f10875b.hashCode();
    }

    public final String toString() {
        return ((i7.wa) a()).f10875b.toString();
    }
}
