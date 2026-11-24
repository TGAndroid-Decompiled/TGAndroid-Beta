package defpackage;

import java.util.Map;
import java.util.Set;
public abstract class pjf implements hfd {
    public transient z1f a;
    public transient d3 b;

    public final Map a() {
        d3 d3Var = this.b;
        if (d3Var == null) {
            wjf wjfVar = (wjf) this;
            d3 d3Var2 = new d3(wjfVar, wjfVar.c, (byte) 1);
            this.b = d3Var2;
            return d3Var2;
        }
        return d3Var;
    }

    public final Set b() {
        z1f z1fVar = this.a;
        if (z1fVar == null) {
            wjf wjfVar = (wjf) this;
            z1f z1fVar2 = new z1f(wjfVar, wjfVar.c);
            this.a = z1fVar2;
            return z1fVar2;
        }
        return z1fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hfd)) {
            return false;
        }
        return a().equals(((pjf) ((hfd) obj)).a());
    }

    public final int hashCode() {
        return ((dq2) ((d3) a()).d).hashCode();
    }

    public final String toString() {
        return ((dq2) ((d3) a()).d).toString();
    }
}
