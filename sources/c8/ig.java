package c8;

import java.util.Map;
import java.util.Set;
public abstract class ig implements k {
    public transient cd f5723a;
    public transient a8.kb f5724b;

    public final Map a() {
        a8.kb kbVar = this.f5724b;
        if (kbVar == null) {
            jg jgVar = (jg) this;
            a8.kb kbVar2 = new a8.kb(jgVar, jgVar.f5739c, 1);
            this.f5724b = kbVar2;
            return kbVar2;
        }
        return kbVar;
    }

    public final Set b() {
        cd cdVar = this.f5723a;
        if (cdVar == null) {
            jg jgVar = (jg) this;
            cd cdVar2 = new cd(jgVar, jgVar.f5739c);
            this.f5723a = cdVar2;
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
