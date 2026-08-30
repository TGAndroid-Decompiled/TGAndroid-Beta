package n7;

import java.util.Map;
import java.util.Set;
public abstract class lg implements k {
    public transient fd f14652a;
    public transient l7.xa f14653b;

    public final Map a() {
        l7.xa xaVar = this.f14653b;
        if (xaVar == null) {
            mg mgVar = (mg) this;
            l7.xa xaVar2 = new l7.xa(mgVar, mgVar.f14666c, 1);
            this.f14653b = xaVar2;
            return xaVar2;
        }
        return xaVar;
    }

    public final Set b() {
        fd fdVar = this.f14652a;
        if (fdVar == null) {
            mg mgVar = (mg) this;
            fd fdVar2 = new fd(mgVar, mgVar.f14666c);
            this.f14652a = fdVar2;
            return fdVar2;
        }
        return fdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return a().equals(((lg) ((k) obj)).a());
    }

    public final int hashCode() {
        return ((l7.xa) a()).f11694b.hashCode();
    }

    public final String toString() {
        return ((l7.xa) a()).f11694b.toString();
    }
}
