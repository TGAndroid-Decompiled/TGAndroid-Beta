package l7;

import java.util.Map;
import java.util.Set;
public abstract class g implements u {
    public transient a f11466a;
    public transient xa f11467b;

    public final Map a() {
        xa xaVar = this.f11467b;
        if (xaVar == null) {
            h hVar = (h) this;
            xa xaVar2 = new xa(hVar, hVar.f11479c, 0);
            this.f11467b = xaVar2;
            return xaVar2;
        }
        return xaVar;
    }

    public final Set b() {
        a aVar = this.f11466a;
        if (aVar == null) {
            h hVar = (h) this;
            a aVar2 = new a(hVar, hVar.f11479c);
            this.f11466a = aVar2;
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
        return ((xa) a()).f11694b.hashCode();
    }

    public final String toString() {
        return ((xa) a()).f11694b.toString();
    }
}
