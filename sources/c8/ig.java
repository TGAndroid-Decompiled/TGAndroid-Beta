package c8;

import java.util.Map;
import java.util.Set;
public abstract class ig implements k {
    public transient cd f5721a;
    public transient a8.kb f5722b;

    public final Map a() {
        a8.kb kbVar = this.f5722b;
        if (kbVar == null) {
            jg jgVar = (jg) this;
            a8.kb kbVar2 = new a8.kb(jgVar, jgVar.f5736c, 1);
            this.f5722b = kbVar2;
            return kbVar2;
        }
        return kbVar;
    }

    public final Set b() {
        cd cdVar = this.f5721a;
        if (cdVar == null) {
            jg jgVar = (jg) this;
            cd cdVar2 = new cd(jgVar, jgVar.f5736c);
            this.f5721a = cdVar2;
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
        return ((a8.kb) a()).f513b.hashCode();
    }

    public final String toString() {
        return ((a8.kb) a()).f513b.toString();
    }
}
