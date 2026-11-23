package c8;

import java.util.Map;
import java.util.Set;
public abstract class ig implements k {
    public transient cd f4826a;
    public transient a8.lb f4827b;

    public final Map a() {
        a8.lb lbVar = this.f4827b;
        if (lbVar == null) {
            jg jgVar = (jg) this;
            a8.lb lbVar2 = new a8.lb(jgVar, jgVar.f4842c, 1);
            this.f4827b = lbVar2;
            return lbVar2;
        }
        return lbVar;
    }

    public final Set b() {
        cd cdVar = this.f4826a;
        if (cdVar == null) {
            jg jgVar = (jg) this;
            cd cdVar2 = new cd(jgVar, jgVar.f4842c);
            this.f4826a = cdVar2;
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
