package defpackage;

import java.util.Map;
import java.util.Set;
public abstract class acd implements ijd {
    public transient w9d a;
    public transient e3 b;

    public final Map a() {
        e3 e3Var = this.b;
        if (e3Var == null) {
            ccd ccdVar = (ccd) this;
            e3 e3Var2 = new e3(ccdVar, ccdVar.c, (byte) 2);
            this.b = e3Var2;
            return e3Var2;
        }
        return e3Var;
    }

    public final Set b() {
        w9d w9dVar = this.a;
        if (w9dVar == null) {
            ccd ccdVar = (ccd) this;
            w9d w9dVar2 = new w9d(ccdVar, ccdVar.c);
            this.a = w9dVar2;
            return w9dVar2;
        }
        return w9dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ijd)) {
            return false;
        }
        return a().equals(((acd) ((ijd) obj)).a());
    }

    public final int hashCode() {
        return ((lp2) ((e3) a()).d).hashCode();
    }

    public final String toString() {
        return ((lp2) ((e3) a()).d).toString();
    }
}
