package defpackage;

import java.util.Map;
import java.util.Set;
public abstract class ohf implements fdd {
    public transient xze a;
    public transient d3 b;

    public final Map a() {
        d3 d3Var = this.b;
        if (d3Var == null) {
            vhf vhfVar = (vhf) this;
            d3 d3Var2 = new d3(vhfVar, vhfVar.c, (byte) 1);
            this.b = d3Var2;
            return d3Var2;
        }
        return d3Var;
    }

    public final Set b() {
        xze xzeVar = this.a;
        if (xzeVar == null) {
            vhf vhfVar = (vhf) this;
            xze xzeVar2 = new xze(vhfVar, vhfVar.c);
            this.a = xzeVar2;
            return xzeVar2;
        }
        return xzeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fdd)) {
            return false;
        }
        return a().equals(((ohf) ((fdd) obj)).a());
    }

    public final int hashCode() {
        return ((so2) ((d3) a()).d).hashCode();
    }

    public final String toString() {
        return ((so2) ((d3) a()).d).toString();
    }
}
