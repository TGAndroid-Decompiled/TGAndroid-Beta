package defpackage;

import java.util.Map;
import java.util.Set;
public abstract class j9d implements sgd {
    public transient f7d a;
    public transient d3 b;

    public final Map a() {
        d3 d3Var = this.b;
        if (d3Var == null) {
            l9d l9dVar = (l9d) this;
            d3 d3Var2 = new d3(l9dVar, l9dVar.c, (byte) 2);
            this.b = d3Var2;
            return d3Var2;
        }
        return d3Var;
    }

    public final Set b() {
        f7d f7dVar = this.a;
        if (f7dVar == null) {
            l9d l9dVar = (l9d) this;
            f7d f7dVar2 = new f7d(l9dVar, l9dVar.c);
            this.a = f7dVar2;
            return f7dVar2;
        }
        return f7dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sgd)) {
            return false;
        }
        return a().equals(((j9d) ((sgd) obj)).a());
    }

    public final int hashCode() {
        return ((dq2) ((d3) a()).d).hashCode();
    }

    public final String toString() {
        return ((dq2) ((d3) a()).d).toString();
    }
}
