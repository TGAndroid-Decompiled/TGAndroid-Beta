package i7;

import java.util.Map;
import java.util.Set;

public abstract class g implements u {

    public transient a f10642a;

    public transient wa f10643b;

    public final Map a() {
        wa waVar = this.f10643b;
        if (waVar != null) {
            return waVar;
        }
        h hVar = (h) this;
        wa waVar2 = new wa(hVar, hVar.f10651c, 0);
        this.f10643b = waVar2;
        return waVar2;
    }

    public final Set b() {
        a aVar = this.f10642a;
        if (aVar != null) {
            return aVar;
        }
        h hVar = (h) this;
        a aVar2 = new a(hVar, hVar.f10651c);
        this.f10642a = aVar2;
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return a().equals(((g) ((u) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((wa) a()).f10875b.hashCode();
    }

    public final String toString() {
        return ((wa) a()).f10875b.toString();
    }
}
