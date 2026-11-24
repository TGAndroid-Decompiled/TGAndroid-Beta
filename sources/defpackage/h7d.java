package defpackage;

import java.util.Map;
import java.util.Set;
public abstract class h7d implements red {
    public transient d5d a;
    public transient d3 b;

    public final Map a() {
        d3 d3Var = this.b;
        if (d3Var == null) {
            j7d j7dVar = (j7d) this;
            d3 d3Var2 = new d3(j7dVar, j7dVar.c, (byte) 2);
            this.b = d3Var2;
            return d3Var2;
        }
        return d3Var;
    }

    public final Set b() {
        d5d d5dVar = this.a;
        if (d5dVar == null) {
            j7d j7dVar = (j7d) this;
            d5d d5dVar2 = new d5d(j7dVar, j7dVar.c);
            this.a = d5dVar2;
            return d5dVar2;
        }
        return d5dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof red)) {
            return false;
        }
        return a().equals(((h7d) ((red) obj)).a());
    }

    public final int hashCode() {
        return ((so2) ((d3) a()).d).hashCode();
    }

    public final String toString() {
        return ((so2) ((d3) a()).d).toString();
    }
}
