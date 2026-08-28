package h7;

import java.util.Map;
import java.util.Set;
public abstract class g implements u {
    public transient a f9933a;
    public transient wa f9934b;

    public final Map a() {
        wa waVar = this.f9934b;
        if (waVar == null) {
            h hVar = (h) this;
            wa waVar2 = new wa(hVar, hVar.f9942c, 0);
            this.f9934b = waVar2;
            return waVar2;
        }
        return waVar;
    }

    public final Set b() {
        a aVar = this.f9933a;
        if (aVar == null) {
            h hVar = (h) this;
            a aVar2 = new a(hVar, hVar.f9942c);
            this.f9933a = aVar2;
            return aVar2;
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return a().equals(((g) ((u) obj)).a());
    }

    public final int hashCode() {
        return ((wa) a()).f10166b.hashCode();
    }

    public final String toString() {
        return ((wa) a()).f10166b.toString();
    }
}
