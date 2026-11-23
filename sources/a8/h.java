package a8;

import java.util.Map;
import java.util.Set;
public abstract class h implements y {
    public transient b f456a;
    public transient lb f457b;

    public final Map a() {
        lb lbVar = this.f457b;
        if (lbVar == null) {
            i iVar = (i) this;
            lb lbVar2 = new lb(iVar, iVar.f486c, 0);
            this.f457b = lbVar2;
            return lbVar2;
        }
        return lbVar;
    }

    public final Set b() {
        b bVar = this.f456a;
        if (bVar == null) {
            i iVar = (i) this;
            b bVar2 = new b(iVar, iVar.f486c);
            this.f456a = bVar2;
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
        return ((lb) a()).f533b.hashCode();
    }

    public final String toString() {
        return ((lb) a()).f533b.toString();
    }
}
