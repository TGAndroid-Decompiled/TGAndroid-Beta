package j7;

import java.util.Map;
import java.util.Set;
public abstract class kg implements k {
    public transient ed f14008a;
    public transient h7.wa f14009b;

    public final Map a() {
        h7.wa waVar = this.f14009b;
        if (waVar == null) {
            lg lgVar = (lg) this;
            h7.wa waVar2 = new h7.wa(lgVar, lgVar.f14018c, 1);
            this.f14009b = waVar2;
            return waVar2;
        }
        return waVar;
    }

    public final Set b() {
        ed edVar = this.f14008a;
        if (edVar == null) {
            lg lgVar = (lg) this;
            ed edVar2 = new ed(lgVar, lgVar.f14018c);
            this.f14008a = edVar2;
            return edVar2;
        }
        return edVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return a().equals(((kg) ((k) obj)).a());
    }

    public final int hashCode() {
        return ((h7.wa) a()).f10166b.hashCode();
    }

    public final String toString() {
        return ((h7.wa) a()).f10166b.toString();
    }
}
