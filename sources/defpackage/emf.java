package defpackage;

import java.util.Map;
import java.util.Set;
public abstract class emf implements yhd {
    public transient o4f a;
    public transient e3 b;

    public final Map a() {
        e3 e3Var = this.b;
        if (e3Var == null) {
            lmf lmfVar = (lmf) this;
            e3 e3Var2 = new e3(lmfVar, lmfVar.c, (byte) 1);
            this.b = e3Var2;
            return e3Var2;
        }
        return e3Var;
    }

    public final Set b() {
        o4f o4fVar = this.a;
        if (o4fVar == null) {
            lmf lmfVar = (lmf) this;
            o4f o4fVar2 = new o4f(lmfVar, lmfVar.c);
            this.a = o4fVar2;
            return o4fVar2;
        }
        return o4fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yhd)) {
            return false;
        }
        return a().equals(((emf) ((yhd) obj)).a());
    }

    public final int hashCode() {
        return ((lp2) ((e3) a()).d).hashCode();
    }

    public final String toString() {
        return ((lp2) ((e3) a()).d).toString();
    }
}
