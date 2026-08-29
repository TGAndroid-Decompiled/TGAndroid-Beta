package j7;

import java.util.Map;
import java.util.Set;
public abstract class g implements u {
    public transient a f11010a;
    public transient xa f11011b;

    public final Map a() {
        xa xaVar = this.f11011b;
        if (xaVar == null) {
            h hVar = (h) this;
            xa xaVar2 = new xa(hVar, hVar.f11024c, 0);
            this.f11011b = xaVar2;
            return xaVar2;
        }
        return xaVar;
    }

    public final Set b() {
        a aVar = this.f11010a;
        if (aVar == null) {
            h hVar = (h) this;
            a aVar2 = new a(hVar, hVar.f11024c);
            this.f11010a = aVar2;
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
        return ((xa) a()).f11257b.hashCode();
    }

    public final String toString() {
        return ((xa) a()).f11257b.toString();
    }
}
