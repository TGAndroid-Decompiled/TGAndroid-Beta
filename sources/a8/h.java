package a8;

import java.util.Map;
import java.util.Set;
public abstract class h implements y {
    public transient b f459a;
    public transient kb f460b;

    public final Map a() {
        kb kbVar = this.f460b;
        if (kbVar == null) {
            i iVar = (i) this;
            kb kbVar2 = new kb(iVar, iVar.f482c, 0);
            this.f460b = kbVar2;
            return kbVar2;
        }
        return kbVar;
    }

    public final Set b() {
        b bVar = this.f459a;
        if (bVar == null) {
            i iVar = (i) this;
            b bVar2 = new b(iVar, iVar.f482c);
            this.f459a = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        return a().equals(((h) ((y) obj)).a());
    }

    public final int hashCode() {
        return ((kb) a()).f513b.hashCode();
    }

    public final String toString() {
        return ((kb) a()).f513b.toString();
    }
}
