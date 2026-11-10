package c8;

import java.util.Map;
import java.util.Set;
public abstract class ig implements k {
    public transient cd f5726a;
    public transient a8.kb f5727b;

    public final Map a() {
        a8.kb kbVar = this.f5727b;
        if (kbVar == null) {
            jg jgVar = (jg) this;
            a8.kb kbVar2 = new a8.kb(jgVar, jgVar.f5741c, 1);
            this.f5727b = kbVar2;
            return kbVar2;
        }
        return kbVar;
    }

    public final Set b() {
        cd cdVar = this.f5726a;
        if (cdVar == null) {
            jg jgVar = (jg) this;
            cd cdVar2 = new cd(jgVar, jgVar.f5741c);
            this.f5726a = cdVar2;
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
