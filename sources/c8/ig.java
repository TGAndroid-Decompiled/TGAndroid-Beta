package c8;

import java.util.Map;
import java.util.Set;
public abstract class ig implements k {
    public transient cd f4549a;
    public transient a8.lb f4550b;

    public final Map a() {
        a8.lb lbVar = this.f4550b;
        if (lbVar == null) {
            jg jgVar = (jg) this;
            a8.lb lbVar2 = new a8.lb(jgVar, jgVar.f4564c, 1);
            this.f4550b = lbVar2;
            return lbVar2;
        }
        return lbVar;
    }

    public final Set b() {
        cd cdVar = this.f4549a;
        if (cdVar == null) {
            jg jgVar = (jg) this;
            cd cdVar2 = new cd(jgVar, jgVar.f4564c);
            this.f4549a = cdVar2;
            return cdVar2;
        }
        return cdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return a().equals(((ig) ((k) obj)).a());
    }

    public final int hashCode() {
        return ((a8.lb) a()).f533b.hashCode();
    }

    public final String toString() {
        return ((a8.lb) a()).f533b.toString();
    }
}
