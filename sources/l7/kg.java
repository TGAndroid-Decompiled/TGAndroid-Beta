package l7;

import java.util.Map;
import java.util.Set;
public abstract class kg implements k {
    public transient ed f14867a;
    public transient j7.xa f14868b;

    public final Map a() {
        j7.xa xaVar = this.f14868b;
        if (xaVar == null) {
            lg lgVar = (lg) this;
            j7.xa xaVar2 = new j7.xa(lgVar, lgVar.f14877c, 1);
            this.f14868b = xaVar2;
            return xaVar2;
        }
        return xaVar;
    }

    public final Set b() {
        ed edVar = this.f14867a;
        if (edVar == null) {
            lg lgVar = (lg) this;
            ed edVar2 = new ed(lgVar, lgVar.f14877c);
            this.f14867a = edVar2;
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
        return ((j7.xa) a()).f11257b.hashCode();
    }

    public final String toString() {
        return ((j7.xa) a()).f11257b.toString();
    }
}
